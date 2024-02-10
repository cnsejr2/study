import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int n = i; n <= j; n++) {
            String[] s = String.valueOf(n).split("");
            
            for (int q = 0; q < s.length; q++) {
                if (k == Integer.parseInt(s[q])){
                    answer++;
                }
            }
        }
        return answer;
    }
}