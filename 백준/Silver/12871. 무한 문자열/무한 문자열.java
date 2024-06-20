import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1 = new StringBuilder(t);

        int sLen = s.length();
        int tLen = t.length();

        int lcm = (sLen * tLen) / gcd(Math.max(sLen, tLen), Math.min(sLen, tLen));

        for (int i = 0; i < lcm / sLen - 1; i++) {
            s1.append(s);
        }
        for (int i = 0 ; i < lcm / tLen - 1; i++) {
            t1.append(t);
        }

        int result = (s1.toString().equals(t1.toString())) ? 1 : 0;
        System.out.println(result);

    }

    private static int gcd(int max, int min) {
        while (min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }
        return max;
    }

}
