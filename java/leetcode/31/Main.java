import java.util.*;

public class Main {

}

class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        // 우측부터 역으로 정렬되지 않은 수를 찾고 그 수를 기준으로 우측에서 해당 수 다음으로 큰 것과 자리를 교체한 후 그 자리 우측 수들을
        // 오름차순 정렬
        if (len < 2) {
            return;
        }
        if (nums[len - 1] > nums[len - 2]) {
            int tmp = nums[len - 1];
            nums[len - 1] = nums[len - 2];
            nums[len - 2] = tmp;
            return;
        }

        for (int i = len - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                swap(nums, nums[i - 1], i);
                sort(nums, i, len - 1);
                return;
            }
        }

        sort(nums, 0, len - 1);
    }

    static public void swap(int[] nums, int source, int idx) {
        int target = nums[idx];
        int targetIdx = idx;
        for (int i = idx; i <= nums.length - 1; i++) {
            if (source < nums[i]) {
                target = nums[i];
                targetIdx = i;
            } else {
                break;
            }
        }
        nums[idx - 1] = target;
        nums[targetIdx] = source;
    }

    static public void sort(int[] nums, int l, int r) {
        // System.out.println("(Init - l: " + l + " r: " + r);

        int pivot = l;
        int initL = l;
        int initR = r;
        while (l < r) {
            while (nums[pivot] < nums[r] && l < r) {
                r--;
            }
            while (nums[l] <= nums[pivot] && l < r) {
                l++;
            }
            // System.out.println("l: " + l + " r: " + r);
            int tmp = nums[r];
            nums[r] = nums[l];
            nums[l] = tmp;
        }

        int tmp = nums[r];
        nums[r] = nums[pivot];
        nums[pivot] = tmp;

        if (r != initL) {
            sort(nums, initL, r - 1);
        }
        if (r != initR) {
            sort(nums, r + 1, initR);
        }
    }
}