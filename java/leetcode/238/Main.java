import java.util.*;

public class Main {

}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] tmpForward = new int[nums.length];
        int[] tmpBackward = new int[nums.length];
        tmpForward[0] = 1;
        tmpBackward[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            tmpForward[i] = tmpForward[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            tmpBackward[i] = tmpBackward[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            tmpForward[i] *= tmpBackward[i];
        }

        return tmpForward;
    }
}