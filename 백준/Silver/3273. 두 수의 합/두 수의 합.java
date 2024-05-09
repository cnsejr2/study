import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int x = sc.nextInt();
		int cnt = 0;
		int left = 0;
		int right = n - 1;
		
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == x) {
				cnt++;
			}
			
			if (sum < x) {
				left++;
			} else {
				right--;
			}
		}
		
		
		System.out.println(cnt);
		
		sc.close();
	}

}
