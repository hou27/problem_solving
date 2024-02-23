class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[m][n]; // dp[i][j]까지 오는데 존재하는 최단 경로의 개수

        for (int[] puddle : puddles) {
            dp[puddle[0] - 1][puddle[1] - 1] = -1; // 물에 잠긴 지역 표시
        }

        // 첫번째 행과 열 초기화
        for (int i = 0; i < m; i++) {
            if (dp[i][0] == -1) {
                break;
            }
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (dp[0][i] == -1) {
                break;
            }
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (dp[i][j] == -1) {
                    continue;
                }
                if (dp[i - 1][j] != -1) {
                    dp[i][j] += dp[i - 1][j];
                }
                if (dp[i][j - 1] != -1) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        answer = dp[m - 1][n - 1] % 1000000007;

        return answer;
    }
}