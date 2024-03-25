import java.util.*;

class Solution {
    
    static int[] dx = { 0, 0, -1, 1}; // 상, 하, 좌, 우 
    static int[] dy = { 1, -1, 0, 0 }; // 상, 하, 좌, 우 
    static int n, m;
    static int[][] visit;
    static int count = 0;
    
    public int solution(String[][] board, int h, int w) {
        
        n = board.length;
        m = board[0].length;
        
        visit = new int[n][m];
        String color = board[h][w];
        dfs(board, h, w, color);
        
        return count;
    }
    public void dfs(String[][] board, int y, int x, String color) {
        visit[y][x] = 1;
        
        for (int i = 0; i < 4; i++) {
            int mx = x + dx[i];
            int my = y + dy[i];
            
            if (mx >= 0 && my >= 0 && mx < m && my < n
               && visit[my][mx] == 0 && board[my][mx].equals(color)) {
                count++;
            }
        }
        
    }
}