import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}