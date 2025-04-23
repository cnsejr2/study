import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static class Pair {
		int x;
		int y;
		int t;
		boolean isSword;
		
		public Pair(int x, int y, int t, boolean isSword) {
			this.x = x;
			this.y = y;
			this.t = t;
			this.isSword = isSword;
		}
	}

	static int n, m, t;
	static int[][] map;
	static int[] dx = { -1, 0, 1, 0};
	static int[] dy = { 0, -1, 0, 1};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		
		map = new int[n + 1][m + 1];
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int cur = bfs();
		
		if (cur != -1 && cur <= t) {
			System.out.println(cur);
		} else {
			System.out.println("Fail");
		}
		
	}
	
	private static int bfs() {
		
		Queue<Pair> q = new ArrayDeque<>();
		q.add(new Pair(1, 1, 0, false));
		
		boolean[][][] visit = new boolean[n + 1][m + 1][2];
		visit[1][1][0] = true;
		
		while (!q.isEmpty()) {
			Pair p = q.poll();
			int x = p.x;
			int y = p.y;
			
			if (x == n && y == m) {
				return p.t;
			}
			
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if (nx > 0 && nx <= n && ny > 0 && ny <= m) {
					if (p.isSword) {
						if (!visit[nx][ny][1]) {
							q.add(new Pair(nx, ny, p.t + 1, true));
							visit[nx][ny][1] = true;
						}
					} else {
						if (!visit[nx][ny][0] && map[nx][ny] != 1) {
							if (map[nx][ny] == 2) {
								q.add(new Pair(nx, ny, p.t + 1, true));
							} else {
								q.add(new Pair(nx, ny, p.t + 1, false));
							}
							visit[nx][ny][0] = true;
						}
					}
				}
			}
		}
	
		return -1;
	}
}
