import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int count = 0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			for (int a = 1; a < n; a++) {
				for (int b = a + 1; b < n; b++) {
					int num = ((a * a) + (b * b) + m) % (a * b);
					if (num == 0) {
						count++;
					}
					
				}
			}
			System.out.println(count);
			
		}
		
		
		sc.close();

	}

}
