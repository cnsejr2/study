import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	static int[][] arr;
	static int maxSong,needGuiter;
	static int indexArr[];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		indexArr = new int[n];
		int numY = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			String[] str = st.nextToken().split("");
			for (int j = 0; j < m; j++) {
				arr[i][j] = str[j].equals("Y") ? 1 : 0;
				if (arr[i][j] == 1) {
					numY++;
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			recur(0, 0, i);
		}
		if (numY == 0) {
			System.out.println(-1);
		} else {
			System.out.println(needGuiter);
		}

	}

	private static void recur(int idx, int start, int max) {
		// TODO Auto-generated method stub
		if (idx == max) {
			if (bitmask(arr, indexArr, max)) {
				System.out.println(max);
				System.exit(0);
			}
			return;
		}
		
		for (int i = start; i < n; i++) {
			indexArr[idx] = i;
			recur(idx + 1, i + 1, max);
		}
		
	}

	private static boolean bitmask(int[][] guiter, int[] index, int max) {
		// TODO Auto-generated method stub
		boolean res = true;
		int can = 0;
		for (int i = 0; i < m; i++) {
			int result = guiter[index[0]][i];
			if (result == 0) {
				for (int j = 1; j < max; j++) {
					result = guiter[index[j]][i] | result;
				}
			}
			if (result == 0) {
				res = false;
			} 
			if (result == 1) {
				can++;
			}
		}
		if (maxSong < can) {
			maxSong = can;
			needGuiter = max;
		}
		return res;
	}

}
