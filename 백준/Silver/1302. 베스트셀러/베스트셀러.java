import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        String str = new String();

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            if (map.containsKey(str)) {
                map.replace(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        int max = 0;
        for (String a : map.keySet()) {
            max = Math.max(max, map.get(a));
        }

        ArrayList<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list);
        for (String l : list) {
            if (map.get(l) == max) {
                System.out.println(l);
                break;
            }
        }

    }
}
