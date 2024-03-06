/*
    출처 : https://velog.io/@jp-share/%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%88%AB%EC%9E%90-%EC%A7%9D%EA%BF%8DJava
*/

class Solution {
    public String solution(String X, String Y) {
        
        StringBuilder answer = new StringBuilder();
        
        int[] x = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] y = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for (int i = 0; i < X.length(); i++) {
           x[X.charAt(i) - '0'] += 1;
        }
        for (int i = 0; i < Y.length(); i++) {
           y[Y.charAt(i) - '0'] += 1;
        }

        for(int i = 9; i >= 0; i--){
            for(int j = 0; j < Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        
        if (answer.toString().length() == 0) {
           return "-1";
        } else if (answer.toString().charAt(0) == '0') {
           return "0";
        }
        
        return answer.toString();
    }
}