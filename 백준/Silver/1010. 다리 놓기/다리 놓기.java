import java.util.Scanner;

public class Main {
	static int[][] dp = new int[30][30];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		for (int i = 0; i < k; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			System.out.println(comb(m, n));
		}
		
		
		sc.close();
	}

	private static int comb(int n, int r) {
		if (dp[n][r] > 0) {
			return dp[n][r];
		}
		
		if (n == r || r == 0) {
			return dp[n][r] = 1;
		}
		
		return dp[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
		
	}

}
