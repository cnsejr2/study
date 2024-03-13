// 시간초과

class Solution {
    public int solution(int n) {
        int answer = 0;
        int now = Integer.bitCount(n);

        while (true) {
            n++;
            int next = Integer.bitCount(n);

            if (now == next) {
                return n;
            }
        }
    }
}