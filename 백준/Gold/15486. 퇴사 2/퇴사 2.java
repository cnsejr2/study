import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n + 2][2];
		int[] dp = new int[n + 2];
		
		for (int i = 1; i <= n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
	
		
		int max = 0;
		for (int i = 1; i <= n+1; i++) {
			if (max < dp[i]) {
				max = dp[i];
			}
			
			int nxt = i + arr[i][0];
			if (nxt < n + 2) {
				dp[nxt] = Math.max(dp[nxt], max + arr[i][1]);
			}
		}
		System.out.println(dp[n + 1]);
		
		sc.close();

	}

}
