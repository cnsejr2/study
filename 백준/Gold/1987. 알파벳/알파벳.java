
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int[] dx = { -1, 0, 1, 0};
	static int[] dy = { 0, -1, 0, 1};
	static boolean[] alpha;
	static int[][] mat;
	static int max = 1;
	static int r, c;
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Scanner sc = new Scanner(System.in);
 		
 		r = sc.nextInt();
 		c = sc.nextInt();
 		sc.nextLine();
 		
 		mat = new int[r][c];
 		alpha = new boolean[26];
 		
 		for (int i = 0; i < r; i++) {
 			String s = sc.nextLine();
 			for (int j = 0; j < c; j++) {
 				mat[i][j] = s.charAt(j) - 'A';
 			}
 		}
 		
 		dfs(0, 0, 1);

 		System.out.println(max);
 		
 		sc.close();
	}
	private static void dfs(int x, int y, int len) {
		// TODO Auto-generated method stub
		
		alpha[mat[x][y]] = true;
		max = Math.max(max, len);
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
				if (alpha[mat[nx][ny]] == false) {
					dfs(nx, ny, len + 1);
					alpha[mat[nx][ny]] = false;
				}
			}
			
		}
	}

}
