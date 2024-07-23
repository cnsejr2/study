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
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String s1 = "", s2 = "";
			
			for (int j = s.length() - 1; j >= 0; j--) {
				if (s.charAt(j) == 'C' || s.charAt(j) == 'H') {
					s1 = s.substring(0, j + 1);
					s2 = s.substring(j + 1);
					break;
				}
			}
			if (isSlimp(s1) && isSlump(s2)) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}
		
		System.out.println("SLURPYS OUTPUT\n" + sb.toString() + "END OF OUTPUT\n");
		

	}

	private static boolean isSlump(String s) {
		Pattern slump = Pattern.compile("((D|E)F+)+G");
		
		return slump.matcher(s).matches();
	}

	private static boolean isSlimp(String s) {
		if (s.length() == 0) {
			return false;
		}
		
		if (s.length() == 2) {
			if (s.equals("AH")) {
				return true;
			} else {
				return false;
			}
		}
		
		if (s.length() >= 3) {
			if (s.charAt(s.length() - 1) != 'C') {
				return false;
			}
			
			if (s.charAt(0) == 'A' && s.charAt(1) == 'B') {
				return isSlimp(s.substring(2, s.length() - 1));
			}
			
			if (s.charAt(0) == 'A') {
				return isSlump(s.substring(1, s.length() - 1));
			}
		}
		
		return false;
	}

}
