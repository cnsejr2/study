import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int zero = 0;
			int one = 0;
			
			String num1 = sc.next();
			String num2 = sc.next();
			
			for (int k = 0; k < num1.length(); k++) {
				if (num1.charAt(k) != num2.charAt(k)) {
					if (num1.charAt(k) == '1') {
						zero++;
					} else {
						one++;
					}
				}
			}
			if (zero >= one) {
				System.out.println(zero);
			} else {
				System.out.println(one);
			}
			
		}
		
		
		sc.close();
	}

}
