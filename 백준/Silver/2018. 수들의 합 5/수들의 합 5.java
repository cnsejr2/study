import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int startIndex = 1;
		int endIndex = 1;
		int sum = 1;
		
		while (endIndex != N) {
			if (sum == N) {
				count++; endIndex++; sum = sum + endIndex;
			} else if (sum > N) {
				sum = sum - startIndex;
				startIndex++;
			} else {
				endIndex++; sum = sum + endIndex;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
