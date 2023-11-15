/*
    풀이 : https://jangcenter.tistory.com/120
    접근과정 : 
        모든 자식 노드를 탐색 -> dfs
        자식노드에 접근할 수 있게 ArrayList로 설정
        
        다음 탐색 위치 찾기
            현재 노드의 자식 노드들을 visit(앞으로 방문할 노드)에 추가
            노드는 wolfCnt < sheepCnt일 때 방문 가능하고
            방문한 노드는 visit에서 삭제한다. 
            다시 현재 노드의 자식 노드들을 visit에 추가
        
*/

import java.util.*;

class Solution {
    static ArrayList<Integer>[] childs;
    static int[] Info;
    static int maxSheepCnt = 0;
    
    public int solution(int[] info, int[][] edges) {
        
        // 자식 노드 확인
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
        // 현재 노드가 양인지 늑대인지 확인
        if (Info[idx] == 0) { 
            sheepCnt++;
        } else {
            wolfCnt++;
        }
        // 늑대의 수가 양의 수보다 많으면 탐색 중단
        if (wolfCnt >= sheepCnt) {
            return;
        }
    
        maxSheepCnt = Math.max(sheepCnt, maxSheepCnt);
        
        // 다음 탐색 위치 갱신
        List<Integer> visit = new ArrayList<>();
        visit.addAll(nextPos);
        
        // 다음 탐색 목록 중 현재 위치 제외
        visit.remove(Integer.valueOf(idx));
        if (childs[idx] != null) {
            for (int child : childs[idx]) {
                visit.add(child);
            }
        }
        
        // 갈 수 있는 모든 노드 dfs
        for (int next : visit) {
            dfs(next, sheepCnt, wolfCnt, visit);
        }
    }
    
}