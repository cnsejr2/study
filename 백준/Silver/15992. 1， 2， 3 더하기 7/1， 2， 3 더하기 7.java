import java.util.Scanner;

public class Main {
	static final int mod = 1000000009;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] dp = new long[1001][1001];
		dp[1][1] = 1; dp[2][1] = 1; dp[2][2] = 1;
		dp[3][1] = 1; dp[3][2] = 2; dp[3][3] = 1;
		
		for (int i = 4; i <= 1000; i++) {
			for (int j = 2; j < i; j++) {
				dp[i][j] = (dp[i - 1][j - 1] + dp[i - 2][j - 1] + dp[i - 3][j - 1]) % mod;
			}
			dp[i][i] = 1;
		}
		for (int i = 0; i < n; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			System.out.println(dp[n1][n2]);
		}
		
		sc.close();

	}

}
