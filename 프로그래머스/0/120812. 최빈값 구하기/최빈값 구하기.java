import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int a : array) {
            if (map.get(a) == null) {
                map.put(a, 1);
            } else {
                int cnt = map.get(a);
                map.put(a, ++cnt);
            }
        }
        int max = -1;
        for (Integer key: map.keySet()) {
			Integer value = map.get(key);
            if (value >= max) {
                max = value;
                answer = key;
            }
		}
        int flag = 0;
        for (Integer key: map.keySet()) {
			Integer value = map.get(key);
            if (value == max) {
                flag++;
                if (flag > 1) {
                    return -1;
                }
            }
		}
        
        return answer;
    }
}