class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String str1 : str) {
            int n = Integer.parseInt(str1);
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        } 
        answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}