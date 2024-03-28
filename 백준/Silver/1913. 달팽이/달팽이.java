import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 출처 : https://bbangson.tistory.com/110
 */
public class Main {

    static int[] dr = { 1, 0, -1, 0}; // 하, 우, 상, 좌
    static int[] dc = { 0, 1, 0, -1};
    static int map[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        map = new int[n][n];
        int kr = 0;
        int kc = 0;

        makeMap(n);

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                sb.append(map[i][j]).append(" ");
                if (map[i][j] == k) {
                    kr = i;
                    kc = j;
                }
            }
            sb.append("\n");
        }

        sb.append(kr + 1).append(" ").append(kc + 1);
        System.out.println(sb);

    }

    public static void makeMap(int n) {
        int r = 0;
        int c = 0;
        int count = n * n;
        int d = 0;

        while (true) {
            if (count == 0) {
                break;
            }

            map[r][c] = count--;
            int nr = r + dr[d];
            int nc = c + dc[d];
            int nd = setDirection(d, n, nr, nc);

            // 방향이 바뀌면 다음 방향을 기준으로 r, c를 업데이트
            if (nd != d) {
                r = r + dr[nd];
                c = c + dc[nd];
                d = nd;
            } else {
                r = nr;
                c = nc;
            }
        }
    }

    public static int setDirection(int d, int n, int nr, int nc) {
        // 범위 벗어남
        if (nr >= n || nc >= n || nr < 0 || nc < 0) {
            d = (d + 1) % 4;
        } else if (map[nr][nc] != 0) { // 이미 값이 있음
            d = (d + 1) % 4;
        }
        return d;
    }
}
