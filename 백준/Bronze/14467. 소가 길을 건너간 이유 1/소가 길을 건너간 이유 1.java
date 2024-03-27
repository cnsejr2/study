import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int l = sc.nextInt();
            if (map.get(c) != null) {
                int cur = map.get(c);
                if (l != cur) {
                    count++;
                    map.put(c, l);
                }
            }
            map.put(c, l);
        }
        System.out.println(count);
        sc.close();
    }
}
