/*
    dfs 생각
    시간초과 2H 풀이 후  효율성 케이스 1개 런타임에러 발생
*/
import java.util.*;
class Solution {
    
    static int[] dx = { -1, 0, 1, 0};
    static int[] dy = { 0, -1, 0, 1};
    static int[][] visit;
    // static int[][] mat;
    static int cnt = 0;
    static int n, m;
    public int solution(int[][] land) {
        int answer = 0;
        n = land.length;
        m = land[0].length;
        // mat = new int[n + 1][m + 1];
        visit = new int[n + 1][m + 1];
        
        // mat = land.clone();
        int k = 1;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] > 0 && visit[i][j] == 0) {
                    cnt++;
                    dfs(land, i, j, k);
                    list.add(cnt);
                    cnt = 0;
                    k++;
                }
            }
        }
        
        int max = -1;
        for (int i = 0; i < m; i++) {
            List<Integer> result = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (visit[j][i] != 0) {
                    if (!result.contains(visit[j][i])) {
                        result.add(visit[j][i]);
                    }
                }
            }
            int sum = 0;
            for (int z = 0; z < result.size(); z++) {
                sum += list.get(result.get(z));
            }
            if (max < sum) { max = sum; }
        }
        
        
        return max;
    }
    
    public void dfs(int[][] land, int x, int y, int k) {
        visit[x][y] = k;
        
        for (int i = 0; i < 4; i++) {
            int mx = dx[i] + x;
            int my = dy[i] + y;
            
            if (mx >= 0 && my >= 0 && mx < n && my < m) {
                if (land[mx][my] == 1 && visit[mx][my] == 0) {
                    cnt++;
                    dfs(land, mx, my, k);
                }
            }
            
        }
    }
}