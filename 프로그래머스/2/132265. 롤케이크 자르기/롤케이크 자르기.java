import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int cnt = 0;
        
        HashMap<Integer, Integer> top1 = new HashMap<>();
        for (int i = 0; i < topping.length; i++) {
            top1.put(topping[i], top1.getOrDefault(topping[i], 0) + 1);
        }
        
        
        HashMap<Integer, Integer> top2 = new HashMap<>();
        for (int i = 0; i < topping.length; i++) {
            top2.put(topping[i], top2.getOrDefault(topping[i], 0) + 1);
            
            if (top1.containsKey(topping[i])) {
                if (top1.get(topping[i]) == 1) {
                    top1.remove(topping[i]);
                } else {
                    top1.put(topping[i], top1.get(topping[i]) - 1);
                }
                
            }
            if (top1.size() == top2.size()) {
                cnt++;
            }

        }
        
        
        return cnt;
        
        
    }
}