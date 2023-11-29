import java.util.*;

class Solution {
    public int solution(int alp, int cop, int[][] problems) {
        int targetAl = 0, targetCo = 0;

        //목표 알고력과 코딩력을 구한다
        for (int[] p : problems) {
            targetAl = Math.max(p[0], targetAl);
            targetCo = Math.max(p[1], targetCo);
        }

        //목표 지점을 지나치고 능력치가 올라가는 경우, 목표 능력치로 낮춰주는 작업이 필요
        //그렇지 않으면 목표 능력치만 맞추면 되는데 더 큰 값으로 넘어가버려서 목표 능력치에 대한 접근을 건너뛰게 됨

        //두 값이 모두 목표값인 경우
        if (alp >= targetAl && cop >= targetCo) {
            return 0;
        }

        //목표값보다 초기값이 큰 경우
        if (alp >= targetAl) {
            alp = targetAl;
        }
        if (cop >= targetCo) {
            cop = targetCo;
        }

        //[알고력][코딩력] 상태에 도달하는 최단 시간 > 답은 [목표알고력][목표코딩력]
        int[][] dp = new int[targetAl + 2][targetCo + 2];

        for (int i=alp; i<=targetAl; i++) {
            for (int j=cop; j<=targetCo; j++) {
                dp[i][j] = Integer.MAX_VALUE; //비교를 최소화하기 위해 최대값으로 초기화
            }
        }

        dp[alp][cop] = 0;

        for(int i=alp; i<=targetAl; i++){
            for(int j=cop; j<=targetCo; j++){

                dp[i+1][j]=Math.min(dp[i+1][j],dp[i][j]+1);

                dp[i][j+1]=Math.min(dp[i][j+1],dp[i][j]+1);

                for(int[] p :problems){
                    if(i>=p[0] && j>=p[1]){
                        if(i+p[2]>targetAl && j+p[3]>targetCo){
                            dp[targetAl][targetCo]=Math.min(dp[targetAl][targetCo],dp[i][j]+p[4]);
                        }
                        else if(i+p[2] > targetAl){
                            dp[targetAl][j+p[3]]=Math.min(dp[targetAl][j+p[3]],dp[i][j]+p[4]);
                        }
                        else if(j+p[3] > targetCo){
                            dp[i+p[2]][targetCo]=Math.min(dp[i+p[2]][targetCo],dp[i][j]+p[4]);
                        }
                        else if(i+p[2]<=targetAl && j+p[3]<=targetCo){
                            dp[i+p[2]][j+p[3]]=Math.min(dp[i+p[2]][j+p[3]],dp[i][j]+p[4]);
                        }
                    }

                }
            }
        }

        return dp[targetAl][targetCo];
    }
}