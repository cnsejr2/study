import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[10001][4];
		dp[1][1] = 1; dp[2][1] = 1; dp[2][2] = 1;
		dp[3][1] = 1; dp[3][2] = 1; dp[3][3] = 1;
		
		for (int i = 4; i <= 10000; i++) {
			dp[i][1] = dp[i - 1][1];
			dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
			dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i - 3][3];
		}
		
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			System.out.println(dp[t][1] + dp[t][2] + dp[t][3]);
		}
		
		sc.close();
		

	}

}
