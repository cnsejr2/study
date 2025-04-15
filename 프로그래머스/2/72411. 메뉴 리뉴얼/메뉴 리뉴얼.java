import java.util.*;
import java.util.Comparator;
import java.util.Map.Entry;
class Solution {
    
    static Map<String, Integer> menu = new HashMap<String, Integer>();
    static ArrayList<Integer> list = new ArrayList<>();
    static String[] order;
    static String str = "";
    public String[] solution(String[] orders, int[] course) {
        
        order = orders;

        for (int i = 0; i < orders.length; i++) {
            char[] o = orders[i].toCharArray();
            for (int j = 0; j < o.length; j++) {
                if (!str.contains(String.valueOf(o[j]))) {
                    str += o[j];
                }
            }
        }
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        str = new String(ch);
        ArrayList<String> answerList = new ArrayList<>();
        for (int i = course.length - 1; i >= 0; i--) {
            list = new ArrayList<>();
            menu = new HashMap<String, Integer>();
            comb(0, 0, course[i], str.length());
            if (!menu.isEmpty()) {
                Integer maxValue = Collections.max(menu.values());
                for (Map.Entry<String, Integer> entry : menu.entrySet()) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();

                    if (value == maxValue) {
                        answerList.add(key);
                    }
                }
            }

        }
        Collections.sort(answerList); 
        String[] answer = new String[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
         
        return answer;
    }
    
    public static void count(String chk) {
        int cnt = 0;
        for (String o : order) {
            boolean con = false;
            for (int i = 0; i < chk.length(); i++) {
                if (o.indexOf(chk.charAt(i)) == -1) {
                    con = true;
                    break;
                }
            }
            
            if (!con) {
                cnt++;
            }
        }
        if (cnt >= 2) {
            menu.put(chk, cnt);
        }
    }
    
    public static void comb(int s, int depth, int len, int n) {
        
        if (len == depth) {
            String chk = "";
            for (int i = 0; i < list.size(); i++) {
                chk += str.charAt(list.get(i));
            }
            
            count(chk);
            
            return;
        }
        
        for (int i = s; i < n; i++) {
            list.add(i);
            comb(i + 1, depth + 1, len, n);
            list.remove(list.size() - 1);
        }
        
    }
}