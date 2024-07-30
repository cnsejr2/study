import java.util.Scanner;

public class Main {
	static String s;
	static boolean visit[];
	static int len;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		s = sc.next();
		len = s.length();
		visit = new boolean[51];
		dfs(0, 0, "");

		sc.close();
	}

	private static void dfs(int idx, int n, String ans) {
		// TODO Auto-generated method stub
		if (idx == len) {
			for (int i = 1; i <= n; i++) {
				if (!visit[i]) {
					return;
				}
			}
			System.out.println(ans.trim());
			System.exit(0);
			return;
		}
		String tmp = s.substring(idx, idx + 1);
		int num = Integer.parseInt(tmp);
		if (!visit[num]) {
			visit[num] = true;
			dfs(idx + 1, (num > n) ? num : n, ans + " " + tmp);
			visit[num] = false;
		}
		if (idx < len - 1) {
			tmp = s.substring(idx, idx + 2);
			num = Integer.parseInt(tmp);
			if (num < 51 && !visit[num]) {
				visit[num] = true;
				dfs(idx + 2, (num > n) ? num : n, ans + " " + tmp);
				visit[num] = false;
			}
		}
		
		
	}

}
