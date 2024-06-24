import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int k = 0; k < 3; k++) {
            String[] times = scanner.nextLine().split(" ");
            String start = times[0];
            String end = times[1];

            String[] startTime = start.split(":");
            String[] endTime = end.split(":");

            int sh = Integer.parseInt(startTime[0]);
            int sm = Integer.parseInt(startTime[1]);
            int ss = Integer.parseInt(startTime[2]);

            int eh = Integer.parseInt(endTime[0]);
            int em = Integer.parseInt(endTime[1]);
            int es = Integer.parseInt(endTime[2]);

            int sp = six(sh, sm, ss);
            int ep = six(eh, em, es);

            if (sp > ep) {
                ep += six(24, 0, 0);
            }

            int cnt = 0;
            for (int i = sp; i <= ep; i++) {
                if (ten(i) % 3 == 0) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        scanner.close();
    }

    // Python functions converted to Java static methods
    public static int six(int h, int m, int s) {
        return 60 * 60 * h + 60 * m + s;
    }

    public static int ten(int t) {
        int h = t / 3600;
        int m = t % 3600 / 60;
        int s = t % 60;
        return h * 10000 + m * 100 + s;
    }
}