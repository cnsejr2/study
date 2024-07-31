import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		int w = sc.nextInt();
		int max = 0;
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		
		Long result = 0L;
		
		for (int i = 1; i <= max; i++) {
			Long sum = 0L;  
			for (int j = 0; j < n; j++) {
				int cut = 0;
				if (arr[j] >= i) {
					if (arr[j] % i == 0) {
						cut = arr[j] / i - 1;
					} else {
						cut = arr[j] / i;
					}
					if (w * i * (arr[j] / i) - cut * c > 0) {
						sum += w * i * (arr[j] / i) - cut * c;
					}
				}
			}
			result = Math.max(result, sum);
		}
		System.out.println(result);
		
		sc.close();
	}

}
