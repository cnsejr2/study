import java.util.*;

class Solution {
    
    static ArrayList<String> list = new ArrayList<>();
    static boolean[] visit;
    
    public String[] solution(String[][] tickets) {
        visit = new boolean[tickets.length];
        
        dfs(0, "ICN", "ICN", tickets);
        
        Collections.sort(list);
        
        return list.get(0).split(" ");
    }
    
    public static void dfs(int depth, String now, String path, String[][] tickets) {
        if (depth == tickets.length) {
            list.add(path);
            return;
        }
        
        for (int i = 0; i < visit.length; i++) {
            if (!visit[i] && now.equals(tickets[i][0])) {
                visit[i] = true;
                dfs(depth + 1, tickets[i][1], path + " " + tickets[i][1], tickets);
                visit[i] = false;
            }
        }
    }
}