import java.util.*;

public class Main {

}

class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    static int partition(int[] nums, int left, int right) {
        int p = left;
        int r = right - 1;
        int pivot = nums[right];

        while (p <= r) {
            while (p <= r && nums[p] <= pivot) {
                p++;
            }
            while (p <= r && nums[r] > pivot) {
                r--;
            }
            if (p < r) {
                int tmp = nums[p];
                nums[p] = nums[r];
                nums[r] = tmp;
            }
        }

        int tmp = nums[p];
        nums[p] = nums[right];
        nums[right] = tmp;

        return p;
    }

    static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = partition(nums, left, right);

            quickSort(nums, left, pivot - 1);
            quickSort(nums, pivot, right);
        }
    }
}