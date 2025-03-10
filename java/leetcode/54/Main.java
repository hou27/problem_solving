import java.util.*;

public class Main {

}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        int[] loc = new int[] { 0, 0 };
        int[] dx = new int[] { 0, 1, 0, -1 };
        int[] dy = new int[] { 1, 0, -1, 0 };
        int direction = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < m * n; i++) {
            // System.out.println("Added: " + loc[0] + ", " + loc[1]);
            result.add(matrix[loc[0]][loc[1]]);
            visited[loc[0]][loc[1]] = true;

            int nx = loc[0] + dx[direction];
            int ny = loc[1] + dy[direction];

            // System.out.println("nx: " + nx + ", ny: " + ny);
            // System.out.println("loc[0]: " + loc[0] + ", loc[1]: " + loc[1]);

            if (nx >= m || nx < 0 || ny >= n || ny < 0 || visited[nx][ny]) {
                direction = (direction + 1) % 4;
                nx = loc[0] + dx[direction];
                ny = loc[1] + dy[direction];
            }
            // System.out.println("direction: " + direction);
            loc[0] = nx;
            loc[1] = ny;
        }

        return result;
    }
}
