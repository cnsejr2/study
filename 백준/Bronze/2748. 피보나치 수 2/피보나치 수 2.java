import java.util.Scanner;

public class Main {

	static long[] dp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp = new long[n + 1];

		System.out.println(fibo(n));
		
		sc.close();
	}

	private static long fibo(int n) {
		if (n == 0 || n == 1) {
			return dp[n] = n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		
		return dp[n] = fibo(n - 1) + fibo(n - 2);
	}

}
