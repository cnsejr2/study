import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	static ArrayList<Integer> list = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		dfs(1, 0);
		
		System.out.println(sb);

	}

	private static void dfs(int s, int depth) {
		// TODO Auto-generated method stub
		if (m == depth) {
			for (int i = 0; i < list.size(); i++) {
				sb.append(list.get(i) + " ");
			}
			sb.append('\n');
			return;
		}
		
		for (int i = s; i <= n; i++) {
			list.add(i);
			dfs(i, depth + 1);
			list.remove(list.size() - 1);
		}
		
	}

}
