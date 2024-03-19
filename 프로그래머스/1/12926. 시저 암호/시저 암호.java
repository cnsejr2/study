class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                answer += ' ';
            } else {
                char c = ch[i];
                for (int j = 1; j <= n; j++) {
                    c = (char) (ch[i] + 1);
                    if (c == '[') {
                        c = ch[i] = 'A';
                    } else if (c == '{') {
                        c = ch[i] = 'a';
                    } else {
                        ch[i] = c;
                    }

                }
                answer += c;
                
            }
            
        }
        
        return answer;
    }
}