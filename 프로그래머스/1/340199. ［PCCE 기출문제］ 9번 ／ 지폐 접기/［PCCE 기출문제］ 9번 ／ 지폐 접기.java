import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int minWal = Math.min(wallet[0], wallet[1]);
        int maxWal = Math.max(wallet[0], wallet[1]);
        
        int minBill = Math.min(bill[0], bill[1]);
        int maxBill = Math.max(bill[0], bill[1]);
        
        while (minBill > minWal || maxBill > maxWal) {
            maxBill /= 2;
            int tempMin = minBill;
            int tempMax = maxBill;
            minBill = Math.min(tempMin, tempMax);
            maxBill = Math.max(tempMin, tempMax);
            answer++;
        }
        
        return answer;
    }
}