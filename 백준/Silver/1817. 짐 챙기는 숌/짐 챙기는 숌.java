import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (n == 0) {
			System.out.println(0);
		} else {
			
			int cnt = 1;
			int weight = 0;
			for (int i = 0; i < n; i++) {
				weight += arr[i];
				if (weight > m) {
					cnt++;
					weight = arr[i];
				}
				
			}
			System.out.println(cnt);
		}
		
		sc.close();
		

	}

}
