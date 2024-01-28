import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] rectangle = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
        int characterX = 1;
        int characterY = 3;
        int itemX = 7;
        int itemY = 8;
        System.out.println(s.solution(rectangle, characterX, characterY, itemX, itemY));
        int[][] rectangle2 = {{2,1,7,5},{6,4,10,10}};
        int characterX2 = 3;
        int characterY2 = 1;
        int itemX2 = 7;
        int itemY2 = 10;
        System.out.println(s.solution(rectangle2, characterX2, characterY2, itemX2, itemY2));
    }
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        
        int[][] map = new int[50 * 2 + 1][50 * 2 + 1]; // 문제의 조건을 참고하여 map의 크기를 정함(최대 길이의 2배)
        int[][] visited = new int[50 * 2 + 1][50 * 2 + 1];

        // 직사각형 테두리 부분 1로 표시
        for (int i = 0; i < rectangle.length; i++) {
            int x1 = rectangle[i][0] * 2;
            int y1 = rectangle[i][1] * 2;
            int x2 = rectangle[i][2] * 2;
            int y2 = rectangle[i][3] * 2;

            for (int j = x1; j <= x2; j++) {
                map[j][y1] = 1;
                map[j][y2] = 1;
            }

            for (int j = y1; j <= y2; j++) {
                map[x1][j] = 1;
                map[x2][j] = 1;
            }
        }

        // 아이템 위치 표시
        map[itemX * 2][itemY * 2] = 2;

        // BFS
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {characterX * 2, characterY * 2});
        visited[characterX * 2][characterY * 2] = 1;

        while (!q.isEmpty()) {
            int[] xy = q.remove();
            int x = xy[0];
            int y = xy[1];

            if (map[x][y] == 2) {
                answer = (visited[x][y] - 1) / 2; // 최종 이동 거리
                break;
            }

            // 상하좌우
            int[] dx = {0, 0, -1, 1};
            int[] dy = {-1, 1, 0, 0};

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // index error 방지
                if (nx >= 0 && nx < map.length && ny >= 0 && ny < map.length) {
                    if ((map[nx][ny] == 1 || map[nx][ny] == 2) && visited[nx][ny] == 0) {
                        q.add(new int[] {nx, ny});
                        visited[nx][ny] = visited[x][y] + 1; // 이동 거리 계산
                    }
                }
            }
        }

        return answer;
    }
}