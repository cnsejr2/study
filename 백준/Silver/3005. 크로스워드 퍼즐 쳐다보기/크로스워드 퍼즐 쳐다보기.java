import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		String[] colArr = new String[c];
		Arrays.fill(colArr, "");
		
		String[] rowArr = new String[r];
		
		for (int i = 0; i < r; i++) {
			String str = sc.next();
			rowArr[i] = str;
			for (int j = 0; j < str.length(); j++) {
				colArr[j] += str.charAt(j);
			}
		}
		
		List<String> list = new ArrayList<>();
		for (int i = 0; i < r; i++) {
			String[] str = rowArr[i].split("#");
			for (int j = 0; j < str.length; j++) {
				if (str[j].length() >= 2) {
					list.add(str[j]);
				}
			}
		}
		for (int i = 0; i < c; i++) {
			String[] str = colArr[i].split("#");
			for (int j = 0; j < str.length; j++) {
				if (str[j].length() >= 2) {
					list.add(str[j]);
				}
			}
		}
		Collections.sort(list);

		System.out.println(list.get(0));
		
		sc.close();

	}

}
