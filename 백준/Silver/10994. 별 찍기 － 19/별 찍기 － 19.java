import java.util.Scanner;

public class Main {

    static char[][] star;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int len = 1 + 4 * (n - 1);
        star = new char[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                star[i][j] = ' ';
            }
        }

        drawStar(0, len);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }

    public static void drawStar(int s, int e) {

        // 종료조건
        if (s > e) {
            return;
        }

        for (int i = s; i < e; i++) {
            // 테두리
            star[s][i] = '*';
            star[i][s] = '*';
            star[i][e - 1] = '*';
            star[e - 1][i] = '*';
        }

        drawStar(s + 2, e - 2);



    }
}
