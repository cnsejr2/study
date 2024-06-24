import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] ch = new int[26];
        Arrays.fill(ch, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (ch[c - 'a'] < 0) {
                ch[c - 'a'] = i;
            }
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }

        sc.close();

    }
}
