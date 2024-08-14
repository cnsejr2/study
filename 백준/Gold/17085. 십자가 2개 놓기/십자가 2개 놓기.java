import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	static char[][] mat;
	static boolean[][] visit;
	static int count = 1;
	static int[] dx = { -1, 0, 1, 0};
	static int[] dy = {  0, -1, 0, 1};
	static int max = 1;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		mat = new char[n][m];
		visit = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				mat[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == '#') {
					visit = new boolean[n][m];
					
					int tmp = Math.max(i, j);
					
					for (int x = 0; x <= tmp; x++) {
						if (!check(i, j, x)) {
							break;
						}
						
						search(i, j, x);
					}
				}
			}
		}
		System.out.println(max);
	}

	private static boolean check(int y, int x, int size) {
		
		for (int d = 0; d < 4; d++) {
			int nx = x + dx[d] * size;
			int ny = y + dy[d] * size;
			
			if (!(nx >= 0 && nx < m && ny >= 0 && ny < n) 
					|| mat[ny][nx] != '#') {
				return false;
			}
		}
		visit[y + size][x] = true;
		visit[y - size][x] = true;
		visit[y][x + size] = true;
		visit[y][x - size] = true;
		
		return true;
	}
	
	private static void search(int y, int x, int size) {
		// TODO Auto-generated method stub
		int result = 0;
		
		for (int i = x + 1; i < m; i++) {
			if (mat[y][i] == '#') {
				result = Math.max(result, getCrossMaxSize(y, i));
			}
		}
		
		for (int i = y + 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == '#') {
					result = Math.max(result, getCrossMaxSize(i, j));
				}
			}
		}

		max = Math.max(max, crossSize(size) * crossSize(result));
	}

	private static int crossSize(int size) {
		// TODO Auto-generated method stub
		return size * 4 + 1;
	}

	private static int getCrossMaxSize(int y, int x) {
		int result = 1;
		
		while (true) {
			boolean chk = false;
			
			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d] * result;
				int ny = y + dy[d] * result;
				
				if (!(nx >= 0 && nx < m && ny >= 0 && ny < n) 
					|| mat[ny][nx] != '#'
					|| visit[ny][nx]) {
					chk = true;
					break;
				}
			}
			
			if (chk) {
				break;
			}
			result++;
			
		}
		
		return result - 1;
	}

}
