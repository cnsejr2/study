import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int n = 0;
        for (int i = score.length - 1; i >= 0; i--) {
            n++;
            if (n == m) {
                answer += (score[i] * m);
                n = 0;
            }
        }
        
        return answer;
    }
}