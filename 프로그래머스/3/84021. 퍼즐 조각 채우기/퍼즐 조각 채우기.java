import java.util.*;
// 출처 : https://tmdrl5779.tistory.com/206
class Pair {
    int x; 
    int y;
    
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    
    static int[] dx = { -1, 0, 1, 0};
    static int[] dy = { 0, -1, 0, 1};
    
    public int solution(int[][] game_board, int[][] table) {

        boolean[][] visitTable = new boolean[table.length][table.length];
        boolean[][] visitBoard = new boolean[game_board.length][game_board.length];
        List<List<Pair>> boardList = new ArrayList<>();
        List<List<Pair>> tableList = new ArrayList<>();
        
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == 1 && !visitTable[i][j]) {
                    bfs(i, j, visitTable, table, 1, tableList);
                }
                
                if (game_board[i][j] == 0 && !visitBoard[i][j]) {
                    bfs(i, j, visitBoard, game_board, 0, boardList);
                }
            }
        }

        return findBlock(boardList, tableList);
    }
    
    public static int findBlock(List<List<Pair>> board, List<List<Pair>> table) {
        int size = 0;
        int tableLen = table.size();
        int boardLen = board.size();
        
        boolean[] visitBoard = new boolean[boardLen];
        for (int i = 0; i < tableLen; i++) {
            List<Pair> tablePoints = table.get(i);
            for (int j = 0; j < boardLen; j++) {
                List<Pair> boardPoints = board.get(j);
                
                if (tablePoints.size() == boardPoints.size() && !visitBoard[j]) {
                    if (isRotate(boardPoints, tablePoints)) {
                        size += tablePoints.size();
                        visitBoard[j] = true;
                        break;
                    }
                }
            }
        }
        return size;
    }
    
    public static boolean isRotate(List<Pair> board, List<Pair> table) {
        boolean isCollect = false;

        board.sort((o1, o2) -> {
            return o1.x > o2.x ? 1 : o1.x < o2.x ? -1 : Integer.compare(o1.y, o2.y);
        });

        for (int i = 0; i < 4; i++){ //table퍼즐 0, 90, 180, 270도 회전

            table.sort((o1, o2) -> {
                return o1.x  > o2.x ? 1 : o1.x < o2.x ? -1 : Integer.compare(o1.y, o2.y);
            });
            int nearZeroX = table.get(0).x;
            int nearZeroY = table.get(0).y;

            for (int j = 0; j < table.size(); j++){
                table.get(j).x -= nearZeroX;
                table.get(j).y -= nearZeroY;
            }


            boolean isCollectPoint = true;
            for (int j = 0; j < board.size(); j++){ //좌표 비교
                Pair boardPoint = board.get(j);
                Pair tablePoint = table.get(j);

                if (boardPoint.x != tablePoint.x || boardPoint.y != tablePoint.y){
                    isCollectPoint = false;
                    break;
                }
            }

            if (isCollectPoint) {
                isCollect = true;
                break;
            } else { //90도 회전 : x,y -> y, -x
                for(int j = 0; j < table.size(); j++){
                    int temp = table.get(j).x;
                    table.get(j).x = table.get(j).y;
                    table.get(j).y = -temp;
                }
            }
        }
        return isCollect;

        
    }
    
    public static void bfs(int x, int y, boolean[][] visit, int[][] graph,
                          int state, List<List<Pair>> list) {
        
        Queue<Pair> queue = new LinkedList<>();
        visit[x][y] = true;
        queue.add(new Pair(x, y));
        List<Pair> subList = new ArrayList<>();
        subList.add(new Pair(0, 0));
        
        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            int curX = cur.x;
            int curY = cur.y;
            
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                if (nx >= 0 && nx < graph.length && ny >= 0 && ny < graph.length) {
                    
                    if (!visit[nx][ny] && graph[nx][ny] == state) {
                        visit[nx][ny] = true;
                        queue.add(new Pair(nx, ny));
                        subList.add(new Pair(nx - x, ny - y));
                    }
                    
                }
            }
            
        }
        list.add(subList);
        
    }
    
}