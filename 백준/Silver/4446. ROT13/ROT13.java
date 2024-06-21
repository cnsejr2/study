import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<Character, Character> map = new HashMap<>();

        // Add mappings for lowercase letters
        map.put('a', 'e');
        map.put('i', 'o');
        map.put('y', 'u');
        map.put('e', 'a');
        map.put('o', 'i');
        map.put('u', 'y');
        map.put('b', 'p');
        map.put('k', 'v');
        map.put('x', 'j');
        map.put('z', 'q');
        map.put('n', 't');
        map.put('h', 's');
        map.put('d', 'r');
        map.put('c', 'l');
        map.put('w', 'm');
        map.put('g', 'f');
        map.put('p', 'b');
        map.put('v', 'k');
        map.put('j', 'x');
        map.put('q', 'z');
        map.put('t', 'n');
        map.put('s', 'h');
        map.put('r', 'd');
        map.put('l', 'c');
        map.put('m', 'w');
        map.put('f', 'g');

        // Add mappings for uppercase letters
        map.put('A', 'E');
        map.put('I', 'O');
        map.put('Y', 'U');
        map.put('E', 'A');
        map.put('O', 'I');
        map.put('U', 'Y');
        map.put('B', 'P');
        map.put('K', 'V');
        map.put('X', 'J');
        map.put('Z', 'Q');
        map.put('N', 'T');
        map.put('H', 'S');
        map.put('D', 'R');
        map.put('C', 'L');
        map.put('W', 'M');
        map.put('G', 'F');
        map.put('P', 'B');
        map.put('V', 'K');
        map.put('J', 'X');
        map.put('Q', 'Z');
        map.put('T', 'N');
        map.put('S', 'H');
        map.put('R', 'D');
        map.put('L', 'C');
        map.put('M', 'W');
        map.put('F', 'G');
        map.put('.', '.');
        map.put(' ', ' ');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        StringBuilder result = new StringBuilder();

        while ((line = br.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);

                if (map.containsKey(ch)) {
                    result.append(map.get(ch));
                } else {
                    result.append(ch);
                }
            }
            result.append("\n"); // 개행 문자 추가
        }

        System.out.print(result.toString());
    }
}