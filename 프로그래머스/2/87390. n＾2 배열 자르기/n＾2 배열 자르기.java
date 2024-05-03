class Solution {
    public int[] solution(int n, long left, long right) {
        long size = right - left + 1L;
        int[] answer = new int[(int)size];
        int k = 0;
        for (long i = left; i <= right; i++) {
            long x = i / (long) n;
            long y = i % (long) n;
            if (x >= y) {
                answer[k] = (int) x + 1;
            } else {
                answer[k] = (int) y + 1;
            }
            k++;
        }
        
        
        return answer;
    }
}