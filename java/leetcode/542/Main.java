import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }

}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = -1;
                } else {
                    queue.add(new int[] { i, j, 0 });
                }
            }
        }
        bfs(mat, queue);

        return mat;
    }

    static void bfs(int[][] mat, Queue<int[]> queue) {
        int m = mat.length, n = mat[0].length;
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        // queue.add(new int[] {initX, initY, 0});
        // int dist = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];

            if (visited[x][y])
                continue;

            visited[x][y] = true;

            // if (mat[x][y] != 0) {
            // // dist = curr[2];
            // mat[x][y] = curr[2];
            // break;
            // }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= m || nx < 0 || ny >= n || ny < 0) {
                    continue;
                }
                if (!visited[nx][ny] && mat[nx][ny] == -1) {
                    queue.add(new int[] { nx, ny, curr[2] + 1 });
                    mat[nx][ny] = curr[2] + 1;
                }
            }
        }

    }
}