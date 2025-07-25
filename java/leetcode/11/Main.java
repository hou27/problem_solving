import java.util.*;

public class Main {

}

class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int h, w;
        int maxArea = -1;
        int area = 0;

        while (l <= r) {
            h = height[l] > height[r] ? height[r] : height[l];
            w = r - l;
            area = h * w;
            if (maxArea < area) {
                maxArea = area;
            }

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}