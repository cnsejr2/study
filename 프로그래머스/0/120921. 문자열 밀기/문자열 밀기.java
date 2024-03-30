class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String str = A + A;
        
        for (int i = 0; i < A.length(); i++) {
            if (B.equals(str.substring(A.length() - i, str.length() - i))) {
                return answer;
            }
            answer++;
        }
        
        return -1;
    }
}