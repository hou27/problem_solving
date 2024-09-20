import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] cost = new int[N][3];
        int[][] dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < 3; i++) {
            dp[0][i] = cost[0][i];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][j];
                } else if (j == 1) {
                    dp[i][j] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][j];
                }
            }
        }

        int min = 1000 * N;
        for (int i = 0; i < 3; i++) {
            min = Math.min(min, dp[N - 1][i]);
        }

        System.out.println(min);
    }

}
