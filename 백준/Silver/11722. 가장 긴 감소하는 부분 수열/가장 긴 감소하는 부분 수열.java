import java.util.Scanner;

public class Main {
	
	static int[] arr;
	static int[] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		arr = new int[n];
		dp = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			findArr(i);
		}
		
		int max = dp[0];
		for (int i = 0; i < n; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
		sc.close();
	}

	private static int findArr(int n) {
		// TODO Auto-generated method stub
		if (dp[n] == 0) {
			dp[n] = 1;
			
			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] > arr[n]) {
					dp[n] = Math.max(dp[n], findArr(i) + 1);
				}
			}
		}
		
		return dp[n];
	}

}
