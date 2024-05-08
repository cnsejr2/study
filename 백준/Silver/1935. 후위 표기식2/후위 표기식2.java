import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String str = sc.next();
		
		int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		
		Stack<Double> stack = new Stack<Double>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z') {  // operand
                double d = arr[ch - 'A'];
                stack.push(d);
            }else {  
				int cnt = 0;
				double[] num = new double[2];
				while (cnt < 2) {
					num[cnt] = stack.pop();
					cnt++;
				}

				if (ch == '*') {
					stack.push(num[1] * num[0]);
				} else if (ch == '+') {
					stack.push(num[1] + num[0]);
				} else if (ch == '/') {
					stack.push(num[1] / num[0]);
				} else if (ch == '-') {
					stack.push(num[1] - num[0]);
				}
				
			}
		}
		System.out.printf("%.2f", stack.pop());
		
		sc.close();

	}

}
