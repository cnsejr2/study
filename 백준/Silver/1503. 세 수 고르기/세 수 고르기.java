import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static boolean[] visit;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		visit = new boolean[1002];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			visit[num] = true;
		}
		for (int i = 1; i <= 1000; i++) {
			if (!visit[i]) {
				for (int j = i; j <= 1000; j++) {
					if (!visit[j]) {
						for (int k = j; k <= 1001; k++) {
							if (!visit[k]) {
								min = Math.min(min, Math.abs(n - i * j  * k));
							}
						}
					}
				}
			}
		}
		
		System.out.println(min);
	}


}
