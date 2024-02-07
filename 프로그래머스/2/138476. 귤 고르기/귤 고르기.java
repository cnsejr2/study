// 순열
// 리스트 정렬
import java.util.*;

class Solution {

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i : tangerine) {
            // 해당 크기의 귤이 배열에 있다면 +1
            if (map.get(i) != null) {
                int cnt = map.get(i);
                map.put(i, ++cnt);
            } else { // 없다면 새로 추가
                map.put(i, 1);
            }
        }
        
        
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        int cnt = 0; // 다른 종류의 수의 최솟값
        int sum = 0;
        
        for (int i : list) {
            if (i >= k) {
                cnt++;
                break;
            } else {
                k -= i;
                cnt++;
            }
        }

        
        return cnt;
    }
}