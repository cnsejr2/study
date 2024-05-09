import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt() * 2 + 1;
		
		int[] ice = new int[1000001];
		
		for (int i = 0; i < n; i++) {
			int g = sc.nextInt();
			int x = sc.nextInt();
			
			ice[x] = g;
		}
		
		int sum = 0;
		int max = 0;
		for (int i = 0; i < 1000001; i++) {
			if (i - k >= 0) {
				sum -= ice[i - k];
			}
			sum += ice[i];	
			
			
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		
		sc.close();
	}

}
