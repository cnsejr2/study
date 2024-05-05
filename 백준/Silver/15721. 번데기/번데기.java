import java.util.Scanner;

public class Main {
	static int a, t, n;
	static int repeat = 2;
	static int zCount, oCount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		t = sc.nextInt();
		n = sc.nextInt();
		
		System.out.println(solve());
		
		sc.close();

	}

	private static int solve() {
		while (true) {
			for (int i = 0; i < 4; i++) {
				if (i % 2 == 0) {
					zCount++;
				} else {
					oCount++;
				}
				if (n == 0 && zCount == t) {
					return (zCount + oCount - 1) % a;
				}
				if (n == 1 && oCount == t) {
					return (zCount + oCount - 1) % a;
				}
			}
			
			for (int i = 0; i < repeat; i++) {
				zCount++;
				if (zCount == t && n == 0) {
					return (zCount + oCount - 1) % a;
				}
			}
			for (int i = 0; i < repeat; i++) {
				oCount++;
				if (oCount == t && n == 1) {
					return (zCount + oCount - 1) % a;
				}
			}
			repeat++;
		}
	}

}
