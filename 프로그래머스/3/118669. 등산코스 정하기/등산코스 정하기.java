import java.util.*;

/*
    참고 : https://thdbs523.tistory.com/236
*/

class Solution {
    
    static int[] intensity;
    static boolean[] isSummit;
    static boolean[] isGate;
    static ArrayList<int[]> list[];
    
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        list = new ArrayList[n + 1];
        intensity = new int[n + 1];
        isSummit = new boolean[n + 1];
        isGate = new boolean[n + 1];
        
        for (int i = 0; i <  gates.length; i++) {
            isGate[gates[i]] = true;
        }
        
        for (int i = 0; i < summits.length; i++) {
            isSummit[summits[i]] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < paths.length; i++) {
            int edge1 = paths[i][0];
            int edge2 = paths[i][1];
            int weight = paths[i][2];
            
            // 산봉우리, 출입구 단방향
            if (isSummit[edge2] || isGate[edge1]) {
                list[edge1].add(new int[] {edge2, weight});
            } else if (isSummit[edge1] || isGate[edge2]) {
                list[edge2].add(new int[] {edge1, weight});
            } else {
                list[edge1].add(new int[] {edge2, weight});
                list[edge2].add(new int[] {edge1, weight});
            }
        }
        dijkstra(n, gates, summits);

        Arrays.sort(summits);
        int mount = -1;
        int inten = Integer.MAX_VALUE;

        for (int i : summits) {
            if (intensity[i] < inten) {
                mount = i;
                inten = intensity[i];
            }
        }
                    
        return new int[] { mount, inten };
              
    }
    
    static void dijkstra(int n, int[] gates, int[] summits) {
        Queue<int[]> q = new LinkedList<>();
        Arrays.fill(intensity, Integer.MAX_VALUE);
        
        // 출입구 큐에 넣기
        for (int g : gates) {
            q.offer(new int[] {g, 0});
            intensity[g] = 0;
        }
        
        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int edge = arr[0];
            int weight = arr[1];
            
            // 최소 갱신 안되는 경우 스킬
            if (weight > intensity[edge]) {
                continue;
            }
            
            for (int[] next : list[edge]) {
                int nextEdge = next[0];
                int nextWeight = next[1];
                
                int temp = Math.max(intensity[edge], nextWeight);
                if (intensity[nextEdge] > temp) {
                    intensity[nextEdge] = temp;
                    q.add(new int[] {nextEdge, temp});
                }
                
            }
            
            
        }
        
    }
}