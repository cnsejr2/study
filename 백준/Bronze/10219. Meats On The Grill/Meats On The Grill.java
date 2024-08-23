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
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			char[][] arr = new char[h + 1][w + 1];
			
			for (int a = 1; a <= h; a++) {
				String str = br.readLine();
				for (int b = 1; b <= w; b++) {
					arr[a][b] = str.charAt(b - 1);
				}
			}
			
			for (int a = 1; a <= h; a++) {
				for (int b = w; b > 0; b--) {
					System.out.print(arr[a][b]);
				}
				System.out.println();
			}
		}
		
	}

}
