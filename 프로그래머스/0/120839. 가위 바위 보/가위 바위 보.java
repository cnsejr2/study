class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] s = rsp.split("");
        
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("2")) { // 가위일 때
                answer += "0";
            } else if (s[i].equals("0")) { // 바위일 때
                answer += "5";
            } else if (s[i].equals("5")) { // 보일 때
                answer += "2";
            }
        }
        return answer;
    }
}