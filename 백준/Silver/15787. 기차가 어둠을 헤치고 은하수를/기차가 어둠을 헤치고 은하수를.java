import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] t = new int[n + 1][21];
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int num = sc.nextInt();
			if (s == 1) {
				int seat = sc.nextInt();
				if (t[num][seat] == 0) {
					t[num][seat] = 1;
				}
			}
			if (s == 2) {
				int seat = sc.nextInt();
				if (t[num][seat] > 0) {
					t[num][seat] = 0;
				}
			}
			if (s == 3) {
				for (int j = 20; j > 1; j--) {
					t[num][j] = t[num][j - 1];
				}
				t[num][1] = 0;
			}
			if (s == 4) {
				for (int j = 1; j < 20; j++) {
					t[num][j] = t[num][j + 1];
				}
				t[num][20] = 0;
			}
		}
		
		List<String> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			String str = "";
			for (int j = 1; j <= 20; j++) {
				if (t[i][j] == 1) {
					str += String.valueOf(1);
				} else {
					str += String.valueOf(0);
				}
			}

			if (!list.contains(str)) {
				list.add(str);
			} 
		}

		System.out.println(list.size());
		sc.close();
	}

}
