class Solution {
    public String solution(String s) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (!answer.contains(String.valueOf(s.charAt(i)))) {
                answer += s.charAt(i);
            }
        }
        
        return answer;
    }
}