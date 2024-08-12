import java.util.Scanner;

public class Main {

	static boolean[] v;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			max += num[i];
		}
		v = new boolean[max + 1];
		
		subset(0, n, num, new int[n]);
		int score = 0;
		for (int i = 1; i <= max; i++) {
			if (!v[i]) {
				score++;
			}
		}
		System.out.println(score);
		
		sc.close();
		
	}

	private static void subset(int depth, int n, int[] num, int[] answer) {
		// TODO Auto-generated method stub
		if (depth == n) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += answer[i];
			}
			
			if (sum <= 0) return;
			v[sum] = true;
			return;
		}
		
		answer[depth] = num[depth];
		subset(depth + 1, n, num, answer);
		
		answer[depth] = -num[depth];
		subset(depth + 1, n, num, answer);
		
		answer[depth] = 0;
		subset(depth + 1, n, num, answer);
		
	}

}
