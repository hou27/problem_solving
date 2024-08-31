import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 보드의 크기(퀸의 수이기도 함.)

        sc.close();

        System.out.println(backtracking(N));
    }

    public static int backtracking(int N) {
        int cnt = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i = N - 1; i >= 0; i--) {
            int[] initial = new int[1];
            initial[0] = i;
            stack.push(initial);
        }

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();

            if (isPossible(N, curr)) {
                if (curr.length == N) {
                    cnt++;
                    continue;
                } else {
                    for (int i = N - 1; i >= 0; i--) {
                        int[] next = Arrays.copyOf(curr, curr.length + 1);
                        next[curr.length] = i;
                        stack.push(next);
                    }
                }
            }
        }

        return cnt;
    }

    public static boolean isPossible(int N, int[] queens) {
        int size = queens.length;
        int x = size - 1;
        int y = queens[size - 1];

        for (int i = 0; i < size - 1; i++) {
            int otherX = i;
            int otherY = queens[i];

            // 같은 열 체크
            if (otherY == y) {
                return false;
            }

            // 대각선 체크
            if (Math.abs(otherX - x) == Math.abs(otherY - y)) {
                return false;
            }
        }

        return true;
    }
}