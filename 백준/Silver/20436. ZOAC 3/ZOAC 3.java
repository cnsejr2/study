import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<Character, String> board = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        makeKeyBoard();

        String[] left = board.get(sc.next().charAt(0)).split(" ");
        String[] right = board.get(sc.next().charAt(0)).split(" ");

        String str = sc.next();
        int distance = 0;
        String leftBoard = "qwertasdfgzxcv";
        for (int i = 0; i < str.length(); i++) {
            String[] goal = board.get(str.charAt(i)).split(" ");
            int move = 0;
            // 한글 자음 쪽 자판인 경우 - 왼쪽
            String cur = String.valueOf(str.charAt(i));
            if (leftBoard.contains(cur)) {
                move = compareDistance(goal, left);
                left[0] = goal[0];
                left[1] = goal[1];
            } else { // 한글 모음쪽 자판인 경우 - 오른쪽
                move = compareDistance(goal, right);
                right[0] = goal[0];
                right[1] = goal[1];
            }

            distance += move + 1;
        }

        System.out.println(distance);

        sc.close();

    }

    private static int compareDistance(String[] goal, String[] cur) {
        return Math.abs(Integer.parseInt(goal[0]) - Integer.parseInt(cur[0])) + Math.abs(Integer.parseInt(goal[1]) - Integer.parseInt(cur[1]));

    }

    private static void makeKeyBoard() {
        board.put('q', "0 0");
        board.put('w', "0 1");
        board.put('e', "0 2");
        board.put('r', "0 3");
        board.put('t', "0 4");
        board.put('y', "0 5");
        board.put('u', "0 6");
        board.put('i', "0 7");
        board.put('o', "0 8");
        board.put('p', "0 9");

        board.put('a', "1 0");
        board.put('s', "1 1");
        board.put('d', "1 2");
        board.put('f', "1 3");
        board.put('g', "1 4");
        board.put('h', "1 5");
        board.put('j', "1 6");
        board.put('k', "1 7");
        board.put('l', "1 8");

        board.put('z', "2 0");
        board.put('x', "2 1");
        board.put('c', "2 2");
        board.put('v', "2 3");
        board.put('b', "2 4");
        board.put('n', "2 5");
        board.put('m', "2 6");


    }
}
