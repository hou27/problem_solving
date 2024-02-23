import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 상담이 가능한 일 수
        int[] T = new int[N]; // 상담을 완료하는데 걸리는 기간
        int[] P = new int[N]; // 상담을 했을 때 받을 수 있는 금액

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        int[] dp = new int[N]; // dp[i] = i번째 날까지의 상담과 해당 상담을 했을 때 받을 수 있는 최대 금액
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (i + T[i] <= N) { // 상담이 가능한 경우
                dp[i] = P[i]; // 상담을 했을 때 받을 수 있는 금액
                for (int j = 0; j < i; j++) { // i번째 날까지의 상담과 해당 상담을 했을 때 받을 수 있는 최대 금액을 구하기 위해 이전 상담들을 확인
                    if (j + T[j] <= i) { // 상담이 가능한 경우인지 계속 확인
                        dp[i] = Math.max(dp[i], dp[j] + P[i]); // i번째 날까지의 상담과 해당 상담을 했을 때 받을 수 있는 최대 금액 갱신
                    }
                }
            }
            max = Math.max(max, dp[i]); // 최대 수익 갱신
        }

        System.out.println(max);

        sc.close();
    }
}