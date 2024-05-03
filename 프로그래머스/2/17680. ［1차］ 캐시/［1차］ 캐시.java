import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> list = new ArrayList<String>();
        
        for (String c : cities) {
            c = c.toUpperCase();

            if (!list.contains(c)) { // 캐시에 없다면

                if (cacheSize > 0) {
                    if (list.size() >= cacheSize) { // 캐시가 다 차있는 경우
                        list.remove(0); // 가장 오랫동안 참조되지 않은 도시를 삭제
                    }

                    list.add(c);
                }

                answer += 5;
            } else { // 캐시에 있다면
                list.remove(c); // 기존 기록 삭제
                list.add(c); // 다시 재참조
                answer++;
            }
            

        }
        
        return answer;
    }
}