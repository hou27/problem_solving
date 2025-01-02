import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }

}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] output = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                output[i][j] = bfs(mat, i, j);
            }
        }

        return output;
    }

    static int bfs(int[][] mat, int initX, int initY) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        queue.add(new int[] { initX, initY, 0 });
        int dist = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];

            if (visited[x][y])
                continue;

            if (mat[x][y] == 0) {
                dist = curr[2];
                break;
            }

            visited[x][y] = true;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= m || nx < 0 || ny >= n || ny < 0) {
                    continue;
                }
                if (!visited[nx][ny]) {
                    queue.add(new int[] { nx, ny, curr[2] + 1 });
                }
            }
        }

        return dist;
    }
}