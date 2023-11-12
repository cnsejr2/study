class Solution {
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;
        
        int n = board.length;
        
        int[][] mat = new int[n + 1][n + 1];
        
        int x1 = -1, y1 = -1, x2 = -1, y2 = -1;
        for (int i = 0; i < skill.length; i++) {
            x1 = skill[i][1];
            y1 = skill[i][2];
            x2 = skill[i][3] + 1;
            if (x2 > n) { x2 = n; }
            y2 = skill[i][4] + 1;
            if (y2 > n) { y2 = n; }
            int d = skill[i][5];
            if (skill[i][0] == 1) {
                mat[x1][y1] += (d * -1); mat[x1][y2] += d;
                mat[x2][y1] += d; mat[x2][y2] += (d * -1);
            } else {
                mat[x1][y1] += d; mat[x1][y2] += (d * -1);
                mat[x2][y1] += (d * -1); mat[x2][y2] += d;
            }
        }
        
        
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 1; j < mat[i].length; j++) {
                mat[j][i] += mat[j  - 1][i];
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 1; j < mat[i].length; j++) {
                mat[i][j] += mat[i][j - 1];
            }
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] += mat[i][j];
                if (board[i][j] > 0) {
                    answer++;
                }
            }
        }
    
        
        
        return answer;
    }
}