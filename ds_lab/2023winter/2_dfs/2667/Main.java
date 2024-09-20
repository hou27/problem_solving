import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 지도의 크기
        int[][] map = new int[N][N];

        // 지도 입력
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int[][] visited = new int[N][N];
        int cnt = 0; // 단지 수
        int[] houseCnt = new int[N * N]; // 단지별 집 수
        int houseIdx = 0; // 단지별 집 수 인덱스

        // DFS
        for (int i = 0; i < N; i++) { // 행
            for (int j = 0; j < N; j++) { // 열
                if (map[i][j] == 1 && visited[i][j] == 0) { // 집이 있고 방문하지 않았다면
                    cnt++; // 단지 수 증가
                    houseCnt[houseIdx]++; // 단지별 집 수 증가
                    visited[i][j] = cnt; // 방문 표시
                    dfs(i, j, map, visited, cnt, houseCnt, houseIdx); // DFS
                    houseIdx++; // 단지별 집 수 인덱스 증가
                }
            }
        }
        
        // 단지별 집 수 오름차순 정렬
        Arrays.sort(houseCnt, 0, houseIdx); // 집이 없는 단지는 0으로 되어 있으므로 0은 제외하고 정렬

        System.out.println(cnt);
        for (int i = 0; i < houseIdx; i++) {
            System.out.println(houseCnt[i]);
        }
        
        sc.close();
    }

    public static void dfs(int x, int y, int[][] map, int[][] visited, int cnt, int[] houseCnt, int houseIdx) {
        int[] dx = {0, 0, -1, 1}; // 상하좌우
        int[] dy = {-1, 1, 0, 0}; // 상하좌우

        for (int i = 0; i < 4; i++) { // 상하좌우
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < map.length && ny >= 0 && ny < map.length) { // 범위 체크
                if (map[nx][ny] == 1 && visited[nx][ny] == 0) { // 집이 있고 방문하지 않았다면
                    visited[nx][ny] = cnt; // 방문 표시
                    houseCnt[houseIdx]++; // 단지별 집 수 증가
                    dfs(nx, ny, map, visited, cnt, houseCnt, houseIdx); // DFS
                }
            }
        }
    }
}
