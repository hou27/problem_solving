import java.util.*;

public class Main {
    static int n, t;
    static int[][] grid;
    static int[][] dp1;
    static int[][] dp2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        sc.close();
        // Please write your code here.

        dp1 = new int[n][n];
        dp2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp1[i][j] = grid[i][j];
                    continue;
                }
                int value = Integer.MIN_VALUE;
                if (i > 0) {
                    value = Math.max(value, dp1[i - 1][j]);
                }
                if (j > 0) {
                    value = Math.max(value, dp1[i][j - 1]);
                }

                dp1[i][j] = value + grid[i][j];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == n - 1 && j == n - 1) {
                    dp2[i][j] = grid[i][j];
                    continue;
                }
                int value = Integer.MIN_VALUE;
                if (i < n - 1) {
                    value = Math.max(value, dp2[i + 1][j]);
                }
                if (j < n - 1) {
                    value = Math.max(value, dp2[i][j + 1]);
                }

                dp2[i][j] = value + grid[i][j];
            }
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int max = dp1[n - 1][n - 1];
                for (int cnt = 0; cnt <= t; cnt++) {
                    if ((i - t + cnt) >= 0 && (j - cnt) >= 0) {
                        int tmp = dp2[i - t + cnt][j - cnt];
                        max = max > dp1[i][j] + tmp ? max : dp1[i][j] + tmp;
                    }
                }
                result = result > max ? result : max;
            }
        }

        System.out.println(result);
    }
}