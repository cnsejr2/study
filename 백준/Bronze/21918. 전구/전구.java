import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); // 명령어
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 1) {
                arr[b] = c;
            } else if (a == 2) {
                for (int j = b; j <= c; j++) {
                    arr[j] = arr[j] > 0 ? 0 : 1;
                }
            } else if (a == 3) {
                for (int j = b; j <= c; j++) {
                    arr[j] = 0;
                }
            } else if (a == 4) {
                for (int j = b; j <= c; j++) {
                    arr[j] = 1;
                }
            }
        }


        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }


        sc.close();

    }

}
