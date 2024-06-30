import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String start, end, last;
		Set<String> check = new HashSet<>();
		int count = 0;
		
		st = new StringTokenizer(br.readLine());
		start = st.nextToken();
		end = st.nextToken();
		last = st.nextToken();
		
		while (true) {
			String input = br.readLine();
			if (input == null || input.length() == 0) {
				break;
			}
			
			String[] str = input.split(" ");
			if (str[0].compareTo(start) <= 0) {
				check.add(str[1]);
			} else if (str[0].compareTo(end) >= 0 && str[0].compareTo(last) <= 0) {
				if (check.contains(str[1])) {
					count++;
					check.remove(str[1]);
				}
			}
		}
		System.out.println(count);
		
	
	}

}
