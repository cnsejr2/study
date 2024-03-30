class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        
        for (int i = 0; i < A.length(); i++) {
            String nStr = "";

            for (int j = A.length() - i; j < A.length(); j++) {
                nStr += A.charAt(j);
            }
            
            for (int j = 0; j < A.length()- i; j++) {
                nStr += A.charAt(j);
            }
            
            if (nStr.equals(B)) {
                return answer;
            }
            answer++;
        }
        
        return answer == A.length() ? -1 : answer;
    }
}