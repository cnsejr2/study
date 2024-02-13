/*
    출처 : https://nyoung-blog.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%AA%A8%EC%8A%A4%EB%B6%80%ED%98%B8-1-Java
*/

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseString;
        morseString = letter.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word : morseString) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) sb.append(Character.toString(i + 'a'));
            }
        }
        return sb.toString();
    }
}