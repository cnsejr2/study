import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] arr = new long[n];
		
		long sum = 0;
		arr[0] = sc.nextLong();
		
		for (int i = 1; i < n; i++) {
			long num = sc.nextLong();
			arr[i] = num + arr[i - 1];
			sum += arr[i - 1] * num;
		}
		
		System.out.println(sum);
		
		sc.close();
		
	}

}
