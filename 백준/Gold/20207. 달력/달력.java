import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] cnt = new int[365 + 1];

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            for (int j = s; j <= e; j++) {
                cnt[j]++;
            }
        }
        int sum = 0;
        int width = 0;
        int hMax = 0;
        for (int i = 1; i <= 365; i++) {
            if (cnt[i] == 0) {
                sum += (hMax * width);
                hMax = width = 0;
                continue;
            }
            width++;
            hMax = Math.max(hMax, cnt[i]);
        }
        sum += (hMax * width);
        System.out.println(sum);

        sc.close();


    }
}
