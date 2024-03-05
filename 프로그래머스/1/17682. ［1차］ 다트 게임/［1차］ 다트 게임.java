class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String d1 = dartResult.replaceAll("[D|S|T|#|\\*]", " ");
        String[] num = d1.split(" ");
        int[] nArr = new int[3];
        String[] cArr = new String[3];
        int i = 0;
        for (String s : num) {
            if (!s.equals("")) {
                nArr[i] = Integer.parseInt(s);
                i++;
            }
        }
        
        
        String d2 = dartResult.replaceAll("[0-9]", "-");
        String[] ch = d2.split("-");
        i = 0;
        for (int j = 0; j < ch.length; j++) {
            if (!ch[j].equals("")) {
                cArr[i] = ch[j];
                if (ch[j].contains("*") && i != 0) {
                    cArr[i - 1] += "*";
                }
                i++;
            } 
        }
        
        for (int j = 0; j < nArr.length; j++) {
            char[] c = cArr[j].toCharArray();
            int origin = nArr[j];
            for (int k = 0; k < c.length; k++) {
                if (c[k] == 'S') {
                    nArr[j] *= 1;
                } else if (c[k] == 'D') {
                    nArr[j] *= origin;
                } else if (c[k] == 'T') {
                    nArr[j] *= (origin * origin);
                } else if (c[k] == '*') {
                    nArr[j] *= 2;
                } else if (c[k] == '#') {
                    nArr[j] *= -1;
                } 
            }
            answer += nArr[j];
        }
        
        
        return answer;
    }
}