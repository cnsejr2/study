import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String p = "(100+1+|01)+";
		System.out.println(str.matches(p) ? "SUBMARINE" : "NOISE");
		
		
		sc.close();

	}

}
