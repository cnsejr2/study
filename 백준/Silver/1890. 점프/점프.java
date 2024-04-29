import java.util.Scanner;

public class Main {

	static int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int list[][] = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		
		long dp[][] = new long[n + 1][n + 1];
		dp[1][1] = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int next = list[i][j];
				if (next == 0) break;
				if (j + next <= n) {
					dp[i][j + next] += dp[i][j];
				}
				if (i + next <= n) {
					dp[i + next][j] += dp[i][j];
				}
			}
		}
		
		System.out.println(dp[n][n]);
		
		sc.close();

	}

}
