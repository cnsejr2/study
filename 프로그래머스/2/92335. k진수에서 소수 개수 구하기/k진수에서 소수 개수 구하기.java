
/* 1H30M 문제풀이 시작
2H 00M 풀기 싫어함
2H 37M 테스트 케이스 1개(테스트1) 실패
*/
import java.util.*;

class Solution {

    public int solution(int n, int k) {
        int answer = 0;
        
        // 진수 변환
        String sNum = Integer.toString(n, k);
        
        String[] pNum = sNum.split("0");
        for (String p : pNum) {
            if (!p.equals("")) {
                Long num = Long.parseLong(p.trim());
                answer += isPrime(num);
            }
        }

        
        return answer;
    }
    
    public int isPrime(Long n) {
        if (n > 1) {
            // for (Long i = 2L; i <= n / 2; i++) { // 테스트 케이스 1번 시간초과
            //   if (n % i == 0) {
            //       return 0;
            //   }
            // }
            for (Long i = 2L; i <= (int)Math.sqrt(n); i++) {
              if (n % i == 0) {
                  return 0;
              }
            }
            return 1;
        } 
        return 0;
    }
}