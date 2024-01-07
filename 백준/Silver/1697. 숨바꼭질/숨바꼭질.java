import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	private static int n;
	private static int k;
	
	private static int visited[] = new int[100001];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] inputs = input.split(" ");
		
		n = Integer.valueOf(inputs[0]);
		k = Integer.valueOf(inputs[1]);
		
		int result = bfs(n);
		System.out.println(result);
		
		
		br.close();
	}

	private static int bfs(int node) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(node);
		int index = node;
		int n = 0;
		visited[index] = 1;
		while (queue.isEmpty() == false) {
			n = queue.remove();
			
			if (n == k) {
				return visited[n] - 1;
			}
			if (n - 1 >= 0 && visited[n - 1] == 0) {
				visited[n - 1] = visited[n] + 1;
				queue.add(n - 1);
			}
			if (n + 1 <= 100000 && visited[n + 1] == 0) {
				visited[n + 1] = visited[n] + 1;
				queue.add(n + 1);
			}
			if (2 * n <= 100000 && visited[2 * n] == 0) {
				visited[2 * n] = visited[n] + 1;
				queue.add(2 * n);
			}
			
		}
		
		
		return -1;
	}

}
