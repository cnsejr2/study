class Solution {
    public int solution(int[] c) {
        int answer = 0;
        int s = c.length;
        if (c[2] - c[1] == c[1] - c[0]) { // 등차수열
            return c[s - 1] + (c[1] - c[0]);
        } else { // 등비수열
            return c[s - 1] * (c[1] / c[0]);
        }
        
    }
}