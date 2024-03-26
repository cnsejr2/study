import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static String str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String a = Integer.toBinaryString(str.charAt(i) - '0');
            if(a.length() == 2 && i != 0) {
                a = "0" + a;
            }else if(a.length() == 1 && i != 0) {
                a = "00" + a;
            }

            sb.append(a);
        }

        System.out.println(sb.toString());
    }
}
