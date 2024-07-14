import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n  = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int prevSum = getASS(1, k, k);
		
		if (n < prevSum) {
			System.out.println(-1);
			return;
		}
		int i = 2;
		
		while (true) {
			int curSum = getASS(i, k + i - 1, k);
			if (curSum > n) {
				if (prevSum == n) {
					System.out.println(k - 1);
				} else {
					System.out.println(k);
				}
				return;
			}
			prevSum = curSum;
			i++;
		}
		
		

	}

	private static int getASS(int s, int e, int k) {
		// TODO Auto-generated method stub
		return (s + e) * k / 2;
	}

}
