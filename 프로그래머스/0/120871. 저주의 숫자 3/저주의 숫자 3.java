class Solution {
    public int solution(int n) {
        
        int i = 0; 
        int three = 0;
        while (true) {
            i++;
            three++;
            
            if (three % 3 == 0 || String.valueOf(three).contains("3")) { 
                
                while (true) {
                    three++;
                    if (!(three % 3 == 0 || String.valueOf(three).contains("3"))) {
                        break;
                    }
                }
                
            }
            
            if (i == n) {
                return three;
            }
            
            
        }
        
    }
}