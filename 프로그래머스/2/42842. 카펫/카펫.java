/*
    출처 : 
    https://easybrother0103.tistory.com/110
*/


class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for (int i = 3; i <= sum; i++) {
            int j = sum / i;
            
            if (j >= 3 && sum % i == 0) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                
                int center = (col - 2) * (row - 2);
                
                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}