import java.util.Scanner;

public class Main {
	
	static final int mod = 1000000009;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long[100001];
		
		dp[1] = 1; dp[2] = 2; dp[3] = 2;
		dp[4] = 3; dp[5] = 3; dp[6] = 6;
		for (int i = 7; i <= 100000; i++) {
			dp[i] = (dp[i - 2] + dp[i - 4] + dp[i - 6]) % mod;
		}
		
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			System.out.println(dp[t]);
		}
		
		sc.close();

	}

}
