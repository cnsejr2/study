import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[] cArr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static char[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            cArr = br.readLine().toCharArray();
            Arrays.sort(cArr); // 사전순 정렬
            visited = new boolean[cArr.length];
            result = new char[cArr.length];

            dfs(0);
        }
        System.out.print(sb);
    }

    private static void dfs(int depth) {
        if (depth == cArr.length) {
            sb.append(result).append("\n");
            return;
        }

        for (int i = 0; i < cArr.length; i++) {
            if (visited[i]) continue;
            
            if (i > 0 && cArr[i] == cArr[i - 1] && !visited[i - 1]) continue;
            
            visited[i] = true;
            result[depth] = cArr[i];
            dfs(depth + 1);
            visited[i] = false; // 백트래킹
        }
    }
}
