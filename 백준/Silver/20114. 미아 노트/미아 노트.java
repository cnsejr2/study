import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		char[] ch = new char[n];
		Arrays.fill(ch, '?');
		
		for (int i = 0; i < h; i++) {
			String str = br.readLine();
			for (int j = 0; j < n * w; j++) {
				char c = str.charAt(j);
				if (c == '?') continue;
				else {
					ch[j / w] = c;
				}
			}
		}
		
		
		for (int i = 0; i < n; i++) {
			System.out.print(ch[i]);
		}
		
		
	}

}
