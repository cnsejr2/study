class Solution {
    public String solution(String bin1, String bin2) {
        
        /*
            parseInt(String 문자열, int 진수) : 진수인 문자열 값을 10진수 int로 반환
        */
        
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int res = num1 + num2;
        
        /*
            toBinaryString : 10진수를 2진수로 바꾸어 String 타입으로 변환
        */
        
        return Integer.toBinaryString(res);
    }
}