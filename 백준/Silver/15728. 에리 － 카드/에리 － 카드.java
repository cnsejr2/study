import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list1.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list2.add(Integer.parseInt(st.nextToken()));
		}
		
		int max = 0, idx = -1;
		for (int i = 0; i < k; i++) {
			max = Integer.MIN_VALUE;
			idx = -1;
			
			for (int a = 0; a < n; a++) {
				for (int b = 0; b < list2.size(); b++) {
					if (max < list1.get(a) * list2.get(b)) {
						max = list1.get(a) * list2.get(b);
						idx = b;
					}
				}
			}
			list2.remove(idx);
			
		}
		
		max = list1.get(0) * list2.get(0);
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < list2.size(); j++) {
				max = list1.get(i) * list2.get(j) > max ? list1.get(i) * list2.get(j) : max;
			}
		}
		
		System.out.println(max);
		
	}

}
