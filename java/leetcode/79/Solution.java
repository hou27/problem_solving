import java.util.*;

class Solution {
    static int m, n;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }

    private static boolean dfs(char[][] board, String word, int x, int y) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Stack<int[]> stack = new Stack<>();
        boolean[][] visited = new boolean[m][n];

        stack.push(new int[] {x, y, 0});

        if (1 == word.length()) {
            return true;
        }
        
        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int currX = curr[0];
            int currY = curr[1];
            int step = curr[2];

            if (visited[currX][currY]) {
                continue;
            }
            visited[currX][currY] = true;

            for (int i = 0; i < 4; i++) {
                int nx = currX + dx[i];
                int ny = currY + dy[i];

                if (nx >= m || nx < 0 || ny >= n || ny < 0) {
                    continue;
                }
                if (visited[nx][ny] || board[nx][ny] != word.charAt(step + 1)) {
                    continue;
                }

                if (step + 1 == word.length() - 1) {
                    return true;
                }
                stack.push(new int[] {nx, ny, step + 1});
            }
        }

        return false;
    }
}