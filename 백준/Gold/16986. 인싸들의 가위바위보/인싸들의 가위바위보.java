import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int n, k;
	static int[][] map;
	static int[][] people;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		map = new int[n][n];
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		people = new int[3][20];
		for (int i = 1; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 20; j++) {
				people[i][j] = Integer.parseInt(st.nextToken()) - 1;
			}
		}
		
		perm(0);
		System.out.println(0);
		
	}

	private static void perm(int cnt) {
		// TODO Auto-generated method stub
		if (cnt == n) {
			if (playRockPaperScissors()) {
				System.out.println(1);
				System.exit(0);
			}
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				people[0][cnt] = i;
				perm(cnt + 1);
				visited[i] = false;
			}
		}
	}

	private static boolean playRockPaperScissors() {
		// TODO Auto-generated method stub
		// 0 : 지우, 1 : 경희, 2: 민호
		int p1 = 0;
		int p2 = 1;
		int p3 = 2;
		
		int[] playerIdx = new int[3];
		int[] winCnt = new int[3];
		
		while (true) {
			p3 = 3 - p1 - p2;
			// 지우가 이김
			if (winCnt[0] == k) {
				return true;
			}
			// 경희나 민호가 이김
			if (winCnt[1] == k || winCnt[2] == k) {
				return false;
			}
			// 지우가 n번 이상 내야함, 경희, 민호가 20번 이상 내야함
			if (playerIdx[0] == n || playerIdx[1] == 20 || playerIdx[2] == 20) {
				return false;
			}
			
			int winnerPlayer = getWinner(p1, p2, playerIdx);
			winCnt[winnerPlayer]++;
			playerIdx[p1]++;
			playerIdx[p2]++;
			
			p1 = winnerPlayer;
			p2 = p3;
			
		}
	}

	private static int getWinner(int p1, int p2, int[] idx) {
		int p1Turn = people[p1][idx[p1]];
		int p2Turn = people[p2][idx[p2]];
		
		if (map[p1Turn][p2Turn] == 2) {
			return p1;
		} else if (map[p1Turn][p2Turn] == 1) {
			return Math.max(p1,  p2);
		} else {
			return p2;
		}
		
	}

	
}
