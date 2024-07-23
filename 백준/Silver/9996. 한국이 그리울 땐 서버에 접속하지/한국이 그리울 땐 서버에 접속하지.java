import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] p = br.readLine().split("\\*");
		String[] str = new String[n];
		
		String pattern = "^" + p[0] + ".*" + p[1] + "$";
		
		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		for (String s : str) {
			if (Pattern.matches(pattern, s) && s.length() != 1) {
				sb.append("DA").append("\n");
			} else {
				sb.append("NE").append("\n");
			}
		}
		
		System.out.println(sb);
		
		
		
	}

}
