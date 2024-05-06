import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());  
		int m = Integer.parseInt(st.nextToken());   		
		int [] arr = new int[n + m]; 
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arr[i + n] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(arr); //정렬 
		
		StringBuilder sb = new StringBuilder();
		
		for(int a : arr) {
			sb.append(a + " "); 
					
		}
		System.out.println(sb);
	}

}
