import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 30; i++) {
            list.add(i);
        }

        for (int i = 1; i <= 28; i++) {
            int n = sc.nextInt();
            list.remove(Integer.valueOf(n));

        }
        for (Integer l : list) {
            System.out.println(l);
        }

        sc.close();

    }
}
