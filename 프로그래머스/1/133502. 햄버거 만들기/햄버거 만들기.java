import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> hList = new ArrayList<Integer>();
        for (int i : ingredient) {
            hList.add(i);
            if (hList.size() >= 4) {
                int n = hList.size();
                if (hList.get(n - 1) == 1 && hList.get(n - 2) == 3
                   && hList.get(n - 3) == 2 && hList.get(n - 4) == 1) { // 햄버거 완성
                    for(int j = 0; j < 4; j++) {
                        hList.remove(hList.size() - 1);
                    }
                    answer++;
                }
            }
        }
        
        return answer;
    }
}