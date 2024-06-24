import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        while (true) {
            String a = br.readLine();
            if (a == null) {
            	break;
            }
            String b = br.readLine();

            int[] cntA = getArr(a);
            int[] cntB = getArr(b);

            for (int i = 0; i < cntA.length; i++) {
                for (int j = 0; j < Math.min(cntA[i], cntB[i]); j++) {
                    answer.append((char)('a' + i));
                }
            }
            answer.append('\n');
        }
        System.out.print(answer);
		
	}

	private static int[] getArr(String s) {
		// TODO Auto-generated method stub
		int[] cnt = new int[26];
		for (int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i) - 'a']++;
		}
		return cnt;
	}

}
