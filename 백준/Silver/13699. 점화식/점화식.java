import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] dp = new long[36];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i < 36; i++) {
			for (int j = 0; j < i; j++) {
				dp[i] += (dp[j] * dp[i - 1 - j]);
			}
		}
		
		System.out.println(dp[n]);
		
		sc.close();
	}

}
