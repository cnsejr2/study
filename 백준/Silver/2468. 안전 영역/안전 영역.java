import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { 1, -1, 0, 0};
	static int[] dy = { 0, 0, -1, 1};
	static ArrayList<Integer> result;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		result = new ArrayList<Integer>();
		int maxHeight = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] > maxHeight) {
					maxHeight = map[i][j];
				}
			}
		}
		for (int h = 0; h <= maxHeight; h++) {
			int count = 0;
			visited = new boolean[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(map[i][j] > h  && visited[i][j] == false) {
						count++;
						dfs(i, j, h);
					}
				}
			}
			result.add(count);
		}
		bw.write(Collections.max(result) + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

	private static void dfs(int x, int y, int h) {
		// TODO Auto-generated method stub
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
				if (map[nx][ny] > h && visited[nx][ny] == false) {
					dfs(nx, ny, h);
				}
			}
		}
	}

}
