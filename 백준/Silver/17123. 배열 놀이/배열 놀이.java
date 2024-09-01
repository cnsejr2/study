import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[n + 1][n + 1];
			int[] rows = new int[n + 1];
			int[] cols = new int[n + 1];
			
			for (int j = 1; j <= n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 1; k <= n; k++) {
					int num = Integer.parseInt(st.nextToken()); 
					arr[j][k] = num;
					rows[j] += num;
					cols[k] += num;
				}
			}
			
			for (int j = 0; j < m; j++) {
				st = new StringTokenizer(br.readLine());
				int r1 = Integer.parseInt(st.nextToken());
				int c1 = Integer.parseInt(st.nextToken());
				int r2 = Integer.parseInt(st.nextToken());
				int c2 = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				
				for (int a = r1; a <= r2; a++) {
					rows[a] += (c2 - c1 + 1) * v;
				}
				
				for (int a = c1; a <= c2; a++) {
					cols[a] += (r2 - r1 + 1) * v;
				}
			}
			
			for (int j = 1; j <= n; j++) {
				System.out.print(rows[j] + " ");
			}
			System.out.println();
			for (int j = 1; j <= n; j++) {
				System.out.print(cols[j] + " ");
			}
			System.out.println();
			
			
			
		}
		
		
	}

}
