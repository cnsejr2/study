import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dp[] = new int[n + 1]; // 최소 횟수 저장
		int before[] = new int[n + 1]; // 경로 저장
		
		String str = "";
		
		dp[1] = 0;
		
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			before[i] = i - 1;
			
			if (i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
				dp[i] = dp[i / 3] + 1;
				before[i] = i / 3;
			}
			if (i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
				dp[i] = dp[i / 2] + 1;
				before[i] = i / 2;
			}	
		}
		System.out.println(dp[n]);
		
		while (n > 0) {
			str += n + " ";
			n = before[n];
		}
		System.out.print(str);
		sc.close();
	}

}
