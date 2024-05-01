import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] jumps;
	static int[][] dp;
	static int n, k;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.valueOf(br.readLine());
		
		jumps = new int[n][2]; // index 0 : 작은 점프, index 1 :큰 점프
		dp = new int[n][2];
		
		for (int i = 0; i < n - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int smallJump = Integer.valueOf(st.nextToken());
			int mediumJump = Integer.valueOf(st.nextToken());
			jumps[i][0] = smallJump;
			jumps[i][1] = mediumJump;
			
		}
		
		k = Integer.valueOf(br.readLine());
		dfs(0, 0, 0);
		int min = dp[n - 1][0] == 0 ? dp[n - 1][1] :
			(dp[n - 1][1] == 0 ? dp[n - 1][0] : Math.min(dp[n - 1][0], dp[n - 1][1]));
		System.out.println(min);
		
	}

	private static void dfs(int i, int j, int l) {
		// TODO Auto-generated method stub
		if (i >= n) { // 돌 밖으로 벗어남
			return;
		}
		if (dp[i][l] == 0) {
			dp[i][l] = j;
		} else {
			if (dp[i][l] < j) {
				return;
			}
			dp[i][l] = j;
		}
		dfs(i + 1, j + jumps[i][0], l);
		dfs(i + 2, j + jumps[i][1], l);
		if (l == 0) {
			dfs(i + 3, j + k, 1);
		}
		
	}

}
