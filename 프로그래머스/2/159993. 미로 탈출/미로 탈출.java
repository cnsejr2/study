import java.util.*;

class Solution {
    
    static class Pair {
        int x;
        int y;
        
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    static Queue<Pair> q = new LinkedList<>();
    static int[][] visit;
    static char[][] mat;
    static boolean isLever = false;
    static int mx, my;
    static int gx, gy;
    static int sx, sy;
    
    public int solution(String[] maps) {
        
        mx = maps.length;
        my = maps[0].length();
        
        mat = new char[mx][my];
        
        for (int i = 0; i < mx; i++) {
            for (int j = 0; j < my; j++) {
                mat[i][j] = maps[i].charAt(j);
                if (mat[i][j] == 'E') { gx = i; gy = j; }
                if (mat[i][j] == 'S') { sx = i; sy = j; }
            }
        }
        
        for (int i = 0; i < mx; i++) {
            for (int j = 0; j < my; j++) {
                if (mat[i][j] == 'L') {
                    visit = new int[mx][my];
                    q = new LinkedList<>();
                    bfs(i, j);
                }
            }
        }
        
        if (visit[sx][sy] == 0 || visit[gx][gy] == 0) {
            return -1;
        }
        
        return visit[sx][sy] + visit[gx][gy];
    }
    
    public static void bfs(int x, int y) {
        int[] dx = { -1, 0, 1, 0};
        int[] dy = { 0, -1, 0, 1};
        
        q.add(new Pair(x, y));
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (nx >= 0 && nx < mx && ny >= 0 && ny < my) {
                    if (visit[nx][ny] == 0 && mat[nx][ny] != 'X') {
                        visit[nx][ny] = visit[cur.x][cur.y] + 1;
                        q.add(new Pair(nx, ny));
                    }
                }
            }
        }
    }
    
}