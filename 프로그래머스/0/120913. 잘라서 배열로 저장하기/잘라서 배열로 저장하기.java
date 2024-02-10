/*
출처 : https://velog.io/@yuki-kim/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%9E%98%EB%9D%BC%EC%84%9C-%EB%B0%B0%EC%97%B4%EB%A1%9C-%EC%A0%80%EC%9E%A5%ED%95%98%EA%B8%B0-Java
*/

import java.util.*;

class Solution {
    public String[] solution(String s, int n) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < (s.length() / n); i++) {
            answer.add(s.substring((n * i), (n * (i + 1))));
        }
        if (s.length() % n != 0) {
            answer.add(s.substring( (s.length() / n) * n));
        }
        
        return answer.toArray(new String[0]);
    }
}