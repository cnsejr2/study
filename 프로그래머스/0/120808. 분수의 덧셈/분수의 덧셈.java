/*
출처 : https://velog.io/@osohyun0224/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-Lv.0-%EB%B6%84%EC%88%98%EC%9D%98-%EB%8D%A7%EC%85%88.java

*/

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int num3 = num1 * num2;
        int denum3 = denum1 * num2 + denum2 * num1;
        int max = 1;
        
        // 최대공약수 구하기
        for (int i = 1; i <= num3 && i <= denum3; i++) {
            if (num3 % i == 0 && denum3 % i == 0) {
                max = i;
            }
        }
        answer[0] = denum3 / max;
        answer[1] = num3 / max;
        
        
        return answer;
    }
}