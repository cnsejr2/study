class Solution {
    public int solution(String[] bab) {
        int answer = 0;
        
        String[] str = { "aya", "ye", "woo", "ma" };
        String[] str2 = { "ayaaya", "yeye", "woowoo", "mama" };
        
        for (String b : bab) {
            boolean isFlag = true;
            for (String s : str2) {
                if (b.contains(s)) {
                    isFlag = false;
                    break;
                }
            } 
            
            if (isFlag) {
                for (String s : str) {
                    b = b.replace(s, " ");
                }

                if (b.trim().length() == 0) {
                    answer++;
                }
            }
        
        }
        
        return answer;
    }
}