import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long loc = sc.nextLong();
		
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		if (loc >= sum) {
			loc -= sum;
			for (int j = n - 1; j >= 0; j--) {
				loc -= arr[j];
				if (loc <= 0) {
					System.out.println(j + 1);
					break;
				}
			}
		} else {
			int s = 0;
			for (int i = 0; i < n; i++) {
				s += arr[i];
				if (loc < s) {
					System.out.println(i + 1);
					break;
				}
			}
		}
		
		
		sc.close();
	}

}
