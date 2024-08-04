import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		StringBuffer sb;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				for (int k = j + 1; k < str.length(); k++) {
					String s = "";
					
					String r = str.substring(0, j);
					sb = new StringBuffer(r);
					s += sb.reverse().toString();
					
					r = str.substring(j, k);
					sb = new StringBuffer(r);
					s += sb.reverse().toString();
					
					r = str.substring(k, str.length());
					sb = new StringBuffer(r);
					s += sb.reverse().toString();
					
					list.add(s);
					
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
		
		
		
		sc.close();
	}

}
