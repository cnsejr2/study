import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] sky = new int[h][w];
		
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			int cnt = 0;
			for (int j = 0; j < w; j++) {
				if (s.charAt(j) == 'c') {
					sky[i][j] = 0;
					cnt = 1;
				} else if (s.charAt(j) == '.') {
					if (cnt > 0) {
						sky[i][j] = cnt;
						cnt++;
					} else {
						sky[i][j] = -1;
					}
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0;  j < w; j++) {
				System.out.print(sky[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
		
	}

}
