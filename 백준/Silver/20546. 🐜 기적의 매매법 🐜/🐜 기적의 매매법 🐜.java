import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[14];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] info = new int[2][2];
        /*
        * info[0][0] = 준현이 현금
        * info[0][1] = 준현 보유 주식 수
        * info[1][0] = 성민이 현금
        * info[1][1] = 성민 보유 주식 수
        * */

        // 준현
        info[0][0] = n;
        for (int i = 0; i < arr.length; i++) {
            if (info[0][0] >= arr[i]) { // 매수 가능한 경우
                // 매수 가능 주식 수
                int ava = info[0][0] / arr[i];
                info[0][1] += ava; // 보유주식수
                info[0][0] -= (ava * arr[i]); // 남은 현금
//                System.out.println(i + "준현 남은 현금 : " + info[0][0] + ", 보유 주식 수 : " + info[0][1]);
            }
        }
        info[0][0] += (info[0][1] * arr[13]);

        // 성민
        info[1][0] = n;
        int upDay = 0;
        int downDay = 0;
        int prev = -1;
        for (int i = 0; i < arr.length; i++) {
            if (prev < arr[i]) {
                upDay++;
                downDay = 0;
            } else if (prev > arr[i]) {
                downDay++;
                upDay = 0;
            }
            prev = arr[i];

            if (upDay == 3) {
                upDay--;
                downDay = 0;
                info[1][0] += (info[1][1] * arr[i]);
                info[1][1] = 0;
//                System.out.println("성민 남은 현금 : " + info[1][0] + ", 보유 주식 수 : " + info[1][1]);
            } else if (downDay == 3) {
                int ava = info[1][0] / arr[i];
                info[1][1] += ava;
                info[1][0] -= (ava * arr[i]);
                upDay = 0;
                downDay--;
//                System.out.println("성민 남은 현금 : " + info[1][0] + ", 보유 주식 수 : " + info[1][1]);
            }

        }
        info[1][0] += (info[1][1] * arr[13]);

//        System.out.println("준현 : " + info[0][0]);
//        System.out.println("성민 : " + info[1][0]);
        if (info[0][0] == info[1][0]) {
            System.out.println("SAMESAME");
        } else if (info[0][0] > info[1][0]) {
            System.out.println("BNP");
        } else {
            System.out.println("TIMING");
        }

        sc.close();


    }
}
