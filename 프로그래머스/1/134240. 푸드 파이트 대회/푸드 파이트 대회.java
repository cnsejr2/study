class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        int length = 0;
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] > 1) {
                for (int j = 0; j < food[i] / 2; j++) {
                    answer += String.valueOf(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        String s = sb.reverse().toString();
        return answer + "0" + s;
    }
}