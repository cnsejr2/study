import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	private static int n, k, time, cnt;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		bfs();
		
		System.out.println(time + "\n" + cnt);

	}

	private static void bfs() {
		// TODO Auto-generated method stub
		int visit[] = new int[100001];
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(n, 0));
		visit[n] = 1;
		
		while (!queue.isEmpty()) {
			Point p = queue.poll();
			if (p.x == k) {
				if (cnt == 0) {
					time = p.y; // 가장 빠른 시간
				}
				if (time == p.y) {
					cnt++; // 개수 증가
				}
				continue;
			}
			int arr[] = { p.x - 1, p.x + 1, p.x * 2};
			for (int i = 0; i < 3; i++) {
				int next = arr[i];
				if (next < 0 || next > 100000) {
					continue;
				}
				if (visit[next] == 0 || visit[next] == p.y + 1) {
					visit[next] = p.y + 1;
					queue.add(new Point(next, p.y + 1));
				}
			}
		}
		
		
	}

}
