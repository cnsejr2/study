class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int remain = 0;
        while (chicken > 0) {
            answer += chicken / 10;
            remain += chicken % 10;
            chicken /= 10;
        }
        chicken = remain;
        remain = 0;
        while (chicken > 0) {
            answer += chicken / 10;
            remain += chicken % 10;
            chicken /= 10;
        }
        return answer + (remain / 10);
    }
}