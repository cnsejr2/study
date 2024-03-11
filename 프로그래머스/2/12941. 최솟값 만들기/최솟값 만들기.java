import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<Integer> bList = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            aList.add(A[i]);
            bList.add(B[i]);
        }
        
        Collections.sort(aList);
        Collections.sort(bList, Collections.reverseOrder());
        
        for (int i = 0; i < aList.size(); i++) {
            answer += (aList.get(i) * bList.get(i));
        }
        return answer;
    }
}