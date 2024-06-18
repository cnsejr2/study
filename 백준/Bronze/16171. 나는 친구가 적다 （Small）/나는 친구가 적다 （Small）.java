import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String pattern = br.readLine();
		
		input = input.replaceAll("[0-9]", "");
		int patLen = pattern.length();
		boolean flag = false;
		
		for (int i = 0; i <= input.length() - patLen; i++) {
			if (input.substring(i, i + patLen).equals(pattern)) {
				flag = true;
			}
		}
		
		System.out.println(flag ? 1 : 0);
		
		

	}

}
