import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> result = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE;
		
		for (int i = n; i >= 0; i--) {
			List<Integer> list = new ArrayList<Integer>();
			
			list.add(n);
			list.add(i);
			int len = list.size();
			while (true) {
				int num = list.get(len - 2) - list.get(len - 1);
				if (num < 0) {
					break;
				}
				list.add(num);
				len = list.size();
			}
			if (max <= list.size()) {
				result = new ArrayList<>(list);
				max = result.size();
			}
			
		}
		
		System.out.println(result.size());
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
