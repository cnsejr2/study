import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static class Pair {
		int x;
		int y;
		int cnt;
		
		public Pair(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	
	static int[] dx = { -1, 0, 1, 0};
	static int[] dy = { 0 , -1, 0, 1};
	
	static int n, m, result;
	static char[][] arr;
	static Queue<Pair> person;
	static Queue<Pair> fire;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int test = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < test; t++) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			arr = new char[n][m];
			fire = new LinkedList<>();
			person = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				String s = br.readLine();
				for (int j = 0; j < m; j++) {
					arr[i][j] = s.charAt(j);
					if (arr[i][j] == '*') {
						fire.add(new Pair(i, j, 0));
					}
					if (arr[i][j] == '@') {
						person.add(new Pair(i, j, 0));
					}
				}
			}
			
			result = 0;
			bfs();
			if (result != 0) {
				sb.append(result + "\n");
			} else {
				sb.append("IMPOSSIBLE\n");
			}
			
			
		}

		System.out.println(sb.toString());
	}
	
	private static void bfs() {
		
		while (!person.isEmpty()) {
			
			int size = fire.size();
			for (int i = 0; i < size; i++) {
				Pair temp = fire.poll();
				for (int d = 0; d < 4; d++) {
					int nx = temp.x + dx[d];
					int ny = temp.y + dy[d];
					
					if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
						if (arr[nx][ny] == '.' || arr[nx][ny] == '@') {
							arr[nx][ny] = '*';
							fire.add(new Pair(nx, ny, 0));
						}
					}
				}
			}
			
			size = person.size();
			for (int i = 0; i < size; i++) {
				Pair temp = person.poll();
				for (int d = 0; d < 4; d++) {
					int nx = temp.x + dx[d];
					int ny = temp.y + dy[d];
					
					if (!(nx >= 0 && nx < n && ny >= 0 && ny < m)) {
						result = temp.cnt + 1;
						return;
					}
					
					if (arr[nx][ny] == '.') {
						arr[nx][ny] = '@';
						person.add(new Pair(nx, ny, temp.cnt + 1));
					}
				}
			}
			
		}
		
	}

}
