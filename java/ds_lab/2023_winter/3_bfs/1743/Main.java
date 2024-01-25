import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 세로 길이
        int M = sc.nextInt(); // 가로 길이
        int K = sc.nextInt(); // 음식물 쓰레기의 개수

        int[][] grid = new int[N][M];
        int[] dx = {0, 0, -1, 1}; // 상하좌우
        int[] dy = {-1, 1, 0, 0}; // 상하좌우
        
        for (int i = 0; i < K; i++) {
            int r = sc.nextInt() - 1; // 위에서부터의 좌표
            int c = sc.nextInt() - 1; // 왼쪽에서부터의 좌표
            grid[r][c] = 1;
        }

        Queue<int[]> q = new LinkedList<>();
        int max = 0; // 가장 큰 음식물 쓰레기의 크기

        // BFS
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int cnt = 0; // 음식물 쓰레기의 개수
                if (grid[i][j] == 1) { // 음식물 쓰레기가 있다면 bfs 시작
                    cnt++; // 음식물 쓰레기의 개수 증가
                    grid[i][j] = 0; // 방문 표시
                    q.add(new int[] {i, j}); // 큐에 넣고
                    while (!q.isEmpty()) {
                        int[] v = q.remove(); // 큐에서 하나 꺼냄
                        for (int k = 0; k < 4; k++) { // 상하좌우
                            int nx = v[0] + dx[k];
                            int ny = v[1] + dy[k];
                            if (nx >= 0 && nx < N && ny >= 0 && ny < M) { // index error 방지
                                if (grid[nx][ny] == 1) { // 음식물 쓰레기가 있다면
                                    cnt++; // 음식물 쓰레기의 개수 증가
                                    grid[nx][ny] = 0; // 방문 표시
                                    q.add(new int[] {nx, ny}); // 큐에 넣고
                                }
                            }
                        }
                    }
                    max = Math.max(max, cnt); // 가장 큰 음식물 쓰레기의 크기 갱신
                }
            }
        }

        System.out.println(max);

        sc.close();
    }
}
