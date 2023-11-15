import java.util.*;

class Solution {
    static ArrayList<Integer>[] childs;
    static int[] Info;
    static int maxSheepCnt = 0;
    
    public int solution(int[] info, int[][] edges) {
        Info = info;
        childs = new ArrayList[info.length];
        
        for (int[] e : edges) {
            int parent = e[0];
            int child = e[1];
            
            if (childs[parent] == null) {
                childs[parent] = new ArrayList<>();
            }
            
            childs[parent].add(child);
        }
        
        List<Integer> list = new ArrayList<>();
        list.add(0);
        dfs(0, 0, 0, list);
        
        return maxSheepCnt;
    }
    
    private static void dfs(int idx, int sheepCnt, int wolfCnt, List<Integer> nextPos) {
        if (Info[idx] == 0) {
            sheepCnt++;
        } else {
            wolfCnt++;
        }
        
        if (wolfCnt >= sheepCnt) {
            return;
        }
        
        maxSheepCnt = Math.max(sheepCnt, maxSheepCnt);
        
        List<Integer> list = new ArrayList<>();
        list.addAll(nextPos);
        list.remove(Integer.valueOf(idx));
        if (childs[idx] != null) {
            for (int child : childs[idx]) {
                list.add(child);
            }
        }
        
        for (int next : list) {
            dfs(next, sheepCnt, wolfCnt, list);
        }
    }
    
}