class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            int num = 0;
            if (s[1].equals("+")) {
                num = Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
            } else {
                num = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
            }
            if (num != Integer.parseInt(s[4])) {
                answer[i] = "X";
            } else {
                answer[i] = "O";
            }
        }
        
        
        return answer;
    }
}