import java.util.Scanner;

public class Main {
    static int[][] bingo = new int[6][6];
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= 25; i++) {
            int s = sc.nextInt();
            for (int j = 1; j <= 5; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (bingo[j][k] == s) {
                        bingo[j][k] = 0;
                        break;
                    }
                }
            }

            check();

            if (count >= 3) {
                System.out.println(i);
                break;
            }
            count = 0;
        }
        sc.close();
    }

    private static void check() {
        int rightCount = 0;
        int leftCount = 0;
        for (int i = 1; i <= 5; i++) {
            int cCount = 0;
            int rCount = 0;
            for (int j = 1; j <= 5; j++) {
                if (bingo[i][j] == 0) {
                    cCount++;
                }
                if (bingo[j][i] == 0) {
                    rCount++;
                }
            }
            if (cCount == 5) {
                count++;
            }
            if (rCount == 5) {
                count++;
            }
            if (bingo[i][i] == 0) {
                leftCount++;
            }
            if (bingo[i][6 - i] == 0) {
                rightCount++;
            }
        }
        if (rightCount == 5) {
            count++;
        }
        if (leftCount == 5) {
            count++;
        }

    }
}
