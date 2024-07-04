import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean odd = false;
		if (n % 2 == 1) {
			odd = true;
			n--;
		}
		
		StringBuilder sb = new StringBuilder();
		while (n-- > 0) {
			if (n % 2 == 1) {
				sb.append("1").append(" ");
			} else {
				sb.append("2").append(" ");
			}
		}
		if (odd) {
			sb.append("3");
		}
		System.out.println(sb.toString());
		
	}

}
