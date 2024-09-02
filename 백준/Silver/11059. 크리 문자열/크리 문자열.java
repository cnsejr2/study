import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String target = br.readLine();

	    int maxLength = 0;
	    for (int i = 0; i < target.length(); i++) {
	      for (int j = i + 2; j <= target.length(); j += 2) {
	        String subStr = target.substring(i, j);
	        int sumFirstHalf = 0;
	        int sumSecondHalf = 0;

	        for (int k = 0; k < subStr.length() / 2; k++) {
	          sumFirstHalf += subStr.charAt(k) - '0';
	          sumSecondHalf += subStr.charAt(k + subStr.length() / 2) - '0';
	        }

	        if (sumFirstHalf == sumSecondHalf && subStr.length() > maxLength) {
	          maxLength = subStr.length();
	        }
	      }
	    }

	    System.out.println(maxLength);
	}

}
