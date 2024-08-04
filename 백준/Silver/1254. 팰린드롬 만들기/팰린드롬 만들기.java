import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = s.length();
		for (int i = 0; i < s.length(); i++) {
			if (check(s.substring(i))) {
				break;
			}
			count++;
		}
		
		System.out.println(count);
		
		sc.close();

	}

	private static boolean check(String s) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = s.length() - 1;
		
		while (start <= end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	

}
