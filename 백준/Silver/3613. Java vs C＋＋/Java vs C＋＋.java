import java.util.Scanner;

public class Main {

    static boolean isLan = false; // true : Java, false : C++
    static boolean allLower = true;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (!(isCpp(s) && isJava(s) && checkLan(s))) {
            System.out.println("Error!");
            return;
        }

        if (allLower) {
            System.out.println(s);
            return;
        }

        if (isLan) {
            s = changeToCpp(s);
        } else {
            s = changeToJava(s);
        }

        System.out.println(s);

        sc.close();



    }

    private static String changeToJava(String s) { // Java로 변환
        String result = "";
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '_') {
                flag = true;
            } else {
                if (flag) {
                    result += Character.toUpperCase(c);
                } else {
                    result += c;
                }
                flag = false;
            }
        }


        return result;
    }

    private static String changeToCpp(String s) { // C++로 변환
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += "_";
                result += Character.toLowerCase(c);
            } else {
                result += c;
            }
        }

        return result;
    }

    private static boolean checkLan(String s) {
        boolean isUpperCase = false;
        boolean isUnderBar = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                isUpperCase = true;
            } else if (ch == '_') {
                isUnderBar = true;
            }
        }

        allLower = (isUnderBar == true || isUpperCase == true) ? false : true;

        if ((isUnderBar & isUpperCase) == false || allLower) {
            isLan = (isUnderBar == true) ? false : true;
            return true;
        } else {
            return false;
        }


    }

    private static boolean isJava(String s) {
        return (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') ? false : true;
    }

    private static boolean isCpp(String s) {
        if (s.charAt(s.length() - 1) == '_') {
            return false;
        } else if (s.charAt(0) == '_') {
            return false;
        } else if (s.indexOf("__") >= 0) {
            return false;
        }
        return true;
    }

}
