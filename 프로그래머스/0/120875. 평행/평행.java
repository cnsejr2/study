/*
    출처 : https://velog.io/@shin75492/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4JAVA-%ED%8F%89%ED%96%89
*/

class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        
        
        if ((double) (y2 - y1) / (x2 - x1) == (double) (y4 - y3) / (x4 - x3)) {
            return 1;
        }
        
        if ((double) (y3 - y1) / (x3 - x1) == (double) (y2 - y4) / (x2 - x4)) {
            return 1;
        }
        
        if ((double) (y4 - y1) / (x4 - x1) == (double) (y2 - y3) / (x2 - x3)) {
            return 1;
        }
        
        return 0;
        
    }
}