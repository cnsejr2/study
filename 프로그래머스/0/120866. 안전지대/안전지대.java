import java.util.*;

// dfs 생각
class Solution {
    public int solution(int[][] board) {
        ArrayList<int[]> list = new ArrayList<>();
        int answer = 0;
        int[] dx = { 0, 1, -1, 0, -1, 1, 1, -1};
        int[] dy = { 1, 0, 0, -1, -1, 1, -1, 1};
        
        int bn = board.length;
        int by = board[0].length;
    
        
        for(int i = 0; i < bn; i++){
            for(int j = 0; j < by; j++){
                if(board[i][j] == 1){
                    int[] temp = {i,j};
                    list.add(temp);
                } 
            }
        }
        
        for(int i = 0 ; i < list.size(); i++){
            int n = list.get(i)[0];
            int m = list.get(i)[1];
            for (int k = 0; k < 8; k++){
                int nx = n + dx[k];
                int ny = m + dy[k];
                if (nx >= 0 && ny >= 0 && nx <= bn - 1 && ny <= bn - 1)
                    board[nx][ny] = 1;
            }
        }
        
        
        for (int i = 0; i < bn; i++) {
            for (int j = 0; j < by; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
            
        return answer;
    }
}