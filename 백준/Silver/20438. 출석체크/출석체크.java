import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[] v = new boolean[n + 3];
		List<Integer> list = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < k; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < q; i++) {
			int now = Integer.parseInt(st.nextToken());
			if (list.contains(now)) {
				continue;
			}
			if (!v[now]) {
				for (int j = now; j < n + 3; j++) {
					if (j % now == 0) {
						if (!list.contains(j)) {
							v[j] = true;
						}
					}
				}
			}
		}
		
		int[] cumSum = new int[n + 3];
		for (int i = 3; i < cumSum.length; i++) {
			cumSum[i] = cumSum[i - 1] + ((!v[i]) ? 1 : 0);
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			System.out.println(cumSum[e] - cumSum[s - 1]);
		}
		
		
	}

}
