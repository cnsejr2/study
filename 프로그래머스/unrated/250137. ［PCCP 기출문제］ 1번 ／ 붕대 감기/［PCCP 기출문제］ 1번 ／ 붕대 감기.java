

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // 마지막 공격 시간 구하기
        int len = attacks.length;
        int lastTime = attacks[len - 1][0];
        // 최대 체력
        int maxHealth = health;
        int a = 0; int success = 0;
        for (int i = 0; i <= lastTime; i++) {
            if (attacks[a][0] == i) { // 공격 받음
                health -= attacks[a][1];
                a++; 
                success = 0;
            } else { // 공격 안받음
                success++;
                health +=  bandage[1]; // 연속 성공
                if (success == bandage[0]) { // 연속성공 시간이 시전시간과 동일해진 경우
                    health += bandage[2];
                    success = 0; // 연속성공 시 초기화
                }
                if (maxHealth < health) { // 최대 체력보다 클수 없음
                    health = maxHealth;
                }
            }

            if (health <= 0) { return -1; }
        }
        
        return health;
    }
}