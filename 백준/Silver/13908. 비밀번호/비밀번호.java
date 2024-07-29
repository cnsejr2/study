import java.util.Scanner;

public class Main {

	static int n, m;
	static int count;
	static boolean[] visit;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		visit = new boolean[10];
		for (int i = 0; i < m; i++) {
			int n = sc.nextInt();
			visit[n] = true;
		}
		
		back(0, 0);
		System.out.println(count);
				
		sc.close();

	}

	private static void back(int idx, int cnt) {
		// TODO Auto-generated method stub
		if (idx == n) {
			if (cnt == m) {
				count++;
			}
			return;
		}
		for (int i = 0; i <= 9; i++) {
			if (visit[i]) {
				visit[i] = false;
				back(idx + 1, cnt + 1);
				visit[i] = true;
			} else {
				back(idx + 1, cnt);
			}
		}
	}

}
