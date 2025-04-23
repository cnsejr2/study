import java.util.*;

class Solution {
    
    static class Rect {
        int x1, x2, y1, y2;
        
        public Rect(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
    
    static int x, y;
    static List<Rect> rectList;
    static int[] dx = { -1, 0, 1, 0};
    static int[] dy = { 0, -1, 0, 1};
    
    public int solution(int[][] rectangle, int cX, int cY, int iX, int iY) {

        int[][] map = new int[102][102];
        rectList = new ArrayList<>();
        for (int i = 0; i < rectangle.length; i++) {
            int sx = rectangle[i][0] * 2;
            int sy = rectangle[i][1] * 2;
            int ex = rectangle[i][2] * 2;
            int ey = rectangle[i][3] * 2;
            
            for (int y = sy; y <= ey; y++) {
                for (int x = sx; x <= ex; x++) {
                    map[y][x] = -1;
                }
            }
            rectList.add(new Rect(sx, sy, ex, ey));
        }
        
        return bfs(map, cX * 2, cY * 2, iX * 2, iY * 2);

    }
    
    public static int bfs(int[][] map, int x, int y, int tx, int ty) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y, 1});
        map[y][x] = 1;
        
        while (!q.isEmpty()) {
            int[] p = q.poll();
            int px = p[0];
            int py = p[1];
            int move = p[2];
            
            if (px == tx && py == ty) {
                return (move / 2);
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                
                if (map[ny][nx] < 0 && isBoundary(nx, ny)) {
                    map[ny][nx] = move + 1;
                    q.add(new int[] {nx, ny, move + 1});
                }
            }
        }
        return -1;
    }
    
    public static boolean isBoundary(int x, int y) {
        for (Rect r : rectList) {
            if (r.x1 < x  && r.y1 < y && r.x2 > x && r.y2 > y) {
                return false;
            }
        }
        return true;
    }
}