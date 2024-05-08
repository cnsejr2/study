import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			
			boolean flag = false;
			Stack<Character> stack = new Stack<>();
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if (ch == '(') {
					stack.push(ch);
				} else {
					if (stack.isEmpty()) {
						System.out.println("NO");
						flag = true;
						break;
					} else {
						stack.pop();
					}
				}
			}
			if (!flag) {
				if (!stack.isEmpty()) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			}
			
			
		}
		
		sc.close();
	}

}
