import java.util.Scanner;

public class Main {

	static int[] arr;
	static Integer[] dp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		arr = new int[n + 1];
		dp = new Integer[n + 1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		dp[0] = 0;
		dp[1] = arr[1];
		
		if(n > 1) {
			dp[2] = arr[1] + arr[2];
		}
		System.out.println(find(n));
		sc.close();
	}

	private static int find(int n) {
		// TODO Auto-generated method stub
		if (dp[n] == null) {
			dp[n] = Math.max(
					Math.max(find(n - 2), find(n - 3) + arr[n - 1]) + arr[n]
							, find(n - 1));
		}
		return dp[n];
	}

}
