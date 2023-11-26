import java.util.*;
/*
    시간 초과
*/
class Solution {
    
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        
        long sum1 = 0; long sum2 = 0;
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        
        for (int q : queue1) {
            sum1 += q;
            q1.add(q);
        }
        
        for (int q : queue2) {
            sum2 += q;
            q2.add(q);
        }
        
        // 두 리스트에 담긴 모든 원소의 합이 홀수인 경우 -1 반환
        if ((sum1 + sum2) % 2 != 0) { return -1; }
        
        int cnt = 0;
        while (cnt <= (queue1.length * 4)) {
            if (sum1 > sum2) {
                int n = q1.poll();
                sum1 -= n;
                sum2 += n;
                q2.add(n);
            } else if (sum1 < sum2) {
                int n = q2.poll();
                sum2 -= n;
                sum1 += n;
                q1.add(n);
            } else if (sum1 == sum2) {
                answer = cnt;
                break;
            }
            cnt++;
        }
        
        return answer;
    }
}