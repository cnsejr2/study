/*
    출처 : https://velog.io/@ro_sie/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-JAVA-%EC%97%B0%EC%86%8D%EB%90%9C-%EC%88%98%EC%9D%98-%ED%95%A9
*/

class Solution {
    public int[] solution(int num, int total) {
        
        int[] answer = new int[num];
        int start = (total/num) - ((num - 1)/2);
        
        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }
     
        
        return answer;
    }
}