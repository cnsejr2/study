import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static int n;
	public static int[] num = { 1, 5, 10, 50};
	public static int answer;
	public static HashSet<Integer> hashSet = new HashSet<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		simulate(0, 0, 0);
		System.out.println(hashSet.size());

	}

	private static void simulate(int level, int sum, int idx) {
		// TODO Auto-generated method stub
		if (level == n) {
			hashSet.add(sum);
			return;
		}
		for (int i = idx; i < 4; i++) {
			simulate(level + 1, sum + num[i], i);
		}
	}

}
