import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] dp = new int[r + w + 1][r + w + 1];
		
		dp[1][1] = 1;
		for (int i = 2; i <= r + w; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}
		
		int sum = 0;
		for (int i = 0; i < w; i++) {
			for (int j = 0; j <= i; j++) {
				sum += dp[r + i][c + j];
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
