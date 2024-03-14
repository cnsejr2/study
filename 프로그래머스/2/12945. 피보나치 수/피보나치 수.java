class Solution {
    static int[] arr;
    public int solution(int n) {
        arr = new int[n + 1];

        return fibo(n);
    }
    
    public int fibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        if (arr[n] == 0) {
            arr[n] = fibo(n - 1) + fibo(n - 2);
        } 
        return arr[n]  % 1234567;
    }
}