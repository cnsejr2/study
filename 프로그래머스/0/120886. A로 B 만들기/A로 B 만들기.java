import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        if (String.valueOf(a).equals(String.valueOf(b))) {
            return 1;
        }
        return 0;
    }
}