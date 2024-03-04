import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        int num = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=  num) {
                list.add(arr[i]);
                num = arr[i];
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}