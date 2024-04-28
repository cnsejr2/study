import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static class Player implements Comparable<Player> {
		int num;
		int score;
		
		Player(int num, int score) {
			this.num = num;
			this.score = score;
		}
		
		@Override
		public int compareTo(Player o) {
			// TODO Auto-generated method stub
			int result = o.score - this.score;
			
			if (result == 0) {
				result = this.num - o.num;
			}
			return result;
		}
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			if (n == 0 && m == 0) {
				break;
			}
			
			Player players[] = new Player[10001];
			for (int i = 0; i < 10001; i++) {
				players[i] = new Player(i, 0);
			}
			
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < m; j++) {
					int playerNum = Integer.parseInt(st.nextToken());
					players[playerNum].score++;
				}
			}
			
			Arrays.sort(players);
			
			int second = players[1].score;
			for (int i = 1; i < 10001; i++) {
				if (players[i].score == second) {
					sb.append(players[i].num).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
