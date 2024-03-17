// Math.abs(minDif)
import java.util.*;


class Solution {
    public int[] solution(int[] list, int n) {
        Arrays.sort(list);
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (Math.abs(n - list[i]) <= Math.abs(n - list[j])) {
                    int tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
        
        return list;
        
    }
}