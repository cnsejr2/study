import java.util.Scanner;

public class Main {
	static String[] line;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		line = new String[n];
		
		for (int i = 0; i < n; i++) {
			line[i] = sc.next(); 
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (check(i, j)) {
					count++;
				}
				
			}
		}
		
		System.out.println(count);
		sc.close();

	}
	
	private static boolean check(int i, int j) {

		int[] alpha1 = new int[26];
		int[] alpha2 = new int[26];
		for (int k = 0; k < line[i].length(); k++) {
			char a = line[i].charAt(k);
			char b = line[j].charAt(k);
			
			if (alpha1[a - 'a'] == 0 && alpha2[b - 'a'] == 0) {
				alpha1[a - 'a'] = (b - 'a' + 1);
				alpha2[b - 'a'] = (a - 'a' + 1);
			} else {
				if (alpha1[a - 'a'] != (b - 'a' + 1) && alpha2[b - 'a'] != (a - 'a' + 1)) {
					return false;
				}
			}
		}
		return true;
	}

}
