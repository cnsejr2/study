import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		cutNum(n, 0);
		
		System.out.println(min + " " + max);

	}

	private static void cutNum(int n, int cnt) {
		// TODO Auto-generated method stub
		cnt += countOdd(n);
		
		if (n < 10) {
			min = Integer.min(min, cnt);
			max = Integer.max(max, cnt);
		} else if (n < 100) {
			int next = n / 10;
			next += n % 10;
			cutNum(next, cnt);
		} else {
			String str = String.valueOf(n);
			for (int i = 0; i < str.length() - 2; i++) {
				for (int j = i + 1; j < str.length() - 1; j++) {
					int next = Integer.parseInt(str.substring(0, i + 1));
					next += Integer.parseInt(str.substring(i + 1, j + 1));
					next += Integer.parseInt(str.substring(j + 1));
					
					cutNum(next, cnt);
				}
			}
		}
		
	}

	private static int countOdd(int n) {
		int cnt = 0;
		while (n > 0) {
			int temp = n % 10;
			if (temp % 2 == 1) {
				cnt++;
			}
			n /= 10;
		}
		
		return cnt;
	}

}
