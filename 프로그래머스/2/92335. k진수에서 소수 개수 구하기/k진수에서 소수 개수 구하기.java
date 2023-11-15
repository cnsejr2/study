
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
            /*
            자바에 내장되어있는 Math.sqrt함수를 통해서 2부터 루트n까지의 범위에서 소수를 체크판별해주는 함수다.
            범위가 2부터 루트n까지인 이유는 소수는 1과 자기 자신으로만 나누어지는 숫자이기때문이다.
            */
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