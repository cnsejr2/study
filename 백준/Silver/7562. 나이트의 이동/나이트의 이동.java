import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int i;
	static int x1, x2, y1, y2;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = { 1, 2, 2, 1, -1, -2, -2, -1};
	static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for (int k = 1; k <= t; k++) {
			i = Integer.parseInt(br.readLine());
			
			arr = new int[i][i];
			visited = new boolean[i][i];
			
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			
			bfs();
			sb.append(arr[x2][y2]).append("\n");
			
		}
		System.out.println(sb);
	}
	private static void bfs() {
		// TODO Auto-generated method stub
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x1, y1});
		visited[x1][y1] = true;
		
		while (!q.isEmpty()) {
			int[] now = q.poll();
			int nx = now[0];
			int ny = now[1];
			
			for (int k = 0; k < 8; k++) {
				int ox = nx + dx[k];
				int oy = ny + dy[k];
				
				if (ox >= 0 && oy >= 0 &&ox < i && oy < i) {
					if (!visited[ox][oy]) {
						q.add(new int[] {ox, oy});
						arr[ox][oy] = arr[nx][ny] + 1;
						visited[ox][oy] = true;
					}
				}
			}
		}
	}

}
