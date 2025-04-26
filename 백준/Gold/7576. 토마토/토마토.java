import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato {
	int x;
	int y;
	int day;
	
	public Tomato(int x, int y, int day) {
		this.x = x;
		this.y = y;
		this.day = day;
	}
}

public class Main {

	static int n, m;
	static int[][] map;
	static int[] dx = { -1, 0, 1, 0};
	static int[] dy = { 0, -1, 0, 1};
	
	static Queue<Tomato> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		map = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 1) {
					q.add(new Tomato(i, j, 0));
				}
			}
		}
		
		bfs();
		
	}

	public static void bfs() {
		int day = 0;
		
		while (!q.isEmpty()) {
			Tomato cur = q.poll();
			int x = cur.x;
			int y = cur.y;
			day = cur.day;
			
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if (nx > 0 && nx <= n && ny > 0 && ny <= m) {
					if (map[nx][ny] == 0) {
						map[nx][ny] = 1;
						q.add(new Tomato(nx, ny, day + 1));
					}
				}
			}
		}
		
		if(checkTomato()){
            System.out.println(day);
        } else{
            System.out.println(-1);
        }
		
	}

	public static boolean checkTomato() {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (map[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
