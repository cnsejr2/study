import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        
        char[] ch = my_string.toCharArray();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (char c : ch) {
            if (c >= '0' && c <= '9') {
                list.add(c - '0');
            }
        }
        list.sort(Comparator.naturalOrder());

        return list;
    }
}