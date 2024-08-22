import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int[][] map = new int[51][51];
	static int count;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		for (int i = 1; i <= n; i++) {
			String[] info = br.readLine().split("");
			for (int j = 1; j <= m; j++) {
				map[i][j] = Integer.parseInt(info[j - 1]);
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			int zero = 0;
			
			for (int j = 1; j <= m; j++) {
				if (map[i][j] == 0) {
					zero++;
				}
			}
			int same = 0;
			if (zero <= k && zero % 2 == k % 2) {
				for (int j = 1; j <= n; j++) {
					if (check(map[i], map[j], m)) {
						same++;
					}
				}
			}
			count = Math.max(count, same);
		}
		System.out.println(count);
		
	}

	private static boolean check(int[] arr1, int[] arr2, int m) {
		for (int i = 1; i <= m; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
