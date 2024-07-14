import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] level = new int[n];
		for (int i = 0; i < n; i++) {
			level[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 0;
		int base = level[n - 1];
		
		for (int i = level.length - 2; i >= 0; i--) {
			if (level[i] > base - 1) {
				cnt += level[i] - base + 1;
				base--;
			} else {
				base = level[i];
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
