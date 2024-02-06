import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] arr = new int[20];
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int p = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < p; i++) {
			count = 0;
			st = new StringTokenizer(br.readLine());
			
			System.out.print(st.nextToken() + " ");
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			bubbleSort();
			System.out.println(count);
			
		}
		
		br.close();
	}
	private static void bubbleSort() {
		// TODO Auto-generated method stub
		int length = arr.length;
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				if (j + 1 < length && arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
					count++;
				}
			}
			
		}
		
	}

}
