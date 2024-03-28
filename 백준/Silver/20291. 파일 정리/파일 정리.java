import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            String[] s = str.split("\\.");

            map.put(s[1], map.getOrDefault(s[1], 0) + 1);
        }

        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(key);
        }
        Collections.sort(list);

        for (String s : list) {
            System.out.println(s + " " + map.get(s));
        }

        sc.close();
    }
}
