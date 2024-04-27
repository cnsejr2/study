class Solution {
    public boolean solution(int x) {
        int num = x;
        int n = 0;
        while (num != 0) {
            n += num % 10;
            num /= 10;
        }
        
        if (x % n == 0) {
            return true;
        }
        return false;
    }
}