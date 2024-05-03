import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < speeds.length; i++) {
            int d = (100 - progresses[i]) / speeds[i];
            int n = (100 - progresses[i]) % speeds[i] == 0 ? 0 : 1;
            d += n;
        
            if (!queue.isEmpty()) {
                if (queue.peek() < d) {
                    list.add(queue.size());
                    queue.clear();
                } 
            } 
            queue.offer(d);
            
        }
        
        list.add(queue.size());
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}