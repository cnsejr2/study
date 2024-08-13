import java.util.Scanner;

public class Main {

	static boolean[] v;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		v = new boolean[sum + 1];
		
		subset(0, n, arr, new int[n]);
		
		for (int i = 1; i <= sum; i++) {
			if (!v[i]) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(sum + 1);
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
		
		answer[depth] = 0;
		subset(depth + 1, n, num, answer);
		
	}

}
