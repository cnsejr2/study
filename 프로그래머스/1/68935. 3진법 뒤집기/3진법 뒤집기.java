import java.util.*;

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.append(n % 3);
            n = n / 3;
        }
    
        int answer = 0;
        int power = 1;
        
        for (int i = sb.length() - 1; i >= 0; i--) {
            answer += (sb.charAt(i) - '0') * power;
            power *= 3;
        }
        
        return answer;
    }
}