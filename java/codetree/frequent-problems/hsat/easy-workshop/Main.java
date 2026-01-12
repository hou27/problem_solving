import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        sc.close();
        // Please write your code here.

        int result = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxDiff = bfs(grid, n, i, j, k);
                // System.out.println("i: " + i + ", j: " + j + ", grid[i][j]: " + grid[i][j] +
                // ", maxDiff: " + maxDiff);
                if (result == -1 || (result > maxDiff && maxDiff != -1)) {
                    result = maxDiff;
                }
            }
        }

        System.out.println(result);
    }

    private static int bfs(int[][] grid, int n, int x, int y, int k) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { x, y, 1, 0 }); // x, y, path length, max difference
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        // int[][][] visited = new int[n][n][k + 1];
        HashMap<String, Integer> visited = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // Arrays.fill(visited[i][j], Integer.MAX_VALUE);
        // }
        // }
        visited.put(x + ":" + y + ":" + 1, 0);
        // visited[x][y][1] = 0;
        int result = -1;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currX = curr[0];
            int currY = curr[1];
            int currLen = curr[2];
            int currDiff = curr[3];

            // if (currDiff > visited[currX][currY][currLen]) {
            String currKey = currX + ":" + currY + ":" + currLen;
            if (currDiff > visited.get(currKey)) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = currX + dx[i];
                int ny = currY + dy[i];

                if (nx >= n || nx < 0 || ny >= n || ny < 0) {
                    continue;
                }

                int difference = grid[nx][ny] - grid[currX][currY];
                if (difference <= 0) {
                    continue;
                }

                // System.out.println("grid[nx][ny]: " + grid[nx][ny] + ", grid[currX][currY]: "
                // + grid[currX][currY]);
                // System.out.println("difference: " + difference);

                int nDiff = currDiff < difference ? difference : currDiff;
                int nLen = currLen + 1;

                if (nLen == k) {
                    if (result == -1 || result > nDiff) {
                        // System.out.println("update diff: " + nDiff);
                        result = nDiff;
                    }
                    continue;
                }

                String nKey = nx + ":" + ny + ":" + String.valueOf(nLen);
                if (nDiff < visited.getOrDefault(nKey, Integer.MAX_VALUE)) {
                    visited.put(nKey, nDiff);
                    queue.offer(new int[] { nx, ny, nLen, nDiff });
                }
            }
        }

        return result;
    }
}