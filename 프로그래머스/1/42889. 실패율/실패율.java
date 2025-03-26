import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0;  i < stages.length; i++) {
            int s = stages[i];
            if (map.containsKey(s)) {
                map.put(stages[i], map.get(s) + 1);   
            } else {
                map.put(stages[i], 1);
            }
        }
        int people = stages.length;
        HashMap<Integer, Double> per = new HashMap<Integer, Double>();
        for (int i = 1; i <= N; i++) {
            int user = map.get(i) == null ? 0 : map.get(i);
            if (people == 0) {
                per.put(i, (double) 0);
            } else {
                per.put(i, (double) user / people);
                people -= user;
            }
        }
        
        List<Integer> keys = new ArrayList<>(per.keySet()); 

		Collections.sort(keys, (v1, v2) -> (per.get(v2).compareTo(per.get(v1)))); 
        int i = 0;
		for (Integer key : keys) {
			answer[i++] = key;
		}
        
        return answer;
    }
}