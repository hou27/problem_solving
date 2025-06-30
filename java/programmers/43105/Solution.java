import java.util.*;

// class Solution {
//     public int solution(int[][] triangle) {
//         int n = triangle.length;
//         List<List<Integer>> dp = new ArrayList<>();
//         List<Integer> firstRow = new ArrayList<>();
//         firstRow.add(triangle[0][0]);
//         dp.add(firstRow);

//         for (int i = 1; i < n; i++) {
//             List<Integer> h = new ArrayList<>();
//             List<Integer> prevRow = dp.get(i - 1);
//             for (int j = 0; j < i + 1; j++) {
//                 int currValue = triangle[i][j];
//                 int value = -1;
//                 if (j == 0) {
//                     value = prevRow.get(j) + currValue;
//                 } else if (j == i) {
//                     value = prevRow.get(j - 1) + currValue;
//                 } else {
//                     int case1 = prevRow.get(j - 1) + currValue;
//                     int case2 = prevRow.get(j) + currValue;

//                     value = case1 > case2 ? case1 : case2;
//                 }
//                 h.add(value);
//             }
//             dp.add(h);
//         }

//         List<Integer> lastRow = dp.get(n - 1);

//         return Collections.max(lastRow);
//     }
// }

class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n][n];

        dp[0][0] = triangle[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int currValue = triangle[i][j];
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + currValue;
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + currValue;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + currValue;
                }
            }
        }

        int max = 0;
        for (int val : dp[n - 1]) {
            if (val > max)
                max = val;
        }

        return max;
    }
}
