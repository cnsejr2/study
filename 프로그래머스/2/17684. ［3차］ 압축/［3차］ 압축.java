import java.util.*;

class Solution {
    public int[] solution(String msg) {
        
        HashMap<String, Integer> map = new HashMap<>();
        int cnt = 0;
        for (cnt = 0; cnt <= 26; cnt++) {
            map.put(String.valueOf((char) ('A' + cnt)), cnt + 1);
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < msg.length();) {
            int j = i + 1;
            int index = 0;
            for (;j <= msg.length(); j++) {
                String str = msg.substring(i, j);
                if (map.getOrDefault(str, 0) == 0) {
                    map.put(str, cnt++);
                    break;
                }
                index++;
            }
            String str = msg.substring(i, j - 1);
            list.add(map.get(str));
            i += index;
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}