import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node{
	int x, time;
	
	Node(int x, int time) {
		this.x = x;
		this.time = time;
	}
}

public class Main {
	private static int k;
	private static boolean[] visited;
	private static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		visited = new boolean[100001];
		
		bfs(n);
		
		System.out.println(min);
		
	}

	private static void bfs(int n) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(n, 0));
		visited[n] = true;
		
		while (!q.isEmpty()) {
			Node a = q.poll();
			
			if (a.x == k) {
				min = Math.min(min, a.time);
			}
			if (a.x * 2 <= 100_000 && !visited[a.x * 2]) {
				q.offer(new Node(a.x * 2, a.time));
				visited[a.x * 2] = true;
			}
			if (a.x - 1 >= 0 && !visited[a.x - 1]) {
				q.offer(new Node(a.x - 1, a.time + 1));
				visited[a.x - 1] = true;
			}
			if (a.x + 1 <= 100_000 && !visited[a.x + 1]) {
				q.offer(new Node(a.x + 1, a.time + 1));
				visited[a.x + 1] = true;
			}
		}
		
	}

}
