import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        String s = my_string.replaceAll("[a-z]", "");
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(i) - '0';
        }
        Arrays.sort(answer);
        
        return answer;
    }
}