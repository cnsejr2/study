import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String s = br.readLine();
			if (s.equals("END")) break;
			StringBuilder r = new StringBuilder(s);
			r = r.reverse();
			sb.append(r + "\n");
		}
		System.out.print(sb);
	}
}
