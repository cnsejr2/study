import java.util.Scanner;

public class Main {
	
	static final int mod = 1000000009;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] dp = new long[1000001];
		dp[1] = 1; dp[2] = 2; dp[3] = 4;
		for (int i = 4; i <= 1000000; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % mod;
		}
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			System.out.println(dp[num]);
		}
		
		
		sc.close();

	}

}
