class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            if (diff < min) {
                min = diff;
                answer = array[i];
            } else if (diff == min && array[i] < answer) {
                // 가장 가까운 수가 여러 개일 경우 더 작은 수 return
                answer = array[i];
            }
        }
        
        
        return answer;
    }
}