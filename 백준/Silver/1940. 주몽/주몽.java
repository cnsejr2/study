import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;
        int cnt = 0;
        while (start < end) {
            int num = arr[start] + arr[end];
            if (num == m) {
                cnt++;
                start++; end--;
            } else if (num > m) {
                end--;
            } else if (num < m) {
                start++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
