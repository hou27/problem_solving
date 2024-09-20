import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[][] maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] row = sc.next().split("");
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(row[j]);
            }
        }

        sc.close();

        System.out.println(dfs(maze, N, M));
    }

    public static int dfs(int[][] maze, int N, int M) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        queue.add(new int[] { 0, 0, 1 });

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];
            if (!visited[x][y]) {
                visited[x][y] = true;
                if (x == N - 1 && y == M - 1) {
                    return curr[2];
                }
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                        continue;
                    }
                    if (!visited[nx][ny] && maze[nx][ny] == 1) {
                        queue.add(new int[] { nx, ny, curr[2] + 1 });
                    }
                }
            }
        }

        return -1;
    }
}
