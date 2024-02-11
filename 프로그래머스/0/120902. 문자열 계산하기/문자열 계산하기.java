import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 0;
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == '+') {
               list.add(String.valueOf(num));
               list.add("+");
               num = 0;
           } else if (s.charAt(i) == '-') {
               list.add(String.valueOf(num));
               list.add("-");
               num = 0;
           } else if (s.charAt(i) != ' ') {
               if (num != 0) {
                   num *= 10;
               } 
               num += s.charAt(i) - '0';
           }
        }
        list.add(String.valueOf(num));
        answer = Integer.parseInt(list.get(0));
        for (int i = 1; i < list.size(); i += 2) {
            if (list.get(i).equals("+")) {
                answer += Integer.parseInt(list.get(i + 1));
            } else if (list.get(i).equals("-")) {
                answer -= Integer.parseInt(list.get(i + 1));
            }
        }
        
        return answer;
    }
}