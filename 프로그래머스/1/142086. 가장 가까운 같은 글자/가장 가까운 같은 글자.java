class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        answer[0] = -1;
        char[] ch = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (ch[i] == ch[j]) {
                    answer[i] = (i - j);
                }
            }
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        
        
        return answer;
    }
}