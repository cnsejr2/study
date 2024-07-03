import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int j = sc.nextInt(); // 사탕의 개수
            int n = sc.nextInt(); // 상자의 개수

            int[] box = new int[n];
            for (int b = 0; b < n; b++) {
                int r = sc.nextInt();
                int c = sc.nextInt();

                box[b] = r * c;
            }
            
            Arrays.sort(box);

            int answer = 0;
            for (int k = n - 1; k > -1; k--) {
                answer++;
                j -= box[k];
                if (j < 1) {
                    break;
                }
            }
            System.out.println(answer);


        }



        sc.close();
    }
}
