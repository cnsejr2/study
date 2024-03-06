import java.util.*;

class Solution {
    
    public int check(int n) {
        
        switch (n) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
        }
        return 6;
    }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> winNums = new ArrayList<Integer>();
        for (int w : win_nums) {
            winNums.add(w);
        }
        // 0인 숫자가 전부 로또 번호가 아닌 경우 - 최저 순위
        int cnt = 0;
        int zeroCnt = 0;
        for (int l : lottos) {
            if (winNums.contains(l)) {
                cnt++;
            }
            if (l == 0) {
                zeroCnt++;
            }
        }
        int[] answer = new int[2];
        answer[0] = check(cnt + zeroCnt);
        answer[1] = check(cnt);
        
        return answer;
    }
}