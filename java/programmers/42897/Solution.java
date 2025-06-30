import java.util.*;

class Solution {
    public int solution(int[] money) {
        int n = money.length;

        // 첫번째 집과 마지막 집이 사실상 인접해있으므로 2가지 케이스 처리
        int[] dp1 = new int[n];
        dp1[0] = money[0];
        dp1[1] = money[0];

        int case1 = dp(money, dp1, 1);

        int[] dp2 = new int[n];
        dp2[0] = 0;
        dp2[1] = money[1];

        int case2 = dp(money, dp2, 0);

        return case1 > case2 ? case1 : case2;
    }

    static int dp(int[] money, int[] dp, int flag) {
        int n = money.length;
        for (int i = 2; i < n - flag; i++) {
            dp[i] = money[i] + dp[i - 1] - money[i - 1] > dp[i - 2] + money[i] ? money[i] + dp[i - 1] - money[i - 1]
                    : dp[i - 2] + money[i];
            // dp[i] = dp[i] > money[i] + dp[i - 1] - money[i - 1] ? dp[i] : money[i] + dp[i
            // - 1] - money[i - 1];
        }

        return dp[n - 1 - flag] > dp[n - 2 - flag] ? dp[n - 1 - flag] : dp[n - 2 - flag];
    }
}