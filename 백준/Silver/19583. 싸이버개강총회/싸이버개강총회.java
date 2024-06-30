import java.io.*;
import java.util.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String s, e, q;
    Set<String> S = new HashSet<>();
    int ans = 0;

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        s = st.nextToken();
        e = st.nextToken();
        q = st.nextToken();
        String input;
        while ((input = br.readLine()) != null) {
            String[] str = input.split(" ");
            if (str[0].compareTo(s) <= 0)
                S.add(str[1]);
            else if (str[0].compareTo(e) >= 0 && str[0].compareTo(q) <= 0) {
                if (S.contains(str[1])) {
                    ans++;
                    S.remove(str[1]);
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}