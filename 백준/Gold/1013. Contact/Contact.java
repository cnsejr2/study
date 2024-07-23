import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String p = "(100+1+|01)+";
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println(str.matches(p) ? "YES" : "NO");
		}
		
		
		sc.close();
	}

}
