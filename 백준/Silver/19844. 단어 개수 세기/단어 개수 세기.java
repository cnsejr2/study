import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String regex = "^(c|j|n|m|t|s|l|d|qu)(')[aeiouh]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher;
		String[] arr = str.split("[\\s-]");
		int cnt = arr.length;
		for (String val : arr) {
			matcher = pattern.matcher(val);
			while (matcher.find()) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		
		sc.close();
	}

}
