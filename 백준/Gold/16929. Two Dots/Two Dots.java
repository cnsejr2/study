import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static int n, m, sx, sy;
	static int cnt = 0;
	static int[] dx = { -1, 0, 1, 0};
	static int[] dy = { 0, -1, 0, 1};
	static char[][] mat;
	static boolean[][] visit;
	static Set<Character> set = new HashSet<Character>();
	static char c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		mat = new char[n + 1][m + 1];
		visit = new boolean[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for (int j = 1; j <= m; j++) {
				mat[i][j] = str.charAt(j - 1);
				set.add(mat[i][j]);
			}
		}
		
		Iterator<Character> iter = set.iterator();	
		while (iter.hasNext()) {
			c = iter.next();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					if (mat[i][j] == c && !visit[i][j]) {
						sx = i; sy = j;
						dfs(i, j, 1);
						if (cnt != 0) {
							System.out.println("Yes");
							return;
						}
					}
				}
			}
		}

		System.out.println("No");
		

	}
	private static void dfs(int x, int y, int count) {
		// TODO Auto-generated method stub
		visit[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx > 0 && nx <= n && ny > 0 && ny <= m) {
				if (mat[nx][ny] == c) {
					if (!visit[nx][ny]) {
						visit[nx][ny] = true;
						dfs(nx, ny, count + 1);
						visit[nx][ny] = false;
					} else {
						if (nx == sx && ny == sy && count >= 4) {
							cnt++;
						}
					}
				}
				
			}
		}
		
	}

}
