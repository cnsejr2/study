import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        
        List<Character> chList = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            chList.add(ch[i]);
        }
        Collections.sort(chList, Collections.reverseOrder());
        
        for (int i = 0; i < chList.size(); i++) {
            answer += chList.get(i);
        }
        
        return answer;
    }
}