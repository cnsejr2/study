import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int n, m;
	static int[] changes;
	static int[] arr;
	static int[] temp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		
		arr = new int[n + 1];
		changes = new int[n + 1];
		
		String[] s1 = br.readLine().split(" ");
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(s1[i - 1]);
		}
		
		String[] s2 = br.readLine().split(" ");
		for (int i = 1; i <= n; i++) {
			changes[i] = Integer.parseInt(s2[i - 1]);
		}

		for (int i = 0; i < m; i++) {
			check();
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void check() {
		// TODO Auto-generated method stub
		temp = new int[n + 1];
		
		for (int i = 1;i <= n; i++) {
			temp[changes[i]] = arr[i];
		}
		arr = temp;
		
	}

}
