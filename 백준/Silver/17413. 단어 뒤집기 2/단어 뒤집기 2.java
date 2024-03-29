import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" "); // 공백 필터
        int open = 0;
        String word = "";
        for (int i = 0; i < str.length; i++) {
            char[] ch = str[i].toCharArray();

            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '<') {
                    open = 1;
                    if (word.length() > 0) {
                        for (int k = word.length() - 1; k >= 0; k--) {
                            System.out.print(word.charAt(k));
                        }
                        word = "";
                    }
                    System.out.print(ch[j]);
                } else if (ch[j] == '>') {
                    open = 0;
                    System.out.print(ch[j]);
                } else {
                    if (open > 0) {
                        System.out.print(ch[j]);
                    } else {
                        word += ch[j];
                    }

                }
            }
            if (word.length() > 0) {
                for (int k = word.length() - 1; k >= 0; k--) {
                    System.out.print(word.charAt(k));
                }
                word = "";
            }
            System.out.print(" ");

        }


        sc.close();
    }
}
