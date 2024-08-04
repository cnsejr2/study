import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			
			String[] s = new String[n];
			for (int j = 0; j < n; j++) {
				s[j] = sc.next();
			}
			
			boolean check = false;
			
			loop:
			for (int a = 0; a < n; a++) {
				for (int b = 0; b < n; b++) {
					if (a == b) continue;
					String str = s[a] + s[b];
					String rStr = new StringBuilder(str).reverse().toString();
					if (str.equals(rStr)) {
						sb.append(str+"\n");
						check = true;
						break loop;
					}
				}
			}
			if (!check) {
				sb.append(0 + "\n");
			}
			
		}
		 System.out.println(sb);
		sc.close();

	}

}
