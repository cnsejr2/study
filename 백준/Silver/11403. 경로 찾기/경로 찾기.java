import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] cost = new int[n + 1][n + 1];
		
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			str = str.replaceAll(" ", "");
			for (int j = 1; j <= n; j++) {
				cost[i][j] = str.charAt(j - 1) == '1' ? 1 : 0;
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if (cost[j][i] == 1 && cost[i][k] == 1) {
						cost[j][k] = 1;
					}
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(cost[i][j] + " ");
			}
			System.out.println();
		}
	}

}
