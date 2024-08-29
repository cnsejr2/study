import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int n, m;
	static int result;
	static int[][] map;
	static boolean[] check;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		map = new int[n][m];
		
		check = new boolean[m];
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(s[j]);
			}
		}

		dfs(0, 0);
		
		System.out.println(result);
		
	}

	private static void dfs(int start, int depth) {
		// TODO Auto-generated method stub
		if (depth == 3) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int temp = 0;
				for (int j = 0; j < m; j++) {
					if (check[j]) {
						temp = Math.max(temp, map[i][j]);
					}
				}
				sum += temp;
			}
			result = Math.max(sum, result);
			return;
		}
		
		for (int i = start; i < m; i++) {
			if (!check[i]) {
				check[i] = true;
				dfs(i + 1, depth + 1);
				check[i] = false;
			}
		}
	}

	
	
}
