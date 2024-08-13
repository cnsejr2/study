import java.util.Scanner;

public class Main {

	static int result = 0;
	static String a;
	static String b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		a = sc.next();
		b = sc.next();
		
		int[] arr = new int[a.length()];
		for (int i = 0; i < a.length(); i++) {
			arr[i] = a.charAt(i);
		}
		
		int output[] = new int[arr.length];
		boolean[] visited = new boolean[arr.length];
		int n = arr.length;
		
		perm(arr, output, visited, 0, n, n);
		
		System.out.println(result == 0 ? -1 : result);
		
		
		sc.close();

	}

	
	private static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		// TODO Auto-generated method stub
		if (depth == r) {
			String num = "";
			for (int i = 0; i < r; i++) {
				num += (output[i] - '0');
			}
			if (num.charAt(0) > '0') {
				if (Integer.parseInt(num) <= Integer.parseInt(b)) {
					result = Math.max(result, Integer.parseInt(num));
				}
			}
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				perm(arr, output, visited, depth + 1, n, r);
				visited[i] = false;
			}
		}
		
	}
}
