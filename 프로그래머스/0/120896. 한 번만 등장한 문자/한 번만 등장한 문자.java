import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), 0);
            }
        }
        
        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
              if (m.getValue() == 1) {
                  list.add(m.getKey());
              }
        }
        
        Collections.sort(list);
        
        for (Character c : list) {
            answer += c;
        }
        
        return answer;
    }
}