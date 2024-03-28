import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] used = new int[str.length()];
        int count = 0;
        
        if (str.charAt(0) != 'q' || str.length() % 5 != 0) {
            System.out.println("-1");
        } else {

            while (true) {
                String nStr = "";
                int duck = 0;
                int check = 0;
                for (int i = 0; i < str.length(); i++) {

                    if (used[i] == 0) {
                        if (check == 0) {
                            check = 1; // 녹음한 소리가 올바르지 않은 경우
                        }
                        if ((nStr.length() == 0 && str.charAt(i) == 'q')
                                || (nStr.length() == 1 && str.charAt(i) == 'u')
                                || (nStr.length() == 2 && str.charAt(i) == 'a')
                                || (nStr.length() == 3 && str.charAt(i) == 'c')
                                || (nStr.length() == 4 && str.charAt(i) == 'k')) {
                            nStr += str.charAt(i);
                            used[i] = 1;
                        }
                    }

                    if (nStr.equals("quack")) {
                        nStr = "";
                        duck = 1;
                    }
                }
                if (duck == 1) {
                    count++;
                } else {
                    if (check == 1) {
                        count = -1;
                    }
                    break;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
