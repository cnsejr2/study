/* 문제 이해 10분 
 result[0][0] = 3; 로 적어서 테스트 통과 못함
 result[0][0] += 3; 라고 적어야 했음
*/
class Solution {
    static int[][] result = new int[4][2];
    
    public void sum(int c, int i, int j) {
        if (c == 1) { result[i][j] += 3; }
        if (c == 2) { result[i][j] += 2; }
        if (c == 3) { result[i][j] += 1; }
        if (c == 5) { result[i][j] += 1; }
        if (c == 6) { result[i][j] += 2; }
        if (c == 7) { result[i][j] += 3; }
    }
    
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        for (int i = 0; i < survey.length; i++) {
            if (survey[i].equals("RT")) {
                if (choices[i] < 4) { sum(choices[i], 0, 0); }
                if (choices[i] > 4)  { sum(choices[i], 0, 1); }
            } else if (survey[i].equals("TR")) {
                if (choices[i] < 4) { sum(choices[i], 0, 1); }
                if (choices[i] > 4) { sum(choices[i], 0, 0); }
            } else if (survey[i].equals("CF")) {
                if (choices[i] < 4) { sum(choices[i], 1, 0); }
                if (choices[i] > 4) { sum(choices[i], 1, 1); }
            } else if (survey[i].equals("FC")) {
                if (choices[i] < 4) { sum(choices[i], 1, 1); }
                if (choices[i] > 4)  { sum(choices[i], 1, 0); }
            } else if (survey[i].equals("JM")) {
                if (choices[i] < 4) { sum(choices[i], 2, 0); }
                if (choices[i] > 4) { sum(choices[i], 2, 1); }
            } else if (survey[i].equals("MJ")) {
                if (choices[i] < 4) { sum(choices[i], 2, 1); }
                if (choices[i] > 4) { sum(choices[i], 2, 0); }
            } else if (survey[i].equals("AN")) {
                if (choices[i] < 4) { sum(choices[i], 3, 0); }
                if (choices[i] > 4) { sum(choices[i], 3, 1); }
            } else if (survey[i].equals("NA")) {
                if (choices[i] < 4) { sum(choices[i], 3, 1); }
                if (choices[i] > 4) { sum(choices[i], 3, 0); }
            }
        }

        if (result[0][0] >= result[0][1]) {
            answer += "R";
        } else {
            answer += "T";
        }
         
        if (result[1][0] >= result[1][1]) {
            answer += "C";
        } else {
            answer += "F";
        }
         
        if (result[2][0] >= result[2][1]) {
            answer += "J";
        } else {
            answer += "M";
        }
         
        if (result[3][0] >= result[3][1]) {
            answer += "A";
        } else {
            answer += "N";
        }
        
        
        
        return answer;
    }
}