import java.util.*;

public class Main {

}

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 2) {
                    queue.add(new int[] { j, i });
                }
            }
        }

        return bfs(grid, queue);
    }

    public static int bfs(int[][] grid, Queue<int[]> queue) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        int time = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];

            if (visited[x][y])
                continue;
            visited[x][y] = true;

            boolean flag = false;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= grid.length || nx < 0 || ny >= grid[0].length || ny < 0)
                    continue;
                if (grid[nx][ny] == 2 || grid[nx][ny] == 0)
                    continue;
                if (grid[nx][ny] == 1) {
                    grid[nx][ny] = 2;
                    queue.add(new int[] { nx, ny });
                    flag = true;
                }
            }
            if (flag)
                time++;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return time;
    }
}