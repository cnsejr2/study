class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ", -1);
        
        for (int j = 0; j < str.length; j++) {
            char[] ch = str[j].toCharArray();
            String str2 = "";
            for (int i = 0; i < ch.length; i++) {
                if (i % 2 == 0) {
                    str2 += Character.toUpperCase(ch[i]);
                } else {
                    str2 += Character.toLowerCase(ch[i]);
                }
            }
            answer += str2;
            if (j != str.length - 1) {
                answer += " ";
            }
        }
         
        return answer;
    }
}