import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static final int INF = 10000000;
	static int[][] cost = new int[101][101];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			str = str.replaceAll(" ", "");
			for (int j = 1; j <= n; j++) {
				cost[i][j] = str.charAt(j - 1) == '1' ? 1 : INF;
			}
			
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					cost[j][k] = Math.min(cost[j][k], cost[j][i] + cost[i][k]);
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				cost[i][j] = cost[i][j] == INF ? 0 : 1;
				System.out.print(cost[i][j] + " ");
			}
			System.out.println();
		}
	}

}
