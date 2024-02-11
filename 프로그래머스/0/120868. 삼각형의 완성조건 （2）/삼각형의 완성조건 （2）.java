import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // 가장 긴 변이 sides에 있는 경우
        Arrays.sort(sides);
        int max = sides[sides.length - 1];
        for (int i = 1; i <= max; i++) {
            if ((sides[0] + i) > max) {
                answer++;
            }
        }
        // 가장 긴 변이 sides에 없는 경우
        for (int i = max + 1; i < sides[0] + sides[1]; i++) {
            answer++;
        }
        
        
        return answer;
    }
}