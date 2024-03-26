import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }
            
            for (int j = 0; j < m; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                }
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            System.out.println(min + " " + max);
        }

        sc.close();
    }
}
