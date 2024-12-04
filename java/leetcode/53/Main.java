import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stringNums = sc.next().replace("[", "").replace("]", "").split(",");

        sc.close();

        // GPT area
        // // 문자열 배열을 정수 배열로 변환
        // int[] nums = Arrays.stream(stringNums)
        // .mapToInt(Integer::parseInt)
        // .toArray();
        // 정수 배열 생성
        int len = stringNums.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(stringNums[i]); // 각 요소를 정수로 변환
        }

        if (len == 1) {
            System.out.println(nums[0]);
            return;
        }

        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = nums[i];
        }

        int max = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + dp[i], dp[i]);
            // for (int j = i; j < len; j++) {
            // dp[i][j] = Math.max(dp[i - 1][j - 1] + nums[j], dp[i - 1][j]);
            if (max < dp[i])
                max = dp[i];
        }

        for (int i = 0; i < len; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();

        System.out.println(max);
        // e.g. 5, 4, -1, 7, 8
        // - 0 1 2 3 4
        // 0 5 4 -1 7 8
        // 1 - 9 3 7 15
        // 2 - - 8 10 15
        // 3 - - - 15 18
        // 4 - - - - 23
        // - 5 4 -1 7 8
        // - 5 9 -1 7 8
        // - 5 9 8 15 23
        /**
         * -2 1 -3 4 -1 2 1 -5 4
         * 0 1 -2 4 3 2 3 -4 4
         * 0 0 -2 4 3 5 3 -2 4
         * 0 0 0 4 3 5 6 -2 4
         * 0 0 0 0 3 5 6 1 4
         * 0 0 0 0 0 5 6 1 5
         * 0 0 0 0 0 0 6 1 5
         * 0 0 0 0 0 0 0 1 5
         * 0 0 0 0 0 0 0 0 5
         * 
         * -2 1 -2
         * 
         * -2 1 -3 4 -1 2 1 -5 4
         * 0 1 1 4 4 2 3 1 4
         * 0 0 1 5 4 6 3 3 5
         * 0 0 0 5 5 6 7 3 7
         * 0 0 0 0 5 7 7 7 7
         * 0 0 0 0 0 7 8 7 11
         * 0 0 0 0 0 0 8 8 11
         * 0 0 0 0 0 0 0 8 12
         * 0 0 0 0 0 0 0 0 12
         */
    }
}

// Real Submission
class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;

        if (len == 1) {
            return nums[0];
        }

        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = nums[i];
        }

        int max = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + dp[i], dp[i]);
            // for (int j = i; j < len; j++) {
            // dp[i][j] = Math.max(dp[i - 1][j - 1] + nums[j], dp[i - 1][j]);
            if (max < dp[i])
                max = dp[i];
        }

        return max;
    }
}
