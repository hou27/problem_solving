import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int num : nums) {
            if (dict.get(num) != null) {
                return num;
            } else {
                dict.put(num, 1);
            }
        }

        return 0;
    }
}