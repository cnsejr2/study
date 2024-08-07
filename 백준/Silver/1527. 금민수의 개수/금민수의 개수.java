import java.util.Scanner;

public class Main {
	static int a, b;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		count = 0;
		
		dfs(0);
		
		System.out.println(count);
		
		sc.close();
	}
	private static void dfs(long num) {
		// TODO Auto-generated method stub
		if (num > b) {
			return;
		}
		if (num >= a && num <= b) {
			count++;
		}
		
		dfs(10 * num + 4);
		dfs(10 * num + 7);
		
	}

}
