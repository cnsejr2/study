import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		while (queue.size() > 0) {
			if (queue.size() == 1) {
				System.out.println(queue.get(0));
				break;
			}
			queue.remove(queue.get(0));
			int k = queue.get(0);
			queue.remove(queue.get(0));
			queue.add(k);
		}
		
		
		sc.close();
	}

}
