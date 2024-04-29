import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] mat;
	static int n, m, r;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		
		mat = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				mat[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for (int k = 0; k < r; k++) {
			int l = Integer.parseInt(st.nextToken());
			if (l == 1) {
				one();
			}
			if (l == 2) {
				two();
			}
			if (l == 3) {
				three();
			}
			if (l == 4) {
				four();
			}
			if (l == 5) {
				five();
			}
			if (l == 6) {
				six();
			}
			
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		

	}

	private static void one() {
		// TODO Auto-generated method stub
		int[][] brr = new int[n][m];		
		
		for (int i = 0; i < n; i++)			
			brr[n - i - 1] = mat[i];		
		mat = brr;
		
	}
	
	private static void two() {
		// TODO Auto-generated method stub
		int[][] brr = new int[n][m];		
		for (int i = 0; i < n; i++)			
			for (int j = 0; j < m; j++)				
				brr[i][j] = mat[i][m - j - 1];		
		mat = brr;
	}

	private static void three() {
		// TODO Auto-generated method stub
		int[][] brr = new int[m][n];		
		for (int i = 0; i < m; i++) {			
			for (int j = 0; j < n; j++)				
				brr[i][j] = mat[n - j - 1][i];		
			}		
		int temp = n;		
		n = m;		
		m = temp;		
		mat = brr;
	}
	
	private static void four() {
		// TODO Auto-generated method stub
		int[][] brr = new int[m][n];		
		for (int i = 0; i < m; i++) {			
			for (int j = 0; j < n; j++)				
				brr[i][j] = mat[j][m - i - 1];		
			}		
		int temp = n;		
		n = m;		
		m = temp;		
		mat = brr;
		
	}
	
	private static void five() {
		// TODO Auto-generated method stub
		int[][] brr = new int[n][m];		
		for (int i = 0; i < n / 2; i++) // 1번			
			for (int j = 0; j < m / 2; j++)				
				brr[i][j] = mat[i + n / 2][j]; 		
		for (int i = 0; i < n / 2; i++) // 2번			
			for (int j = m / 2; j < m; j++)				
				brr[i][j] = mat[i][j - m / 2]; 		
		for (int i = n / 2; i < n; i++) // 3번			
			for (int j = m / 2; j < m; j++)				
				brr[i][j] = mat[i - n / 2][j]; 		
		for (int i = n / 2; i < n; i++) // 4번			
			for (int j = 0; j < m / 2; j++)				
				brr[i][j] = mat[i][j + m / 2];		
		mat = brr;
	}
	
	private static void six() {
		// TODO Auto-generated method stub
		int[][] brr = new int[n][m];		
		for (int i = 0; i < n / 2; i++) // 1번			
			for (int j = 0; j < m / 2; j++)				
				brr[i][j] = mat[i][j + m / 2]; 		
		for (int i = 0; i < n / 2; i++) // 2번			
			for (int j = m / 2; j < m; j++)				
				brr[i][j] = mat[i + n / 2][j]; 		
		for (int i = n / 2; i < n; i++) // 3번			
			for (int j = m / 2; j < m; j++)				
				brr[i][j] = mat[i][j - m / 2]; 		
		for (int i = n / 2; i < n; i++) // 4번			
			for (int j = 0; j < m / 2; j++)				
				brr[i][j] = mat[i - n / 2][j];		
		mat = brr;

	}
}
