import java.util.Scanner;

public class Main {
	
	static int n;
	static int[] arr;
	static int[] ans;
	static boolean[] visit;
	static int result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		ans = new int[n];
		visit = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		dfs(0);
		System.out.println(result);
		
		sc.close();
		
		
	}

	private static void dfs(int cnt) {
		// TODO Auto-generated method stub
		if (cnt == n) {
			int sum = 0;
			for (int i = 0; i < n - 1; i++) {
				sum += Math.abs(ans[i] - ans[i + 1]);
			}
			result = Math.max(result,  sum);
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				ans[cnt] = arr[i];
				visit[i] = true;
				dfs(cnt + 1);
				visit[i] = false;
			}
		}
	}

}
