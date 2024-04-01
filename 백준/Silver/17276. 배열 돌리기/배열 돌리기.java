import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] mat;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			mat = new int[n][n];
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < n; k++) {
					mat[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			if (d > 0) {
				rotateR(n, d);
			} else {
				d *= -1;
				rotateL(n, d);
			}
		
			for (int z = 0; z < n; z++) {
				for (int k = 0; k < n; k++) {
					System.out.print(mat[z][k] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void rotateR(int n, int d) {
		// TODO Auto-generated method stub
		for (int i = 0; i < d / 45; i++) {
			
			for (int j = 0; j < n / 2; j++) {
				int temp;
				temp = mat[j][j];
				mat[j][j] = mat[n / 2][j];
				mat[n / 2][j] = mat[n - 1 -j][j];
				mat[n - 1 -j][j] = mat[n - 1 - j][n / 2];
				mat[n - 1 -j][n / 2] = mat[n - 1 - j][n - 1 - j];
				mat[n - 1 -j][n - 1 -j] = mat[n / 2][n - 1 -j];
				mat[n / 2][n - 1 -j] = mat[j][n - 1 -j];
				mat[j][n - 1 -j] = mat[j][n / 2];
				mat[j][n / 2] = temp;
			}
		}
	}
	
	private static void rotateL(int n, int d) {
		// TODO Auto-generated method stub
		for (int i = 0; i < d / 45; i++) {
			
			for (int j = 0; j < n / 2; j++) {
				int temp;
				temp = mat[j][j];
				mat[j][j] = mat[j][n /2];
				mat[j][n / 2] = mat[j][n - 1 -j];
				mat[j][n - 1 -j] = mat[n / 2][n - 1 -j];
				mat[n / 2][n - 1 -j] = mat[n - 1 - j][n - 1 - j];
				mat[n - 1 -j][n - 1 -j] = mat[n - 1 -j][n / 2];
				mat[n - 1 -j][n / 2] = mat[n - 1 -j][j];
				mat[n - 1 -j][j] = mat[n / 2][j];
				mat[n / 2][j] = temp;
				
				
			}
			
		}
		
	}

}
