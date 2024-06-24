import java.util.Scanner;

public class Main {

    public static boolean isCheck(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.next();
            boolean flag = false;

            if (s.equals("end")) {
                break;
            }
            char prev = '.';
            int count = 0;

            if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")) { // 조건1
                flag = true;
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    // 조건 2
                    if (isCheck(c) == isCheck(prev)) {
                        count++;
                    } else {
                        count = 1;
                    }
                    if ((prev == c && (c != 'e' && c != 'o')) || count > 2) {
                        flag = false;
                    }
                    prev = c;
                }
            }
            if (flag) {
                System.out.println("<" + s + "> is acceptable.");
            } else {
                System.out.println("<" + s + "> is not acceptable.");
            }

        }

        sc.close();


    }
}
