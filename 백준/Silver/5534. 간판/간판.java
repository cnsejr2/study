import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine().trim());
        String name = sc.nextLine().trim();
        int n = name.length();

        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
        	str[i] = sc.nextLine().trim();
        }

        int cnt = 0;
        for (String s : str) {
            cnt += check(s, name, n);
        }
        System.out.println(cnt);
        
        sc.close();

	}
	
	public static int check(String string, String name, int n) {
        int l = string.length();
        for (int first = 0; first < l; first++) {
            if (string.charAt(first) == name.charAt(0)) {
                for (int last = first; last < l; last++) {
                    if (string.charAt(last) == name.charAt(n - 1)) {
                        int gap = (last - first) / (n - 1);
                        int cnt = 0;
                        while (cnt < n) {
                            if (string.charAt(first + gap * cnt) == name.charAt(cnt)) {
                                cnt++;
                                continue;
                            }
                            break;
                        }
                        if (cnt == n) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

}
