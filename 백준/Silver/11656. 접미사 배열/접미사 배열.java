import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			String str = s.substring(i, s.length());
			list.add(str);
		}
		
		Collections.sort(list);
		for (String l : list) {
			System.out.println(l);
		}
		
		
		sc.close();
	}

}
