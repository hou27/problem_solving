import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 보드의 크기(퀸의 수이기도 함.)

        sc.close();

        System.out.println(backtracking(N, N));
    }

    public static int backtracking(int N, int idx) {

        // System.out.println("idx: " + idx);
        int cnt = 0;
        Stack<ArrayList<Integer>> stack = new Stack<>();
        for (int i = N - 1; i >= 0; i--) {
            stack.push(new ArrayList<>(Arrays.asList(i)));
        }

        while (!stack.isEmpty()) {
            ArrayList<Integer> curr = stack.pop();

            if (isPossible(N, curr)) {
                if (curr.size() == N) {
                    cnt++;
                    continue;
                } else {
                    for (int i = N - 1; i >= 0; i--) {
                        ArrayList<Integer> next = new ArrayList<>(curr);
                        next.add(i);
                        stack.push(next);
                    }
                }
            }
        }

        return cnt;
    }

    public static boolean isPossible(int N, ArrayList<Integer> queens) {
        int[][] board = new int[N][N];
        for (int i = 0; i < queens.size(); i++) {
            board[i][queens.get(i)] = 1;
        }

        int x = queens.size() - 1;
        int y = queens.get(x);

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
