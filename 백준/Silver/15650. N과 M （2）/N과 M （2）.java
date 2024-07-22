import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr;
	static int n, m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		dfs(1, 0);
		
		System.out.println(sb);
		
		
	}

	private static void dfs(int at, int depth) {
		// TODO Auto-generated method stub
		if (depth == m) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for (int i = at; i <= n; i++) {
			arr[depth] = i;
			dfs(i + 1, depth + 1);
		}
	}

}
