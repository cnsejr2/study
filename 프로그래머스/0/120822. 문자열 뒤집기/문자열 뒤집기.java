class Solution {
    public String solution(String str) {
        String answer = "";
        
        char[] m = str.toCharArray();
        
        for (int i = m.length - 1; i >= 0; i--) {
            answer += m[i];
        }
        return answer;
    }
}