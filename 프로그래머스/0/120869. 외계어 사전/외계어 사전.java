import java.util.*;
// spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 return 1;
class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            boolean isFind = true;
            if (dic[i].length() == spell.length) {
                for (int j = 0; j < spell.length; j++) {
                    if (!dic[i].contains(spell[j])) {
                        isFind = false;
                    } 
                }
                if (isFind) {
                    return 1;
                } 
            }
        }
        
        return 2;
    }
}