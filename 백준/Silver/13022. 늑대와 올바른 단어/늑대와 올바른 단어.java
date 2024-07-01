import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String test = "(w+o+l+f+)+";
		int wCnt = 0, oCnt = 0, lCnt = 0, fCnt = 0;
		boolean check = false;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'w') {
				wCnt++;
			} else if (s.charAt(i) == 'o') {
				oCnt++;
			} else if (s.charAt(i) == 'l') {
				lCnt++;
			} else {
				fCnt++;
			}
			
			if (i < s.length() - 1 && s.charAt(i) == 'f' && s.charAt(i + 1) == 'w') {
				if(!(wCnt==oCnt && oCnt==lCnt&& lCnt==fCnt && fCnt == wCnt)) {
					check = true;
					break;
				}
			}
		}
		if(!check && s.matches(test) && wCnt==oCnt && oCnt==lCnt&& lCnt==fCnt && fCnt == wCnt)
			System.out.println(1);
		else
			System.out.println(0);
		
		
	}

}
