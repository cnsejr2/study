class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        int size = s.length();
        
        if (size % 2 != 0) {
            return String.valueOf(ch[size / 2]);
        } else {
            return String.valueOf(ch[size / 2 - 1]) + String.valueOf(ch[size / 2]);
        }
    }
}