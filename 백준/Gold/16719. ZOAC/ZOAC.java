import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Character> list;
	static String str;
	static StringBuilder sb = new StringBuilder();
	static boolean[] visit;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		visit = new boolean[str.length()];
		
		dfs(0, str.length() - 1);
		
		System.out.println(sb.toString());
		
		sc.close();

	}

	public static void dfs(int left, int right) {
		if (left > right) {
			return;
		}
		
		int idx = left;
		
		for (int i = left; i <= right; i++) {
			if (str.charAt(idx) > str.charAt(i)) {
				idx = i;
			}
		}
		visit[idx] = true;
		
		for (int i = 0; i < str.length(); i++) {
			if (visit[i]) {
				sb.append(str.charAt(i));
			}
		}
		
		sb.append("\n");
		
		dfs(idx + 1, right);
		dfs(left, idx - 1);
	}
	
}
