class Solution {
    public int solution(int balls, int share) {
        return comb(balls, share);
    }
    
    public static int comb(int b, int s) {
        if (b == s || s == 0) {
            return 1;
        } 
        return comb((b - 1), (s - 1)) + comb((b - 1), s);
    }
}