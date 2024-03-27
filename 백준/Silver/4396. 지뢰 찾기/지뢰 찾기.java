import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] matrix;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        matrix = new int[n][n];
        // 지뢰 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken().toString();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '*') {
                    matrix[i][j] = 1;
                }
            }
        }

        char[][] charMat = new char[n][n];
        int check = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'x') {
                    if (matrix[i][j] == 1) {
                        check = 1;
                    } else {
                        charMat[i][j] = (char) (count(i, j) + '0');
                    }
                } else {
                    charMat[i][j] = '.';
                }
            }
        }
        if (check > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 1) {
                        charMat[i][j] = '*';
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(charMat[i][j]);
            }
            System.out.println();
        }
    }

    public static int count(int x, int y) {
        int count = 0;

        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = { -1, 1, 0, -1, 1, -1, 1, 0};

        for (int i = 0;  i < 8; i++) {
            int mx = dx[i] + x;
            int my = dy[i] + y;;

            if (mx > -1 && my > -1 && mx < n && my < n) {
                count += matrix[mx][my];
            }

        }

        return count;

    }
}
