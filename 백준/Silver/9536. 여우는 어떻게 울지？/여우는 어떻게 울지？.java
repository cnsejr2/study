import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            List<String> list = new ArrayList<>();
            for (String a : str) {
                list.add(a);
            }
            while (true) {
                String s = br.readLine();
                if (s.equals("what does the fox say?")) {
                    break;
                }
                String[] say = s.split(" ");
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).equals(say[2])) {
                        list.remove(j);
                        j--;
                    }
                }

            }

            for (String l : list) {
                System.out.print(l + " ");
            }
            System.out.println();
        }


    }
}
