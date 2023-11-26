// 문제 이해 10분 


class Solution {
       
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[][] result = new int[4][2];
        for (int i = 0; i < survey.length; i++) {
            if (survey[i].equals("RT")) {
                if (choices[i] == 1) { result[0][0] += 3; }
                if (choices[i] == 2) { result[0][0] += 2; }
                if (choices[i] == 3) { result[0][0] += 1; }
                if (choices[i] == 5) { result[0][1] += 1; }
                if (choices[i] == 6) { result[0][1] += 2; }
                if (choices[i] == 7) { result[0][1] += 3; }
            } else if (survey[i].equals("TR")) {
                if (choices[i] == 1) { result[0][1] += 3; }
                if (choices[i] == 2) { result[0][1] += 2; }
                if (choices[i] == 3) { result[0][1] += 1; }
                if (choices[i] == 5) { result[0][0] += 1; }
                if (choices[i] == 6) { result[0][0] += 2; }
                if (choices[i] == 7) { result[0][0] += 3; }
            } else if (survey[i].equals("CF")) {
                if (choices[i] == 1) { result[1][0] += 3; }
                if (choices[i] == 2) { result[1][0] += 2; }
                if (choices[i] == 3) { result[1][0] += 1; }
                if (choices[i] == 5) { result[1][1] += 1; }
                if (choices[i] == 6) { result[1][1] += 2; }
                if (choices[i] == 7) { result[1][1] += 3; }
            } else if (survey[i].equals("FC")) {
                if (choices[i] == 1) { result[1][1] += 3; }
                if (choices[i] == 2) { result[1][1] += 2; }
                if (choices[i] == 3) { result[1][1] += 1; }
                if (choices[i] == 5) { result[1][0] += 1; }
                if (choices[i] == 6) { result[1][0] += 2; }
                if (choices[i] == 7) { result[1][0] += 3; }
            } else if (survey[i].equals("JM")) {
                if (choices[i] == 1) { result[2][0] += 3; }
                if (choices[i] == 2) { result[2][0] += 2; }
                if (choices[i] == 3) { result[2][0] += 1; }
                if (choices[i] == 5) { result[2][1] += 1; }
                if (choices[i] == 6) { result[2][1] += 2; }
                if (choices[i] == 7) { result[2][1] += 3; }
            } else if (survey[i].equals("MJ")) {
                if (choices[i] == 1) { result[2][1] += 3; }
                if (choices[i] == 2) { result[2][1] += 2; }
                if (choices[i] == 3) { result[2][1] += 1; }
                if (choices[i] == 5) { result[2][0] += 1; }
                if (choices[i] == 6) { result[2][0] += 2; }
                if (choices[i] == 7) { result[2][0] += 3; }
            } else if (survey[i].equals("AN")) {
                if (choices[i] == 1) { result[3][0] += 3; }
                if (choices[i] == 2) { result[3][0] += 2; }
                if (choices[i] == 3) { result[3][0] += 1; }
                if (choices[i] == 5) { result[3][1] += 1; }
                if (choices[i] == 6) { result[3][1] += 2; }
                if (choices[i] == 7) { result[3][1] += 3; }
            } else if (survey[i].equals("NA")) {
                if (choices[i] == 1) { result[3][1] += 3; }
                if (choices[i] == 2) { result[3][1] += 2; }
                if (choices[i] == 3) { result[3][1] += 1; }
                if (choices[i] == 5) { result[3][0] += 1; }
                if (choices[i] == 6) { result[3][0] += 2; }
                if (choices[i] == 7) { result[3][0] += 3; }
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