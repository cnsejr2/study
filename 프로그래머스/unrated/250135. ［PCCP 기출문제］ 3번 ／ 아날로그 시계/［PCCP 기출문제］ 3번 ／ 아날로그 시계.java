/*
    참고 : https://velog.io/@_jake/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-PCCP-%EA%B8%B0%EC%B6%9C%EB%AC%B8%EC%A0%9C-3%EB%B2%88-JavaScript


*/

class Solution {
    
    public int getCount(int h, int m, int s) {
        int mCount = 0;
        int hCount = 0;
        
        mCount += h * 59;
        hCount += h * 60;
        
        int result = 0;
        
        mCount += m;
        hCount += m;
        result -= 1;
        
        int curMDegree = m * 6;
        double curHDegree = 30 * (h % 12) + 0.5 * m;
        boolean condition1 = curMDegree <= 5.9 * s;
        boolean condition2 = curHDegree <= (6 - 1 / 120) * s;
        
        if (condition1) {
            mCount += 1;
        }
        
        if (condition2) {
            hCount += 1;
        }
        
        if (h >= 12) {
            hCount -= 1;
            result -= 1;
        }
        
        result += mCount + hCount;
        
        return result;
        
    }
    
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = getCount(h2, m2, s2) - getCount(h1, m1, s1);
        if (s1 == 0 && m1 == 0) {
            answer += 1;
        }
        return answer;
    }
}