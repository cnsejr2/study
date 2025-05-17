import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	static List<Integer> cranes, boxes;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		cranes = new ArrayList<>();
		boxes = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			cranes.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			boxes.add(Integer.parseInt(st.nextToken()));
		}
			
		Collections.sort(cranes, Collections.reverseOrder());
		Collections.sort(boxes, Collections.reverseOrder());
		
		if (cranes.get(0) < boxes.get(0)) {
			System.out.println(-1);
		} else {
			int time = 0;
			while (!boxes.isEmpty()) {
				int idx = 0;
				for (int i = 0; i < cranes.size(); i++) {
					if (idx == boxes.size()) {
						break;
					} else if (cranes.get(i) >= boxes.get(idx)) {
						boxes.remove(idx);
					} else {
						idx++;
						i--;
					}
				}
				time++;
			}
			System.out.println(time);
		}

	}

}
