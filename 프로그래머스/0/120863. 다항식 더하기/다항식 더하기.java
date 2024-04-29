import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] p = polynomial.split(" ");
        
        int x = 0;
        int n = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].contains("x")) {
                String s = p[i].replace("x", "");
                if (s.length() == 0) {
                    x++;
                } else {
                    x += Integer.parseInt(s);
                }
            } else {
                if (!p[i].contains("+")) {
                    n += Integer.parseInt(p[i]);
                }
            }
        }
        if (x > 0) {
            if (x == 1) {
                answer += "x";
            } else {
                answer += (x + "x");
            }
            if (n > 0) {
                answer += " + ";
            }
        }
        if (n > 0) {
            answer += n;
        }        
        return answer;
    }
}