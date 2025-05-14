public class Main {

}

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + dp[i - 1] > dp[i]) {
                dp[i + 1] = nums[i] + dp[i - 1];
            } else {
                dp[i + 1] = dp[i];
            }
        }

        return dp[nums.length];
    }
}

/**
 * [2,7,9,3,1]
 * 0 2 7 9 3 1
 * 0 2 7 11 11 12
 * 0
 */