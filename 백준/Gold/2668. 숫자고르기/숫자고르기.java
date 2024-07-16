import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static int n;
	static int[] mat;
	static boolean[] visit;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		mat = new int[n + 1];
		visit = new boolean[n + 1];
		
		for (int i = 1; i <= n; i++) {
			mat[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			visit[i] = true;
			dfs(i, i);
			visit[i] = false;
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		sc.close();

	}

	private static void dfs(int s, int t) {
		// TODO Auto-generated method stub
		if (visit[mat[s]] == false) {
			visit[mat[s]] = true;
			dfs(mat[s], t);
			visit[mat[s]] = false;
		}
		if (mat[s] == t) {
			list.add(t);
		}
		
		
	}

}
