class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] str = s.split(" ");
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Z")) {
                // System.out.println(str[i - 1]);
                answer -= Integer.parseInt(str[i - 1]);
            } else if (!str[i].equals("")) {
                // System.out.println(str[i]);
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}