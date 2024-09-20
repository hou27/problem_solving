import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] map = new int[M][N];
        for (int i = 0; i < M; i++) {
            String line = sc.next();
            String[] values = line.split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(values[j]);
            }
        }

        sc.close();

        for (int i = 0; i < N; i++) {
            if (map[0][i] == 0) {
                if (dfs(map, 0, i)) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }

    public static boolean dfs(int[][] map, int x, int y) {
        Stack<int[]> stack = new Stack<>();
        int M = map.length;
        int N = map[0].length;
        boolean[][] visited = new boolean[M][N];
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 }; // 상하좌우
        stack.push(new int[] { x, y });

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            x = current[0];
            y = current[1];

            if (visited[x][y]) {
                continue;
            }
            visited[x][y] = true;

            if (x == M - 1) {
                return true;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                    continue;
                }

                if (map[nx][ny] == 0 && !visited[nx][ny]) {
                    stack.push(new int[] { nx, ny });
                }
            }
        }

        return false;
    }
}