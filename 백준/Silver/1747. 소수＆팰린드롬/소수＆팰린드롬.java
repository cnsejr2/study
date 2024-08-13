import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n == 1) {
			n++;
		}
		
		while (true) {
			if (check1(n) && check2(n)) {
				System.out.println(n);
				break;
			}
			
			n++;
			
		}

		sc.close();
	}

	private static boolean check2(int n) {
		String str = String.valueOf(n);
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {	// 만약 각각의 문자가 일치하지 않는다면
				return false;
			}
		}
		return true;

	}

	private static boolean check1(int number) {
		for(int i = 2; i <= Math.sqrt(number); i++) {
	        
			// 소수가 아닐경우
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
