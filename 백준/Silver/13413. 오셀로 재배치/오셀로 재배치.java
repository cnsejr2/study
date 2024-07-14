import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int dLen = sc.nextInt();
			int w = 0;
			int b = 0;
			
			String s1 = sc.next();
			String s2 = sc.next();
			
			for (int k = 0; k < dLen; k++) {
				if (s1.charAt(k) != s2.charAt(k)) {
					if (s1.charAt(k) == 'W') {
						b++;
					} else {
						w++;
					}
				}
			}
			if (b >= w) {
				System.out.println(b);
			} else {
				System.out.println(w);
			}
			
			
		}
		
		
		sc.close();

	}

}
