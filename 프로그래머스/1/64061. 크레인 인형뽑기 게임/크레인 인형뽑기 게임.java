import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        int n = board.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int y = moves[i] - 1;
            for (int j = 0; j < n; j++) {
                if (board[j][y] != 0) {
                    int s = stack.isEmpty() ? -1 : stack.peek();
                    if (s == board[j][y]) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(board[j][y]);
                    }
                    board[j][y] = 0;
                    break;
                }
            }
        }
        
        
        
        return answer;
    }
}