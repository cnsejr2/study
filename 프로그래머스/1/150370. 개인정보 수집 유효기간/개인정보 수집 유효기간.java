import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < terms.length; i++) {
            String[] term = terms[i].split(" ");
            map.put(term[0], Integer.parseInt(term[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] pri = privacies[i].split(" ");
            int month = map.get(pri[1]);
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
            Date date = null;
            Date toDay = null;
            
            try {
                
                date = dateFormat.parse(pri[0]); 
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                cal.add(Calendar.MONTH, month);
                String tDate = dateFormat.format(cal.getTime());
                
                date = dateFormat.parse(tDate);
                toDay = dateFormat.parse(today);
                
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int compare = date.compareTo(toDay);
            if (compare <= 0) {
                list.add(i + 1);
            }
            
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}