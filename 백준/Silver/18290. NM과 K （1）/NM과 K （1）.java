import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n, m, k;
	static int[][] map;
	static boolean[][] visit;
	static int result = Integer.MIN_VALUE;
	static int[] dx = { -1, 0, 1, 0};
	static int[] dy = { 0, -1, 0, 1};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
	
		map = new int[n][m];
		visit = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0, 0, 0);
		
		System.out.println(result);
	}
	
	private static void dfs(int x, int y, int cnt, int r) {
		if (cnt == k) {
			result = Math.max(result, r);
			return;
		}
		
		for (int i = x; i < n; i++) {
			for (int j = y; j < m; j++) {
				if (!visit[i][j]) {
					if (check(i, j)) {
						visit[i][j] = true;
						dfs(x, y, cnt + 1, r + map[i][j]);
						visit[i][j] = false;
					}
				}
			}
		}
		
	}

	private static boolean check(int x, int y) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
				if (visit[nx][ny]) {
					return false;
				}
			}
			
		}
		return true;
	}

}
