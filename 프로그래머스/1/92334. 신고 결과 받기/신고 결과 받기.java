import java.util.*;

// 58M : 시간초과

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        int n = id_list.length;
        int[][] mat = new int[n][n];
        
        for (String st : report) {
            String[] s = st.split(" ");
            int sendId = -1;
            int recId = -1;
            
            for (int i = 0; i < n; i++) {
                if (id_list[i].equals(s[0])) {
                    sendId = i;
                } else if (id_list[i].equals(s[1])) {
                    recId = i;
                }
            }
            
            mat[sendId][recId] = 1;
        }
        
        int[] arr = new int[n];
        boolean[] check = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[j][i] == 1) {
                    arr[i]++;
                    if (arr[i] >= k) {
                        check[i] = true;
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && check[j]) {
                    answer[i]++;
                }
            }
        }
        

       
        
        return answer;
    }
}