import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 보드의 크기(퀸의 수이기도 함.)

        sc.close();

        System.out.println(backtracking(N, N));
    }

    public static int backtracking(int N, int idx) {
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
        int size = queens.size();
        int x = size - 1;
        int y = queens.get(size - 1);

        for (int i = 0; i < size - 1; i++) {
            int otherX = i;
            int otherY = queens.get(i);

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
