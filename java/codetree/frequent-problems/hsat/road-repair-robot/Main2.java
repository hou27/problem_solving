import java.util.*;

public class Main2 {
    static int N, K;
    static int[] positions;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        positions = new int[N];
        for (int i = 0; i < N; i++) {
            positions[i] = sc.nextInt();
        }

        sc.close();
        // Please write your code here.

        int left = 1;
        int right = positions[N - 1] - positions[0] + 1;

        if (K == 1) {
            System.out.println(right);
            return;
        }

        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (check(mid)) {
                right = mid - 1;
                result = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }

    private static boolean check(int len) {
        int pos = positions[0];
        int idx = 1;

        for (int i = 0; i < K; i++) {
            pos += len;

            // 다음 시작 위치로 pos를 이동
            while (pos > positions[idx]) {
                idx++;

                if (idx >= N) {
                    return true;
                }
            }
            pos = positions[idx];
            idx++;
        }

        if (pos > positions[N - 1]) {
            return true;
        }
        return false;
    }
}