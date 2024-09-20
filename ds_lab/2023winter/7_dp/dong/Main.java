// 최대 점수 구하기(냅색 알고리즘)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문제의 개수
        int M = sc.nextInt(); // 제한시간
        int[] dp = new int[M + 1]; // dp 배열 (제한시간까지의 최대 점수)
        int[] P = new int[N]; // 문제에 할당된 점수
        int[] T = new int[N]; // 문제를 푸는데 걸리는 시간

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
            T[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = M; j >= T[i]; j--) { // 거꾸로 탐색하는 이유: 이전 값이 필요하기 때문
                // for (int j = T[i]; j <= M; j++) {
                // 이해를 위한 출력문
                System.out.println(
                        "dp[" + j + "] = Math.max(" + "dp[" + j + "], " + "dp[" + (j - T[i]) + "] + " + P[i] + ")");
                // 값이 들어간 출력문
                System.out.println("dp[" + j + "] = Math.max(" + dp[j] + ", " + dp[j - T[i]] + " + " + P[i] + ")");
                dp[j] = Math.max(dp[j], dp[j - T[i]] + P[i]); // dp[j] = max(이전 dp[j], 이전 dp[j - T[i]] + P[i])
            }
        }

        System.out.println(Arrays.toString(dp));

        System.out.println(dp[M]);

        sc.close();
    }
}
