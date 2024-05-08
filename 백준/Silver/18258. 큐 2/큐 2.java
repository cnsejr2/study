import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0;  i < n; i++) {
			String[] c = br.readLine().split(" ");
			switch (c[0]) {
				case "push":
					queue.add(Integer.parseInt(c[1]));
					break;
				case "pop":
					if (queue.size() == 0) {
						sb.append(-1).append("\n");
					} else {
						int temp = queue.get(0);
						queue.remove(queue.get(0));
						sb.append(temp).append("\n");
					}
					break;
				case "size":
					sb.append(queue.size()).append("\n");
					break;
				case "empty":
					if (queue.size() == 0) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
				case "front":
					if (queue.size() == 0) {
						sb.append(-1).append("\n");
					} else {
						sb.append(queue.get(0)).append("\n");
					}
					break;
				case "back":
					if (queue.size() == 0) {
						sb.append(-1).append("\n");
					} else {
						sb.append(queue.get(queue.size() - 1)).append("\n");
					}
					break;
			}
		}
		System.out.println(sb);
		
		
		
	}

}
