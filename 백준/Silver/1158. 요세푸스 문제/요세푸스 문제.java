import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> queue = new LinkedList<Integer>(); 
		
		sb.append("<");
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		int i = 0;
		while (queue.size() > 0) {
			i++;
			int j = queue.get(0);
			queue.remove(queue.get(0));
			if (i == k) {
				if (queue.size() > 0) {
					sb.append(j + ", ");
				} else {
					sb.append(j);
				}
				i = 0;
			} else {
				queue.add(j);
			}
			
		}
	
		sb.append(">");
		System.out.println(sb);
		
		sc.close();
	}

}
