import java.util.*;

class Solution {
    public int solution(int[] n) {
         Arrays.sort(n);
        int size = n.length;
        
        return n[size - 1] * n[size - 2]; 
    }
}