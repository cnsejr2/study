import java.util.*;

class Solution {

    static ArrayList<Integer> list = new ArrayList<>();
    static HashSet<Integer> set = new HashSet<Integer>();
    static boolean[] visit;
    static int n;
    static String nString;
    
    public int solution(String numbers) {
        int answer = 0;
        
        n = numbers.length();
        nString = numbers;
        visit = new boolean[n];
        for (int i = 1; i <= numbers.length(); i++) {
            dfs(0, i);
        }
        
        return set.size();
    }
    
    public static void dfs(int s, int depth) {
        if (s == depth) {
            String num = "";
            for (int i = 0; i < list.size(); i++) {
               num += nString.charAt(list.get(i));
            }
            check(num);
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                list.add(i);
                dfs(i + 1, depth);
                list.remove(list.size() - 1);
                visit[i] = false;
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {			
            // n의 제곱근까지 나누기
            if (n % i == 0) 
                return false;
        }
        return true;
    }
    
    public static void check(String num) {
        
        int num1 = Integer.parseInt(num);
        
        if (!set.contains(num1)) {
            
            // 소수인지 아닌 지 확인
            if (isPrime(num1)) {
                set.add(num1);
            }
            
        }
        
    }
}