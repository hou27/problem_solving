import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

}

// class Solution {
// public int coinChange(int[] coins, int amount) {
// Arrays.sort(coins);
// return calculator(coins, amount, coins.length - 1, 0);
// }

// static int calculator(int[] coins, int amount, int idx, int depth) {
// int result = -1;
// if (amount == 0) {
// return depth;
// }
// for (int i = idx; i >= 0; i--) {
// if (amount >= coins[i]) {
// int remains = amount - coins[i];
// result = calculator(coins, remains, i, depth + 1);
// if (result != -1) {
// return result;
// }
// }
// }
// return result;
// }
// }

class Solution {
    public int coinChange(int[] coins, int amount) {
        // Arrays.sort(coins);
        int[] dp = new int[amount + 1];

        for (int i = 1; i < amount + 1; i++) {
            dp[i] = amount + 1;
        }
        for (int v : dp) {
            System.out.println(v + ", ");
        }

        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        for (int v : dp) {
            System.out.println(v + ", ");
        }

        return dp[amount] != amount + 1 ? dp[amount] : -1;
    }
}