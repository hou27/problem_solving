import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 공간의 크기 N(2 ≤ N ≤ 20)
        int[][] grid = new int[N][N]; // 공간의 정보
        int[] sharkLoc = new int[2]; // 아기 상어의 위치

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] == 9) {
                    sharkLoc[0] = i;
                    sharkLoc[1] = j;
                    grid[i][j] = 0;
                }
            }
        }

        sc.close();

        System.out.println(bfs(grid, sharkLoc));
    }

    public static int bfs(int[][] grid, int[] sharkLoc) {
        int N = grid.length;
        boolean[][] visited = new boolean[N][N];
        int[] shark = new int[4]; // x, y, dist, size
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        int time = 0; // 아기 상어가 엄마 상어에게 도움을 요청하지 않고 물고기를 잡아먹을 수 있는 시간
        int eat = 0; // 아기 상어가 물고기를 먹은 횟수
        int minDist = Integer.MAX_VALUE; // 아기 상어가 먹을 수 있는 물고기 중 가장 가까운 물고기와의 거리
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { sharkLoc[0], sharkLoc[1], 0, 2 }); // x, y, dist, size
        // int stepCheckFlag = 1; // 사방을 다 돌았는지 확인하는 플래그

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            int dist = curr[2];
            int size = curr[3];
            // System.out.println("x: " + x + " y: " + y + " dist: " + dist + " size: " +
            // size);

            if (!visited[x][y]) {
                visited[x][y] = true;

                if (grid[x][y] != 0 && grid[x][y] < size) { // 먹을 수 있는 물고기인 경우
                    if (dist < minDist) { // 거리가 가장 가까운 물고기를 찾음
                        minDist = dist;
                        shark[0] = x;
                        shark[1] = y;
                        shark[2] = dist;
                        shark[3] = size;
                        // System.out
                        // .println("Set shark1: " + shark[0] + " " + shark[1] + " " + shark[2] + " " +
                        // shark[3]);
                    } else if (dist == minDist) { // 거리가 같다면
                        if (x < shark[0]) { // 가장 위에 있는 물고기
                            shark[0] = x;
                            shark[1] = y;
                            shark[2] = dist;
                            shark[3] = size;
                            // System.out
                            // .println("Set shark2: " + shark[0] + " " + shark[1] + " " + shark[2] + " "
                            // + shark[3]);
                        } else if (x == shark[0]) { // 가장 위에 있는 물고기가 여러마리라면
                            if (y < shark[1]) { // 가장 왼쪽에 있는 물고기
                                shark[0] = x;
                                shark[1] = y;
                                shark[2] = dist;
                                shark[3] = size;
                                // System.out.println(
                                // "Set shark3: " + shark[0] + " " + shark[1] + " " + shark[2] + " " +
                                // shark[3]);
                            }
                        }
                    }
                }

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx < 0 || nx >= N || ny < 0 || ny >= N || grid[nx][ny] > size || visited[nx][ny]) { // 이동할 수 없는
                                                                                                            // 경우
                        continue;
                    }

                    q.offer(new int[] { nx, ny, dist + 1, size });
                }

                // System.out.println("queue: ");
                // for (int[] qElem : q) {
                // System.out.println(qElem[0] + " " + qElem[1] + " " + qElem[2] + " " +
                // qElem[3]);
                // }
            }

            if (q.isEmpty()) { // 탐색이 끝났을 때
                // System.out.println("when q is empty");
                if (minDist != Integer.MAX_VALUE) {
                    // System.out.println("shark: " + shark[0] + " " + shark[1] + " " + shark[2] + "
                    // " + shark[3]);
                    // System.out.println("minDist: " + minDist);
                    time += minDist;
                    grid[shark[0]][shark[1]] = 0;
                    eat++;
                    if (eat == shark[3]) {
                        shark[3]++;
                        eat = 0;
                    }
                    q.clear();
                    q.offer(new int[] { shark[0], shark[1], 0, shark[3] });
                    visited = new boolean[N][N];
                    minDist = Integer.MAX_VALUE;
                }
            }

        }

        return time;
    }
}
