import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n + 1];
		double[] dp = new double[n + 1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextDouble();
		}
		double max = 0;
		for (int i = 1; i <= n; i++) {
			dp[i] = Math.max(dp[i - 1] * arr[i], arr[i]);
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(String.format("%.3f", max));
		
		
		sc.close();

	}

}
