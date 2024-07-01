import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	static int n, k;
	static boolean[] visited;
	static String[] arr;
	static ArrayList<String> list;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		
		visited = new boolean[n];
		list = new ArrayList<>();
		
		arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		dfs(0, "");
		System.out.println(list.size());		
		
	}

	private static void dfs(int count, String tmp) {
		// TODO Auto-generated method stub
		if (count == k) { // k개만 뽑는다
			if (!list.contains(tmp)) {
				list.add(tmp);
			}
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(count + 1, tmp + arr[i]);
				visited[i] = false;
			}
		}
		
	}

}
