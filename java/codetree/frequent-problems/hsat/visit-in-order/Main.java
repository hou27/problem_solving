import java.util.*;

public class Main {
    static int n, m;
    static int[][] grid, targets;
    static HashSet<Integer> cases = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        targets = new int[m][2];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            targets[i][0] = x;
            targets[i][1] = y;
            grid[x][y] = -(i + 1);
        }

        sc.close();
        // Please write your code here.

        // r * n + c -> key
        explore(targets[0][0], targets[0][1], 0, 1);

        System.out.println(cases.size());
    }

    private static void explore(int r, int c, int path, int step) {
        System.out.println("r: " + r + ", c: " + c + ", grid[r][c]: " + grid[r][c]);
        System.out.println("path: " + Integer.toBinaryString(path));
        int[] dr = { 0, 0, -1, 1 };
        int[] dc = { -1, 1, 0, 0 };

        System.out.println("currStep: " + step);
        int mask = 1 << (r * n + c);
        path = path | mask;

        if (grid[r][c] == -m) {
            cases.add(path);
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!added: " +
                    cases.size());

            return;
        }

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            // System.out.println("phase 1");

            if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                continue;
            }

            int check = 1 << (nr * n + nc);
            // System.out.println("check: " + Integer.toBinaryString(check));
            // System.out.println("check & path: " + (check & path));
            if ((check & path) != 0) {
                continue;
            }

            // System.out.println("phase 2");

            boolean isNextTarget = grid[nr][nc] + step == -1;
            if (!(grid[nr][nc] == 0) && !isNextTarget) {
                continue;
            }

            // System.out.println("phase 3");

            int nstep = step;
            if (isNextTarget) {
                nstep += 1;
            }

            explore(nr, nc, path, nstep);
        }
    }
}