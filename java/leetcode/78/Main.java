import java.util.*;

public class Main {

}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        makeSubset(nums, subset, 0, subsets);

        return subsets;
    }

    static void makeSubset(int[] nums, List<Integer> subset, int step, List<List<Integer>> subsets) {
        if (step >= nums.length) {
            subsets.add(subset);

            return;
        }

        List<Integer> newSubset1 = new ArrayList<>();
        newSubset1.addAll(subset);
        makeSubset(nums, newSubset1, step + 1, subsets);

        subset.add(nums[step]);
        List<Integer> newSubset2 = new ArrayList<>();
        newSubset2.addAll(subset);

        makeSubset(nums, newSubset2, step + 1, subsets);

        return;
    }
}
