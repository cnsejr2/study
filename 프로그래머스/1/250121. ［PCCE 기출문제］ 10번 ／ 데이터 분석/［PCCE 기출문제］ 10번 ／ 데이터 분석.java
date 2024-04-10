import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        int eva = -1;
        if (ext.equals("code")) { eva = 0; }
        if (ext.equals("date")) { eva = 1; }
        if (ext.equals("maximum")) { eva = 2; }
        if (ext.equals("remain")) { eva = 3; }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i][eva] < val_ext) {
                list.add(i);
            }
        }
        
        List<Integer> sList = new ArrayList<>();
        if (sort_by.equals("code")) { eva = 0; }
        if (sort_by.equals("date")) { eva = 1; }
        if (sort_by.equals("maximum")) { eva = 2; }
        if (sort_by.equals("remain")) { eva = 3; }
        for (int i = 0; i < list.size(); i++) {
            sList.add(data[list.get(i)][eva]);
        }
        Collections.sort(sList);
        int[][] answer = new int[sList.size()][4];
        for (int i = 0; i < sList.size(); i++) {
            for (int j = 0; j < data.length; j++) {
                if (sList.get(i) == data[j][eva]) {
                    answer[i][0] = data[j][0];
                    answer[i][1] = data[j][1];
                    answer[i][2] = data[j][2];
                    answer[i][3] = data[j][3];
                    data[j][eva] = -1;
                }
            }
        }
        
        
        return answer;
    }
}