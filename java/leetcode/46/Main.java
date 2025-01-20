import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = solution.permute(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        bfs(nums, result);
        return result;
    }

    static void bfs(int[] nums, List<List<Integer>> result) {
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(new ArrayList<>());
        for (int num : nums) { // 각 숫자를 가능한 자리에 배치하기 위한 루프
            int size = queue.size();
            for (int i = 0; i < size; i++) { // 모든 이전에 제작된 케이스들에 대해 작업
                List<Integer> curr = queue.poll();
                for (int j = 0; j <= curr.size(); j++) { // 모든 가능한 자리에 배치
                    List<Integer> tmp = new ArrayList<>(curr);
                    tmp.add(j, num);
                    if (tmp.size() == nums.length) {
                        result.add(tmp);
                    } else {
                        queue.offer(tmp);
                    }
                }
            }
        }
    }
}