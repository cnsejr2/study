import java.util.*;

class Solution {
    public int solution(String s) {
        String[] arr = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replaceAll(arr[i], String.valueOf(i));
            }
        }
        
        
        return Integer.parseInt(s);
    }
}