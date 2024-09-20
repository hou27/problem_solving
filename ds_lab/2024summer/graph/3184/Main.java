import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        String[][] map = new String[R][C];
        for (int i = 0; i < R; i++) {
            String line = sc.next();
            String[] values = line.split("");
            for (int j = 0; j < C; j++) {
                map[i][j] = values[j];
            }
        }

        sc.close();

        boolean[][] visited = new boolean[R][C];
        int accumulatedSheepCnt = 0;
        int accumulatedWolfCnt = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!map[i][j].equals("#") && !visited[i][j]) {
                    int[] detectionResult = bfs(map, visited, i, j);
                    int sheepCnt = detectionResult[0];
                    int wolfCnt = detectionResult[1];

                    if (sheepCnt > wolfCnt) {
                        accumulatedSheepCnt += sheepCnt;
                    } else {
                        accumulatedWolfCnt += wolfCnt;
                    }
                }
            }
        }

        System.out.println(accumulatedSheepCnt + " " + accumulatedWolfCnt);
    }

    public static int[] bfs(String[][] map, boolean[][] visited, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        int R = map.length;
        int C = map[0].length;
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 }; // 상하좌우
        queue.add(new int[] { x, y });

        int sheepCnt = 0;
        int wolfCnt = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            x = current[0];
            y = current[1];

            if (visited[x][y]) {
                continue;
            }
            visited[x][y] = true;
            if (map[x][y].equals("o")) {
                sheepCnt++;
            } else if (map[x][y].equals("v")) {
                wolfCnt++;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
                    continue;
                }

                if (!map[nx][ny].equals("#") && !visited[nx][ny]) {
                    queue.add(new int[] { nx, ny });
                }
            }
        }

        return new int[] { sheepCnt, wolfCnt };
    }

}
