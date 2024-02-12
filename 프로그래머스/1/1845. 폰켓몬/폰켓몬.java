import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for (int n : nums) {
            if (!list.contains(n)) {
                list.add(n);
            }
        }
        
        if (nums.length / 2 > list.size()) {
            return list.size();
        } else {
            return nums.length / 2;
        }
    }
}