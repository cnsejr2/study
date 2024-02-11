class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int[] dx = { -1, 1, 0, 0}; // 좌 우 상 하
        int[] dy = { 0, 0, 1, -1};
        int x = 0;
        int y = 0;
        for (int i = 0;i < keyinput.length; i++) {
            int nx = 0;
            int ny = 0;
            if (keyinput[i].equals("left")) {
                nx = x + dx[0];
                ny = y + dy[0];
            } else if (keyinput[i].equals("right")) {
                nx = x + dx[1];
                ny = y + dy[1];
            } else if (keyinput[i].equals("up")) {
                nx = x + dx[2];
                ny = y + dy[2];
            } else if (keyinput[i].equals("down")) {
                nx = x + dx[3];
                ny = y + dy[3];
            }
            if (check(nx, ny, board[0], board[1])) {
                x = nx;
                y = ny;
            }
            
            
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
    
    public static boolean check(int x, int y, int xL, int yL) {
        if (x <= xL / 2 && x >= (xL / 2 * -1)) { // x의 좌우 안에 있는지
            if (y <= yL / 2 && y >= (yL / 2 * -1)) { // y의 좌우 안에 있는지
                return true;
            }
        }
        return false;
    }
}