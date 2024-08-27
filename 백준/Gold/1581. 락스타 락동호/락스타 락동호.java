import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] > 0) {
			cnt = arr[3];
		} else if (arr[0] == 0 && arr[1] == 0 && arr[2] > 0 && arr[3] > 0) {
			cnt = arr[3] + 1;
		} else if (arr[0] == 0 && arr[1] == 0 && arr[2] > 0 && arr[3] == 0) {
			cnt = 1;
		} else {
			if (arr[0] != 0 && arr[1] == 0) {
				cnt += arr[0];
			} else if (arr[0] != 0 && arr[1] != 0) {
				cnt += arr[0] + 1;
				arr[1]--;
				cnt += arr[3];
				if (arr[1] >= arr[2]) {
					cnt += (arr[2] * 2);
				} else if (arr[1] < arr[2]) {
					cnt += (arr[1] * 2) + 1;
				}
			} else if (arr[0] == 0 && arr[1] != 0) {
				cnt = 1;
				arr[1]--;
				cnt += arr[3];
				if (arr[1] >= arr[2]) {
					cnt += (arr[2] * 2);
				} else if (arr[1] < arr[2]) {
					cnt += (arr[1] * 2) + 1;
				}
			}
		}
		System.out.println(cnt);
		
		
		
		sc.close();

	}

}
