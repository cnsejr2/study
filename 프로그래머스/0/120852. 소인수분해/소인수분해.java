/*
    출처 : https://tripleup.tistory.com/122
*/

import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!list.contains(i)) {
                    list.add(i);
                }
                n /= i;
            }
        }
        
        return list;
    }
}