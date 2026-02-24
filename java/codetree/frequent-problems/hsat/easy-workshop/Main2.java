import java.util.*;

public class Main2 {
    static int[][][] visited;
    static int n, k;
    static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        sc.close();
        // Please write your code here.

        visited = new int[n][n][k + 1];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                Arrays.fill(visited[x][y], Integer.MAX_VALUE);
            }
        }

        int result = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxDiff = bfs(i, j);

                if ((maxDiff < result && maxDiff != -1) || result == -1) {
                    result = maxDiff;
                }
            }
        }

        System.out.println(result);
    }

    private static int bfs(int initX, int initY) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] { initX, initY, 1, 0 }); // x, y, len, max diff
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        int result = -1;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int currLen = curr[2];
            int currMaxDiff = curr[3];

            int nLen = currLen + 1;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                    continue;
                }

                int currDiff = grid[nx][ny] - grid[x][y];
                if (currDiff <= 0) {
                    continue;
                }

                // System.out.println("currDiff: " + currDiff);

                int nDiff = currMaxDiff < currDiff ? currDiff : currMaxDiff;

                if (nLen == k) {
                    if (result == -1 || result > nDiff) {
                        // System.out.println("nDiff: " + nDiff);
                        result = nDiff;
                    }
                    continue;
                }
                if (nDiff < visited[nx][ny][nLen]) {
                    visited[nx][ny][nLen] = nDiff;
                    queue.offer(new int[] { nx, ny, nLen, nDiff });
                }
            }
        }

        return result;
    }
}