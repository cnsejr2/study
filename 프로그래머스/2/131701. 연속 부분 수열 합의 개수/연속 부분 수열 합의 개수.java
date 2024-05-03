import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 2; i++) {
            for (int e : elements) {
                list.add(e);
            }
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = i; j < i + elements.length; j++) {
                sum += list.get(j);
                set.add(sum);
            }
        }
        
        return set.size();
    }
}