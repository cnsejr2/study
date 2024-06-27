import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = br.readLine().toCharArray();
		
		char tmp = ch[0];
		Map<Character, Integer> map = new HashMap<>();
		
		map.put(' ', Integer.parseInt(br.readLine()));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 26; i++) {
			map.put((char) ('a' + i), Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toString(tmp).toUpperCase());
		map.put(Character.toLowerCase(tmp), map.getOrDefault(Character.toLowerCase(tmp), 0) - 1);
		
		for (int i = 1; i < ch.length; i++) {
			if (ch[i] !=  tmp) {
				map.put(Character.toLowerCase(ch[i]), map.getOrDefault(Character.toLowerCase(ch[i]), 0) -1);
				
				if (tmp == ' ') {
					sb.append(Character.toString(ch[i]).toUpperCase());
				}
			}
			
			if (map.get(Character.toLowerCase(ch[i])) < 0) {
				System.out.println(-1);
				return;
			}
			tmp = ch[i];
		}
		
		for (int i = 0; i < sb.length(); i++) {
			char c = Character.toLowerCase(sb.toString().charAt(i));
			
			map.put(c, map.getOrDefault(c, 0) - 1);
			
			if (map.get(c) < 0) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(sb.toString());
		
		
		
	}

}
