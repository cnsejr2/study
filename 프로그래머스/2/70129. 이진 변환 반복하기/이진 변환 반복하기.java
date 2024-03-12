class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() > 1) {
            
            int prevLng = s.length();
            int afterLng = s.replaceAll("0", "").length();
            
            answer[1] += (prevLng - afterLng);
            
            s = Integer.toString(afterLng, 2);
            
            answer[0]++;
            
            
        }
        
        
        return answer;
    }
}