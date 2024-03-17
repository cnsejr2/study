class Solution {
    public int solution(int n) {
        int answer = 0;
        long num = n;
        while (true) {
            if (num == 1) {
                return answer;
            }
            answer++;
            if (num % 2 == 0) {
                num = (num / 2);
            } else {
                num = (num * 3) + 1;
            }
        
            if (answer > 500) {
                return -1;
            }
        }
        
    }
}