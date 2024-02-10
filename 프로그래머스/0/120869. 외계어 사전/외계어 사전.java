import java.util.*;
// spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 return 1;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for (int i = 0; i < dic.length; i++) {
            char[] d = dic[i].toCharArray();
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            
            for (int k = 0; k < spell.length; k++) {
                map.put(spell[k].charAt(0), 1); // spell에 담긴 단어를 한번씩만 사용
            }
            boolean isFind = true;
            for (int j = 0; j < d.length; j++) {
                if (map.get(d[j]) != null)  {
                    if (map.get(d[j]) > 0) {
                        map.put(d[j], 0);
                    } else { // 해당 단어를 2번 사용한 경우
                        isFind = false; 
                    }
                } else { // 단어가 없는 경우
                    isFind = false; 
                }
            }
            for (Map.Entry<Character,Integer> m : map.entrySet()) {
                if (m.getValue() == 1) {
                    isFind = false;
                }
            }
            
        
            if (isFind) {
                return 1;
            }
        }
        return 2;
    }
}