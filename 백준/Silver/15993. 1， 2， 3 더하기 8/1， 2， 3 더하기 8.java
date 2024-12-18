import java.util.Scanner;

public class Main {
	
	static final int mod = 1000000009;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] dp = new long[100001][2];
		dp[1][1] = 1; dp[2][0] = 1; dp[2][1] = 1;
		dp[3][0] = 2; dp[3][1] = 2;
		for (int i = 4; i <= 100000; i++) {
			dp[i][0] = (dp[i - 1][1] + dp[i - 2][1] + dp[i - 3][1]) % mod;
			dp[i][1] = (dp[i - 1][0] + dp[i - 2][0] + dp[i - 3][0]) % mod;
		}
		
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			long odd = dp[t][1] % mod;
			long even = dp[t][0] % mod;
			
			System.out.println(odd + " " + even);
		}
		
		sc.close();

	}

}
