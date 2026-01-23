import java.util.*;

public class Main {
    static int n, t;
    static int[][] grid;
    static int[][] dp1;
    static int[][] dp2;
    static final int NEG = Integer.MIN_VALUE;

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
                int value = NEG;
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
                int value = NEG;
                if (i < n - 1) {
                    value = Math.max(value, dp2[i + 1][j]);
                }
                if (j < n - 1) {
                    value = Math.max(value, dp2[i][j + 1]);
                }

                dp2[i][j] = value + grid[i][j];
            }
        }

        int result = dp1[n - 1][n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((n - 1 - i) + (n - 1 - j) < t) {
                    continue;
                }

                int[][] tmp = new int[t + 1][t + 1];
                for (int a = 0; a <= t; a++) {
                    Arrays.fill(tmp[a], NEG);
                }
                tmp[0][0] = grid[i][j];

                for (int dr = 0; dr <= t; dr++) {
                    for (int dc = 0; dc <= t; dc++) {
                        if (dr == 0 && dc == 0) {
                            continue;
                        }
                        if (dr + dc > t) {
                            continue;
                        }
                        int nr = i + dr;
                        int nc = j + dc;
                        if (nr >= n || nc >= n) {
                            continue;
                        }
                        int value = NEG;
                        if (dr > 0) {
                            value = Math.max(value, tmp[dr - 1][dc]);
                        }
                        if (dc > 0) {
                            value = Math.max(value, tmp[dr][dc - 1]);
                        }
                        if (value == NEG) {
                            continue;
                        }
                        tmp[dr][dc] = value + grid[nr][nc];
                    }
                }

                int otherBranch = NEG;
                for (int dr = 0; dr <= t; dr++) {
                    int dc = t - dr;
                    int nr = i + dr;
                    int nc = j + dc;
                    if (nr >= n || nc >= n) {
                        continue;
                    }
                    otherBranch = Math.max(otherBranch, tmp[dr][dc]);
                }
                if (otherBranch == NEG) {
                    continue;
                }
                int currVal = dp1[i][j] + dp2[i][j] + otherBranch - grid[i][j];
                result = Math.max(result, currVal);

                // for (int cnt = 0; cnt <= t; cnt++) {
                // if ((i - t + cnt) >= 0 && (j - cnt) >= 0) {
                // int tmp = dp2[i - t + cnt][j - cnt];
                // max = max > dp1[i][j] + tmp ? max : dp1[i][j] + tmp;
                // }
                // }
            }
        }

        System.out.println(result);
    }

}
