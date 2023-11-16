import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int count;
	static int m;
	static int n;
	static int k;
	static int[][] matrix;
	static boolean[][] visited;
	static int[] dx = { 1, -1, 0, 0}; // 좌 우 하 상
	static int[] dy = { 0, 0, -1, 1}; // 좌 우 하 상
	static int result;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
		
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			matrix = new int[m][n];
			visited = new boolean[m][n];
			int sx = 0;
			int sy = 0;
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				matrix[x][y] = 1;
			}
			
			result = 0;
			for (int j = 0; j < m; j++) {
				for (int z = 0; z < n; z++) {
					if (matrix[j][z] == 1 && visited[j][z] == false) {
						result++;
						dfs(j, z);
					}
				}
			}
			sb.append(result).append('\n');
		}
		System.out.println(sb);
		
	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
				if (matrix[nx][ny] == 1 && visited[nx][ny] == false) {
					dfs(nx, ny);
				}		
			}
		}
		
	}

}
