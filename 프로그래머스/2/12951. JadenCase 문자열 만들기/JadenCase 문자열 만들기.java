class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 0) {
    			answer += str[i].substring(0, 1).toUpperCase();
    			answer += str[i].substring(1, str[i].length()).toLowerCase();
    			answer += " ";
            } else {
                answer += " ";
            } 
        }

        // 입력 받은 문자열의 맨 마지막이 " " 라면 바로 answer 반환
        if(s.substring(s.length() - 1, s.length()).equals(" ")){
            return answer;
        }
    	
    	// 맨 마지막 " " 제거하고 answer 반환
        return answer.substring(0, answer.length()-1);

    }
}