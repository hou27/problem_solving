import java.util.*;

public class Main {

}

class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(new int[] { i, j }, visited, grid);
                    result++;
                }
            }
        }

        return result;
    }

    static void bfs(int[] loc, boolean[][] visited, char[][] grid) {
        Stack<int[]> stack = new Stack<>();
        stack.push(loc);
        int[] dx = { 0, 1, 0, -1 };
        int[] dy = { 1, 0, -1, 0 };

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();

            if (visited[curr[0]][curr[1]]) {
                continue;
            }
            visited[curr[0]][curr[1]] = true;

            for (int i = 0; i < 4; i++) {
                int nx = curr[0] + dx[i];
                int ny = curr[1] + dy[i];

                if (nx < 0 || nx >= visited.length || ny < 0 || ny >= visited[0].length) {
                    continue;
                }
                if (visited[nx][ny] || grid[nx][ny] == '0') {
                    continue;
                }

                stack.push(new int[] { nx, ny });
            }
        }

    }
}