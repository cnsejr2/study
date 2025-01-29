import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	static ArrayList<Integer> list = new ArrayList<>();
	static Set<String> sList = new HashSet<>();
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		dfs(0);
		
		System.out.println(sb);
		
	}
	
	private static void dfs(int depth) {
		if (m == depth) {
			String s = "";
			for (int i = 0; i < list.size(); i++) {
				s += arr[list.get(i)] + " ";
			}
			
			if (!sList.contains(s)) {
				sList.add(s);
				sb.append(s + '\n');
			}
			return;
		}
		
		for (int i = 0; i < n; i++) {
			list.add(i);
			dfs(depth + 1);
			list.remove(list.size() - 1);
		}
	}

}
