import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static int n, m;
	static ArrayList<Integer> list = new ArrayList<>();
	static Set<String> sList = new HashSet<>();
	static HashMap<Integer, Integer> map = new HashMap<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < n; i++) {
			map.put(i,  arr[i]);
		}
		
		dfs(0, 0);
		
		System.out.println(sb);
		
	}
	
	private static void dfs(int s, int depth) {
		if (m == depth) {
			String str = "";
			for (int i = 0; i < list.size(); i++) {
				str += map.get(list.get(i)) + " ";
			}
			if (!sList.contains(str)) {
				sList.add(str);
				sb.append(str + '\n');
			}
			return;
		}
		
		for (int i = s; i < n; i++) {
			if (!list.contains(i)) {
				list.add(i);
				dfs(i + 1, depth + 1);
				list.remove(list.size() - 1);
			}
		}
		
	}

}
