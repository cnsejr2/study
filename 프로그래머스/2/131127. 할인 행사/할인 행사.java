class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for (int i = 0; i < discount.length - 9; i++) {
            int[] check = number.clone();
            boolean flag = false;
            for (int j = i; j < 10 + i; j++) {
                for (int k = 0; k < number.length; k++) {
                    if (discount[j].equals(want[k])) {
                        check[k]--;
                        if (check[k] < 0) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag) {
                    break;
                }
            }
            flag = false;
            for (int k = 0; k < check.length; k++) {
                if (check[k] > 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                answer++;
            }
        }
        
        return answer;
    }
}