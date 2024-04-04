class Solution {
    public int solution(int order) {
        return String.valueOf(order).length() - String.valueOf(order).replaceAll("[369]", "").length();

    }
}