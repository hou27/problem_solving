import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[][] grid = new int[N][N];
        Set<Integer> heightSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] nums = line.split(" ");

            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(nums[j]);
                heightSet.add(grid[i][j]);
            }
        }

        sc.close();

        List<Integer> heightList = new ArrayList<>(heightSet);
        Collections.sort(heightList, Collections.reverseOrder());

        int max = 0;
        for (int i = 0; i < heightList.size(); i++) {
            int cnt = bfs(heightList.get(i), N, grid);

            if (max < cnt) {
                max = cnt;
            } else if (max > cnt) {
                break;
            }
        }

        System.out.println(max);
    }

    public static int bfs(int height, int N, int[][] grid) {
        Stack<int[]> stack = new Stack<int[]>();
        boolean[][] visited = new boolean[N][N];
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] > height && !visited[i][j]) {
                    stack.add(new int[] { i, j });

                    while (!stack.isEmpty()) {
                        int[] curr = stack.pop();
                        int x = curr[0], y = curr[1];

                        if (!visited[x][y]) {
                            visited[x][y] = true;

                            for (int d = 0; d < 4; d++) {
                                int nx = x + dx[d];
                                int ny = y + dy[d];

                                if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                                    continue;
                                }
                                if (visited[nx][ny] || grid[nx][ny] <= height) {
                                    continue;
                                }
                                stack.add(new int[] { nx, ny });
                            }
                        }
                    }

                    cnt++;
                }
            }
        }

        return cnt;
    }
}
