import java.util.*;

public class Main {

}

class Solution {
    public int maxProduct(int[] nums) {
        int[][] dp = new int[nums.length][2];

        if (nums.length == 1) {
            return nums[0];
        }

        dp[0][0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = -1;
        }

        int a = nums[1] * nums[0];
        int bigger = a > nums[1] ? a : nums[1];
        int smaller = a < nums[1] ? a : nums[1];
        if (bigger >= 0) {
            dp[1][0] = bigger;
        }
        if (smaller < 0) {
            dp[1][1] = smaller;
        }

        for (int i = 2; i < nums.length; i++) {
            int tmp = nums[i] > nums[i] * dp[i - 1][0] ? nums[i] : nums[i] * dp[i - 1][0];
            bigger = tmp > nums[i] * dp[i - 1][1] ? tmp : nums[i] * dp[i - 1][1];

            tmp = nums[i] < nums[i] * dp[i - 1][0] ? nums[i] : nums[i] * dp[i - 1][0];
            smaller = tmp < nums[i] * dp[i - 1][1] ? tmp : nums[i] * dp[i - 1][1];

            if (bigger >= 0) {
                dp[i][0] = bigger;
            }
            if (smaller < 0) {
                dp[i][1] = smaller;
            }
        }

        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            maxProduct = Math.max(maxProduct, dp[i][0]);
        }

        return maxProduct;
    }
}