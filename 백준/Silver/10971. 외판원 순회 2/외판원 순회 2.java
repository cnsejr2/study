import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] map;
	static boolean[] visit;
	static ArrayList<Integer> list = new ArrayList<>();
	static int min = Integer.MAX_VALUE;
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1];
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		perm(0);
		
		System.out.println(min);

	}
	
	private static void perm(int depth) {
		
		if (depth == n) {
			int sum = 0;
			list.add(list.get(0));
			for (int i = 0; i < list.size() - 1; i++) {
				int x = list.get(i);
				int y = list.get(i + 1);
				if (map[x][y] == 0) {
					list.remove(list.size() - 1);
					return;
				} else {
					sum += map[x][y];
				}
			}
			list.remove(list.size() - 1);
			min = Math.min(sum, min);
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				list.add(i);
				perm(depth + 1);
				visit[i] = false;
				list.remove(list.size() - 1);
			}
		}
		
	}

}
