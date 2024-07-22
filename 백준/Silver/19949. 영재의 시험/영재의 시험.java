import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int count;
	static int[] solutions;
	static final int n = 10;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		solutions = new int[n];
		
		for (int i = 0; i < n; i++) {
			solutions[i] = Integer.parseInt(st.nextToken());
		}
		
		backTracking(new int[n], 0, 0);
		
		System.out.println(count);
		

	}

	private static void backTracking(int[] my, int solCnt, int index) {
		// TODO Auto-generated method stub
		if (n - index + solCnt < 5) {
			return;
		}
		
		if (index == n) {
			if (solCnt >= 5) {
				count++;
			}
		} else {
			int notAns = 0;
			
			if (index >= 2) { // 이전에 2문제 이상 풀었으면, 3연속 같은 정답을 적으면 안됨
				if (my[index - 1] == my[index - 2]) {
					notAns = my[index - 1];
				}
			}
			
			// 5지 선다
			for (int i = 1; i <= 5; i++) {
				if (i == notAns) { // 3연속 정답은 패스
					continue;
				}
				
				// 정답이면
				my[index] = i;
				if (solutions[index] == i) {
					backTracking(my, solCnt + 1, index + 1);
				} else {
					backTracking(my, solCnt, index + 1);
				}
				my[index] = 0; // 초기화
			}
			
		}
		
		
	}


}
