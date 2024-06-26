import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			String s = sc.next();
			if (s.equals("*")) {
				break;
			}
			
			if (s.length() <= 2) {
				System.out.println(s + " is surprising.");
			} else {
				int count = 0;
				boolean flag = false;
				while (count <= s.length() - 2) {
					List<String> list = new ArrayList<>();
					
					for (int i = 0; i <= s.length() - 2 - count; i++) {
						String result = "";
						result += s.charAt(i);
						result += s.charAt(i + count + 1);
						
						if (list.contains(result)) {
							flag = true;
						} else {
							list.add(result);
						}
					}
					count++;
				}
				if (flag) {
					System.out.println(s + " is NOT surprising.");
				} else {
					System.out.println(s + " is surprising.");
				}
			}
			
		}
		
		
		
		
		sc.close();
		
		

	}

}
