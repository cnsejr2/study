import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            int p = words[i - 1].length() - 1;
            if (words[i - 1].charAt(p) != words[i].charAt(0)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } else {
                if (list.contains(words[i])) {
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    break;
                } else {
                    list.add(words[i]);
                }
            }
        }

        return answer;
    }
}