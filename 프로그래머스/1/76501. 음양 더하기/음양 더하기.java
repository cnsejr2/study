class Solution {
    public int solution(int[] a, boolean[] s) {
        int answer = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (s[i]) {
                answer += a[i];
            } else {
                answer -= a[i];
            }
        }
        return answer;
    }
}