class Solution {
    
    public static String makeStr(String s, int n) {
        
        // 0이 부족한 경우
        String zero = "";
        for (int i = 0; i < n; i++) {
            zero += "0";
        }
        
        return zero + s;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);
            
            if (str1.length() < n) {
                str1 = makeStr(str1, n - str1.length());
            }
            
            if (str2.length() < n) {
                str2 = makeStr(str2, n - str2.length());
            }
            answer[i] = "";
            for (int j = 0; j < n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
            
        }
        
        
        return answer;
    }
}