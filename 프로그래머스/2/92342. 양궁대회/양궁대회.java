/*
    풀이 출처 : https://record-developer.tistory.com/124
    dfs를 생각함 
        -> 모든 과녁을 방문하지만, true / false가 아닌 점수로 표시해야 한다고 생각 
            => res를 int[] 로 설정
    DFS :완전 탐색을 기본으로 하는 그래프 순회 기법으로 가능한 모든 경로를 탐색한다.
        불필요한 경로를 사전에 차단하는 행동이 없다. 따라서 자원 소모가 심하다.
    Backtracking : 경로를 찾아가는 도중에 해가 되지 않을 것 같은 경로가 갔다면 더 가지 않고 되돌아온다.
                    불필요한 경로를 조기 차단하기 때문에 확인해야 하는 경로 수를 줄일 수 있다.
*/

class Solution {
    
    static private int[] res = new int[11];
    static private int[] lion = { -1};
    static private int max = Integer.MIN_VALUE;
    
    public int[] solution(int n, int[] info) {
        back(0, n, info);
        if (max == -1) {
            lion = new int[1];
            lion[0] = -1;
        }
        return lion;
    }
    
    public static void back(int depth, int n, int[] info) {
        // 화살을 다 꽂았을 때(종료조건)
        if (depth == n) {
            int diff = score(info);
            if (max <= diff) {
                max = diff;
                lion = res.clone();
            }
            return;
        }
        // i과녁에 라이언이 화살을 더 많이 맞추면 반복문 종료 (백트래킹)
        for (int i = 0; i < info.length && res[i] <= info[i]; i++) {
            res[i] += 1;
            back(depth + 1, n, info);
            res[i] -= 1;
        }
    }
    
    public static int score(int[] info) {
        int apeach = 0;
        int lion = 0;
        for (int i = 0; i < res.length; i++) {
            if (info[i] == 0 && res[i] == 0) { continue; }
            if (info[i] >= res[i]) {
                apeach += (10 - i);
            } else {
                lion += (10 - i);
            }
        }
        int diff = lion - apeach;
        if (diff <= 0) return -1;
        return diff;
    }
}