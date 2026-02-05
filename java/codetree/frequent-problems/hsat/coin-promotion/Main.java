import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] cType = new char[n];
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            cType[i] = sc.next().charAt(0);
            coin[i] = sc.nextInt();
        }

        sc.close();
        // Please write your code here.

        int[][] dp = new int[n + 1][m + 1];

        for (int r = 0; r <= n; r++) {
            for (int c = 0; c <= m; c++) {
                dp[r][c] = -1;
            }
        }
        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            int value = coin[i - 1];
            for (int sum = 0; sum <= m; sum++) {
                int best = dp[i - 1][sum];
                int tmp = -1;
                if (sum >= value) {
                    if (cType[i - 1] == 'A') {
                        if (dp[i][sum - value] != -1) {
                            tmp = dp[i][sum - value] + 1;
                        }
                    } else {
                        if (dp[i - 1][sum - value] != -1) {
                            tmp = dp[i - 1][sum - value] + 1;
                        }
                    }
                }

                dp[i][sum] = getMinValue(best, tmp);
            }
        }

        System.out.println(dp[n][m]);
    }

    private static int getMinValue(int a, int b) {
        if (a == -1) {
            return b;
        }
        if (b == -1) {
            return a;
        }

        return Math.min(a, b);
    }
}
