import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] soldiers = new int[N + 1];
        int[] dp = new int[N + 1];
        int min = N;

        for (int i = 1; i <= N; i++) {
            soldiers[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 1; i <= N; i++) {
            dp[i] = N - 1;
            for (int j = 1; j < i; j++) {
                if (soldiers[i] < soldiers[j]) {
                    dp[i] = Math.min(dp[i], dp[j] - 1);
                    min = Math.min(min, dp[i]);
                }
            }
        }

        System.out.println(min);
    }

}
