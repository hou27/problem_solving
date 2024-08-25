import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 보드의 크기(퀸의 수이기도 함.)

        sc.close();

        int[][] board = new int[N][N];

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            cnt += backtracking(board, i);
            System.out.println("chk cnt: " + cnt);
        }

        System.out.println(cnt);
    }

    public static int backtracking(int[][] board, int idx) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }

        // System.out.println("idx: " + idx);
        int cnt = 0;
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] { 0, idx });
        int step = 0;

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int x = curr[0];
            int y = curr[1];

            if (x < step) {
                step--;
                for (int i = 0; i < board.length; i++) {
                    board[step][i] = 0;
                }
            }

            if (isPossible(board, x, y)) {
                board[x][y] = 1;
                step++;

                if (step == board.length && x == board.length - 1) {
                    cnt++;
                    step--;
                    for (int i = 0; i < board.length; i++) {
                        board[step][i] = 0;
                    }
                } else {
                    for (int i = 0; i < board.length; i++) {
                        stack.push(new int[] { x + 1, i });
                    }
                }
            }

            System.out.println("step: " + step);
            // print board
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        return cnt;
    }

    public static boolean isPossible(int[][] board, int x, int y) {
        for (int i = 0; i < board.length; i++) {
            if (i != x && board[i][y] == 1) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (i != y && board[x][i] == 1) {
                return false;
            }
        }

        for (int i = 1; x - i >= 0 && y - i >= 0; i++) {
            if (board[x - i][y - i] == 1) {
                return false;
            }
        }

        for (int i = 1; x + i < board.length && y + i < board.length; i++) {
            if (board[x + i][y + i] == 1) {
                return false;
            }
        }

        for (int i = 1; x - i >= 0 && y + i < board.length; i++) {
            if (board[x - i][y + i] == 1) {
                return false;
            }
        }

        for (int i = 1; x + i < board.length && y - i >= 0; i++) {
            if (board[x + i][y - i] == 1) {
                return false;
            }
        }

        return true;
    }
}
