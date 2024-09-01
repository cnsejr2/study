import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		Collections.sort(list);
		
		int s = 0; int e = n - 1;
		Long min = Long.MAX_VALUE;
		int n1 = 0; int n2 = 0;
		while (s < e) {
			Long num = list.get(s) + list.get(e);
			
			if (min > Math.abs(num)) {
				min = Math.abs(num);
				n1 = s;
				n2 = e;
			}
			if (num >= 0) {
				e--;	
			} else {
				s++;
			}
		}
		
		System.out.println(list.get(n1) + " " + list.get(n2));
		
		sc.close();

	}

}
