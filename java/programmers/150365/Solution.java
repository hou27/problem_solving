import java.util.*;

class PathRecord {
    public int posX;
    public int posY;
    public String history;

    PathRecord(int posX, int posY, String history) {
        this.posX = posX;
        this.posY = posY;
        this.history = history;
    }
}

class Solution {
    public String solution(int n, int m, int x, int y, int r, int c, int k) {
        int[][] map = new int[n][m];

        return bfs(map, n, m, x - 1, y - 1, r - 1, c - 1, k);
    }

    // bfs로 k hop 경로 사전순으로 탐색 -> 마지막 위치가 목적지인 것 중 사전 순으로 가장 빠른 것 리턴
    static String bfs(int[][] map, int n, int m, int x, int y, int r, int c, int k) {
        Queue<PathRecord> queue = new LinkedList<>();
        int[] dx = { 1, 0, 0, -1 };
        int[] dy = { 0, -1, 1, 0 };
        char[] direction = { 'd', 'l', 'r', 'u' };
        queue.add(new PathRecord(x, y, ""));

        while (!queue.isEmpty()) {
            PathRecord curr = queue.poll();
            int posX = curr.posX;
            int posY = curr.posY;
            String history = curr.history;

            if (history.length() == k) {
                if (posX == r && posY == c) {
                    // candidates.add(history);
                    return history;
                }
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = posX + dx[i];
                int ny = posY + dy[i];
                String nHistory = history + direction[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                if (Math.abs(nx - r) + Math.abs(ny - c) > k - 1 - history.length()) {
                    continue;
                }
                queue.add(new PathRecord(nx, ny, nHistory));
                break;
            }
        }

        return "impossible";
    }
}