import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int cnt = 0;
			for (int j = n; j <= m; j++) {
				int num = j;
				if (num == 0) {
					cnt++;
					continue;
				}
				
				while (num > 1) {
					if (num % 10 == 0) {
						cnt++;
					}
					num /= 10;
				}
			}
			System.out.println(cnt);
			
		}
		
		sc.close();

	}

}
