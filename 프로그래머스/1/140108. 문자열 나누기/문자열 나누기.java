class Solution {
    public int solution(String s) {
        int answer = 0;
        
        boolean isX = true;
        char ch = s.charAt(0);
        int isNotSame = 0;
        int isSame = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isX) { // 기준이 될 x설정
                isX = false;
                ch = s.charAt(i);
                
                isNotSame = 0;
                isSame = 0;
            }
            if (s.charAt(i) != ch) {
                isNotSame++;
            } else {
                isSame++;
            }
            
            if (isNotSame == isSame) {
                answer++;
                isX = true;
            }
        }
        
        if (!isX) {
             answer++;
        }
        
        
        
        return answer;
    }
}