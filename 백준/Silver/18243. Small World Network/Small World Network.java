import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static final int INF = 100000000;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n + 1][n + 1];
		for (int i = 1; i <= k; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			arr[n1][n2] = 1;
			arr[n2][n1] = 1;
			
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (arr[i][j] != 1) {
					arr[i][j] = INF;
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int z = 1; z <= n; z++) {
					arr[j][z] = Math.min(arr[j][z], arr[j][i] + arr[i][z]);
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if((arr[i][j] == INF && i != j) || arr[i][j] > 6) {
                    System.out.println("Big World!");
                    return;
                }
			}
		}
		System.out.println("Small World!");
		
	}

}
