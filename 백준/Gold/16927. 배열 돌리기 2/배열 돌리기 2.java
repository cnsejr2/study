import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m, r;
    static int[] dy = {1, 0, -1, 0}; // 하우상좌
    static int[] dx = {0, 1, 0, -1};
    static int[][] graph;
    static boolean visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        graph = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int a = n;
        int b = m;

        for (int i = 0; i < Math.min(n, m) / 2; i++) {
            rotate(i, 2 * a + 2 * b - 4);
            a -= 2;
            b -= 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(graph[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void rotate(int start, int len) {
        int rLen = r % len;

        for (int j = 0; j < rLen; j++) {
            int y = start;
            int x = start;

            int idx = 0;
            int pre = graph[start][start];
            int tmp = 0;

            while (idx < 4) {
                int yy = y + dy[idx];
                int xx = x + dx[idx];
                if (yy >= start && yy < n - start && xx >= start && xx < m - start) {
                    tmp = graph[yy][xx];
                    graph[yy][xx] = pre;
                    pre = tmp;
                    y = yy;
                    x = xx;
                } else {
                    idx++;
                }
            }
        }
    }
}
