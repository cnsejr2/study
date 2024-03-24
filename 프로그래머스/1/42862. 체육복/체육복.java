import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        ArrayList<Integer> lostList = new ArrayList<Integer>();
        
        for (int l : lost) {
            lostList.add(l);
        }
        
        Collections.sort(lostList);
        
        ArrayList<Integer> rList = new ArrayList<Integer>();
        
        for (int r : reserve) {
            rList.add(r);
        }
        Collections.sort(rList);
        
        for (int i  = 0; i < lostList.size(); i++) {
            if (rList.contains(lostList.get(i))) {
                rList.remove(Integer.valueOf(lostList.get(i)));
                lostList.remove(Integer.valueOf(lostList.get(i)));
            }
        }
        
        
        ArrayList<Integer> nList = new ArrayList<Integer>();
        
        for (int l : lostList) {
            int before = l - 1;
            int after = l + 1;
            int cur = l;
            if (rList.contains(cur)) {
                rList.remove(Integer.valueOf(cur));
                nList.add(l);
            } else if (rList.contains(before)) {
                rList.remove(Integer.valueOf(before));
                nList.add(l);
            } else if (rList.contains(after)) {
                rList.remove(Integer.valueOf(after));
                nList.add(l);
            }

        }
        
        
        
        
        return n - (lostList.size() - nList.size());
    }
}