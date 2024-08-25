import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static String s;
	static String t;
	static int result = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		s = br.readLine();
		t = br.readLine();
		
		check(t);
		
		System.out.println(result);
		
	}

	private static void check(String t) {
		
		if (result == 0) {
		
			if (s.length() == t.length()) {
				if (t.equals(s)) {
					result = 1;
				}
				return;
			}
			
			
			if (t.endsWith("A")) {
	            check(t.substring(0, t.length() - 1));
	        }

	        if (t.startsWith("B")) {
	        	check(new StringBuilder(t.substring(1)).reverse().toString());
	        }
		}
		return;
	}

}
