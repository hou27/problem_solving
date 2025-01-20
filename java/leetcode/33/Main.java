public class Main {
    public static void main(String[] args) {

    }
}

// Real Submission
class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int pivot = left;
        left = 0;
        right = len - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            int realMid = (mid + pivot) % len;
            if (nums[realMid] == target) {
                return realMid;
            }
            if (nums[realMid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[(left + pivot) % len] == target ? (left + pivot) % len : -1;
    }
}
