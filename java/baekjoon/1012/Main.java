import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int t = 0; t < T; t++) {
            int M = sc.nextInt(), N = sc.nextInt(), K = sc.nextInt();
            int grid[][] = new int[M][N];
            int cnt = 0;
            boolean visited[][] = new boolean[M][N];

            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                grid[x][y] = 1;
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (grid[i][j] == 1) {
                        cnt++;
                        dfs(grid, visited, i, j);
                    }
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }

    public static void dfs(int[][] grid, boolean[][] visited, int startX, int startY) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] { startX, startY });
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 }; // 상하좌우

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int x = curr[0];
            int y = curr[1];

            if (visited[x][y]) {
                continue;
            }
            visited[x][y] = true;
            grid[x][y] = 0;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= grid.length || ny < 0 || ny >= grid[0].length) {
                    continue;
                }

                if (visited[nx][ny] || grid[nx][ny] == 0) {
                    continue;
                }

                stack.push(new int[] { nx, ny });
            }

        }
    }

}
