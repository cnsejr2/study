class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int a : array) {
            char[] s = String.valueOf(a).toCharArray();
            for (int i = 0; i < s.length; i++) {
                if (s[i] == '7') {
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}