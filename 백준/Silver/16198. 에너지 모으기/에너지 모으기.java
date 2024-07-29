import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static int n;
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		charge(list, 0);
		System.out.println(max);
		
		
	}

	private static void charge(List<Integer> list, int sum) {
		// TODO Auto-generated method stub
		if (list.size() == 2) {
			max = Math.max(max, sum);
			return;
		}
		
		for (int i = 1; i < list.size() - 1; i++) {
			int temp = list.get(i);
			int num = list.get(i - 1) * list.get(i + 1);
			list.remove(i);
			charge(list, sum + num);
			list.add(i, temp);
		}
		
	}

}
