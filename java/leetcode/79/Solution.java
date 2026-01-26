import java.util.*;

class Solution {
    static int m, n;
    static char[][] globalBoard;
    static String globalWord;
    public boolean exist(char[][] board, String word) {
        globalBoard = board;
        globalWord = word;
        m = board.length;
        n = board[0].length;

        if (1 == word.length() && board[0][0] == word.charAt(0)) {
            return true;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[m][n];
                    if (dfs(i, j, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }

    private static boolean dfs(int x, int y, int step, boolean[][] visited) {
        if (visited[x][y] || globalBoard[x][y] != globalWord.charAt(step)) {
            return false;
        }
        if (step == globalWord.length() - 1) {
            return true;
        }

        visited[x][y] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                continue;
            }
            if (dfs(nx, ny, step + 1, visited)) {
                return true;
            }
        }

        visited[x][y] = false;

        return false;
    }
}
