import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

// Real Submission
class Solution {
    public boolean canPartition(int[] nums) {
        int size = nums.length;
        if (size == 0
                || size == 1
                || Arrays.stream(nums).sum() % 2 != 0) {
            return false;
        }

        int objNum = Arrays.stream(nums).sum() / 2;
        int[][] dp = new int[size + 1][objNum + 1];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 0);
        }

        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < objNum + 1; j++) {
                int above = dp[i - 1][j];
                int newValue = 0;
                if (j >= nums[i - 1]) {
                    newValue = dp[i - 1][j - nums[i - 1]] + nums[i - 1];
                }
                if (newValue == j) {
                    dp[i][j] = newValue;
                } else {
                    dp[i][j] = above;
                }
            }
        }

        if (dp[size][objNum] == objNum) {
            return true;
        }
        return false;
    }
}

/**
 * - 0 1 2 3 4 5 6 7 8 9 10 11
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 1 0 1 0 0 0 0 0 0 0 0 0 0 0
 * 5 0 1 0 0 0 5 6 0 0 0 0 0 0
 * 11 0 1 0 0 0 5 6 0 0 0 0 0 11
 * 5 0 1 0 0 0 5 6 0 0 0 10 11
 */
