import java.util.*;

public class Main {

}

class Solution {
    public int maxArea(int[] height) {
        int[] dp = new int[height.length];

        for (int i = 1; i < height.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int h = height[i] > height[j] ? height[j] : height[i];
                int w = i - j;

                dp[j] = dp[j] > h * w ? dp[j] : h * w;
            }
        }

        return Arrays.stream(dp).max().getAsInt();
    }
}