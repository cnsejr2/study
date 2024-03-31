import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        List<Character> list = new ArrayList<>();
        
        my_string = my_string.toLowerCase();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.charAt(i));
        }
        
        Collections.sort(list);
        
        for (Character c : list) {
            answer += c;
        }
        
        return answer;
    }
}