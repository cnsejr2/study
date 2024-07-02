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

        int s = 0;
        int e = 0;
        int count = 0;
        int sum = 0;

        while (true) {
            if (sum >= m) {
                sum -= arr[s++];
            } else if (e == n) {
                break;
            } else {
                sum += arr[e++];
            }
            if (sum == m) {
                count++;
            }
        }
    
        System.out.println(count);

        sc.close();
    }
}
