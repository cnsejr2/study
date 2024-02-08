/*
    1. 주어진 문자열 배열(babbling)의 각 값에서 발음할 수 있는 문자열(str)과 일치하는 문자열이 있다면 공백으로 바꾼다.
    2. trim() 메소드로 앞뒤의 공백을 제거한다.
    3. 공백을 제거한 문자열의 길이가 0이라면(= 조합된 단어) answer++을 한다.
    출처: https://dhdh-study.tistory.com/115 [dh.log:티스토리]
*/

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            // 네가지 발음을 최대 한 번씩 사용이여서 for문 사용
            for (int j = 0; j < str.length; j++) {
                babbling[i] = babbling[i].replace(str[j], " ");
            }
            
            if (babbling[i].trim().length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}