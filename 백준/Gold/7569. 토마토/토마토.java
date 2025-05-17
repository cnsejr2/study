import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static class Point {
		int z;
		int x;
		int y;
		
		public Point(int z, int x, int y) {
			this.z = z;
			this.x = x;
			this.y = y;
		}
	}
	
	static int[] dx = { -1, 0, 1, 0, 0, 0};
	static int[] dy = { 0, -1, 0, 1, 0, 0};
	static int[] dz = { 0, 0, 0, 0, 1, -1};
	
	static int n, m, h;
	static int[][][] arr;
	static Queue<Point> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		arr = new int[h + 1][n + 1][m + 1];
		
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 1; k <= m; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					if (arr[i][j][k] == 1) {
						queue.add(new Point(i, j, k));
					}
				}
			}
		}
		int r = bfs();
		System.out.println(r);
	}
	
	public static int bfs() {
		
		while (!queue.isEmpty()) {
			Point p = queue.poll();
			
			int cz = p.z;
			int cx = p.x;
			int cy = p.y;
			
			for (int i = 0; i < 6; i++) {
				int nz = cz + dz[i];
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if (nz > 0&& nz <= h && nx > 0 && nx <= n && ny > 0 && ny <= m) {
					if (arr[nz][nx][ny] == 0) {
						queue.add(new Point(nz, nx, ny));
						arr[nz][nx][ny] = arr[cz][cx][cy] + 1;
					}
				}
						
			}
		}
		
		int result = Integer.MIN_VALUE;
		
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= m; k++) {
					if (arr[i][j][k] == 0) {
						return -1;
					}
					result = Math.max(result, arr[i][j][k]);
				}
			}
		}
		
		return result - 1;
		
	}

}
