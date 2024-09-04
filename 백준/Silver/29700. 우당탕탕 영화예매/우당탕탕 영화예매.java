import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);
		
		int[][] map = new int[n][m];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j + k <= m) {
					boolean able = true;
					for (int a = j; a < j + k; a++) {
						if (map[i][a] != 0) {
							able = false;
						}
					}
					if (able) { cnt++; }
				}
			}
		}
		System.out.println(cnt);
		
	}

}
