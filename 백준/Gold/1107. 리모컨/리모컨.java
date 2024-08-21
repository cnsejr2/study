import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int size = sc.nextInt();
		
		boolean[] broken = new boolean[10];
		for (int i = 0; i < size; i++) {
			broken[sc.nextInt()] = true;
		}
		
		int result = Math.abs(n - 100);
		
		for (int i = 0; i <= 999999; i++) {
			String num = String.valueOf(i);
			
			boolean isBreak = false;
			for (int j = 0; j < num.length(); j++) {
				if (broken[num.charAt(j) - '0']) {
					isBreak = true;
					break;
				}
			}
			
			if (!isBreak) {
				int min = Math.abs(n - i) + num.length();
				result = Math.min(min, result);
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
