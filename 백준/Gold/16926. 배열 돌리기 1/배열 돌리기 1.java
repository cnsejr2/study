import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < Math.min(n, m) / 2; j++) {
                int temp = map[j][j];

                // left
                for (int k = j; k < m - j - 1; k++) {
                    map[j][k] = map[j][k + 1];
                }

                // up
                for (int k = j; k < n - 1 - j; k++) {
                    map[k][m - j - 1] = map[k + 1][m - j - 1];
                }

                // right
                for (int k = m - j - 1; k > j; k--) {
                    map[n - 1 - j][k] = map[n - 1 - j][k - 1];
                }

                // down
                for (int k = n - j - 1; k > j; k--) {
                    map[k][j] = map[k - 1][j];
                }
                map[j + 1][j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
