class Solution {
    public int solution(String s) {
        int answer = 0;
        
        s = s.replaceAll("[a-z|A-Z]", "");
        // 또는 s = s.replaceAll("[^0-9]", "");
        String[] str = s.split("");
        
        for (int i = 0; i < str.length; i++) {
            answer += Integer.valueOf(str[i]);
        }
        
        return answer;
    }
}