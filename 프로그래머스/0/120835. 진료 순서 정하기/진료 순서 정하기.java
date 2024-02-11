import java.util.*;

class Solution {
    public int[] solution(int[] eme) {
        int[] answer = new int[eme.length];
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < eme.length; i++) {
            list.add(eme[i]);
        }
        Collections.sort(list, Comparator.reverseOrder());
        
        for (int i = 0; i < eme.length; i++) {
            answer[i] = list.indexOf(eme[i]) + 1;
        }
         
        return answer;
    }
}