import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static class Node implements Comparable<Node> {
		int start;
		int end;
		
		public Node(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		@Override
		public int compareTo(Node next) {
			if (this.start == next.start) {
				return this.end - next.end;
			} else {
				return this.start - next.start;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		int n = Integer.parseInt(st.nextToken());
		Node[] meeting = new Node[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			meeting[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			
		}
		
		Arrays.sort(meeting);
		
		pq.offer(meeting[0].end);
		for (int i = 1; i < n; i++) {
			if (meeting[i].start >= pq.peek()) {
				pq.poll();
			}
			
			pq.offer(meeting[i].end);
		}
		
		System.out.println(pq.size());
		

	}

}


