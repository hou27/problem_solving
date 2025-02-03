import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sc.close();
        int[] dp = new int[16];
        dp[0] = 4;

        for (int i = 1; i < 16; i++) {
            int n = (int) Math.sqrt(dp[i - 1]);
            dp[i] = n * (n - 1) * 2 + (n - 1) * (n - 1) + dp[i - 1];
        }

        System.out.println(dp[N]);
    }
}
