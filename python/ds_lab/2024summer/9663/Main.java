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
        int[] queens = new int[N];
        int row = 0;
        queens[0] = -1;

        while (row > -1) {
            queens[row]++;

            // 가능한 자리에 퀸을 놓음
            for (;;) { // 가능한 자리를 찾을 때까지 반복
                if (queens[row] == N) {
                    break;
                }

                if (isPossible(queens, row)) {
                    break;
                }

                queens[row]++;
            }

            if (queens[row] == N) { // 놓을 수 있는 자리가 없으면 이전 행으로
                row--;
            } else if (row == N - 1) { // 마지막 행까지 놓을 수 있으면 카운트 증가
                cnt++;
            } else { // 다음 행으로
                row++;
                queens[row] = -1;
            }
        }

        return cnt;
    }

    public static boolean isPossible(int[] queens, int row) {
        for (int i = 0; i < row; i++) {
            int otherX = i;
            int otherY = queens[i];

            // 같은 열 체크
            if (otherY == queens[row]) {
                return false;
            }

            // 대각선 체크
            if (Math.abs(otherX - row) == Math.abs(otherY - queens[row])) {
                return false;
            }
        }

        return true;
    }
}