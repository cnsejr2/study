import java.util.*;

class Solution {
    
    class Result {
        int cnt; // 행사 가입자 수
        int sale; // 판매액
        
        public Result() {}
        
        public Result(int cnt, int sale) {
            this.cnt = cnt;
            this.sale = sale;
        }
        
        public String toString() {
            return "cnt : " + cnt + ", sale : " + sale;
        }
    }
    
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Result> results = new ArrayList<Result>();
    
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        
        // 1. 이모티콘 각각의 퍼센트 경우의 수
        dfs(users, emoticons, 0, emoticons.length);
        
        results.sort((r1, r2) -> {
            if (r2.cnt != r1.cnt) {
                return Integer.compare(r2.cnt, r1.cnt); // cnt 내림차순
            } else {
                return Integer.compare(r2.sale, r1.sale); // sale 내림차순
            }
        });
        
        answer[0] = results.get(0).cnt;
        answer[1] = results.get(0).sale;
        
        return answer;
    }
    
    public void check(int[][] users, int[] emoticons) {
        Result result = new Result();
        for (int i = 0; i < users.length; i++) {
            int sum = 0; // 이모티콘 구매 비용
            int emoCnt = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) >= users[i][0]) {
                    sum += ((100 - list.get(j)) * 0.01 * emoticons[j]);
                    emoCnt++;
                }
            }

            if (sum >= users[i][1]) { // 이모티콘 구매 비용이 사용자가 지정한 가격보다 큰 경우, 이모티콘 플러스 가입
                result.cnt++;
            } else {
                result.sale += sum;
            }
        }
        
        results.add(result);
    }
    
    public void dfs(int[][] users, int[] emoticons, int n, int depth) {
        if (n == depth) {
            check(users, emoticons); // 해당 케이스일 때 결과 구하기
            return;
        }
        
        for (int i = 1; i <= 4; i++) {
            list.add(i * 10);
            dfs(users, emoticons, n + 1, depth);
            list.remove(list.size() - 1);
        }
    }
}