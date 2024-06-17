import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String p = br.readLine();
		int j = 0;
		int[] pi = new int[p.length()];
		for (int i = 1; i < p.length(); i++) {
			while (j > 0 && p.charAt(i) != p.charAt(j)) {
				j = pi[j - 1];
			}
			if (p.charAt(i) == p.charAt(j)) 
				pi[i] = j += 1;
		}
		j = 0;
		for (int i = 0; i < s.length(); i++) {
			while (j > 0 && s.charAt(i) != p.charAt(j)) {
				j = pi[j - 1];
			}
			if (s.charAt(i) == p.charAt(j)) {
				if (j == p.length() - 1) {
					System.out.println(1);
					System.exit(0);
				} else {
					j++;
				}
			}
		}
		System.out.println(0);
		
		
	}

}
