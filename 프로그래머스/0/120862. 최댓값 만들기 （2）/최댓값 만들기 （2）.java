class Solution {
    public int solution(int[] n) {
        int answer = Integer.MIN_VALUE;
        
        for (int i = 0; i < n.length; i++) {
            for (int j = (i + 1); j < n.length; j++) {
                if (answer < n[i] * n[j]) {
                    answer = n[i] * n[j];
                }
            }
        }
    
        return answer;
    }
}