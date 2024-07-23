import java.util.Scanner;

public class Main {
	
	static int k, s, cnt = 0;
	static int[] num;
	static boolean[] check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			k = sc.nextInt();
			
			if (k == 0) {
				break;
			}
			num = new int[k];
			check = new boolean[k];
			
			for (int i = 0; i < k; i++) {
				num[i] = sc.nextInt();
			}
			dfs(0, 0);
			System.out.println();
		}
		
		sc.close();
		
	}

	private static void dfs(int dp, int start) {
		// TODO Auto-generated method stub
		if (dp == 6) {
			for (int i = 0; i < k; i++) {
				if (check[i]) {
					System.out.print(num[i] + " ");
				}
			}
			System.out.println();
		}
		for (int i = start; i < k; i++) {
			check[i] = true;
			dfs(dp + 1, i + 1);
			check[i] = false;
		}

	}

}
