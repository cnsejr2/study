class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long m = 0;
        
        for (int i = 1; i <= count; i++) {
            m += (price * i);
        }

        if (money >= m) {
            return 0;
        }
        
        
        return m - money;
    }
}