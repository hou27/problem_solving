import java.util.*;

public class Main {

}

// [Ref](https://leetcode.com/problems/combination-sum/description/comments/1845108)
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        stack.push(new ArrayList<>());

        while (!stack.isEmpty()) {
            List<Integer> curr = stack.pop();

            // 총합 계산
            int sum = 0;
            for (int i : curr) {
                sum += i;
            }

            if (sum == target) {
                result.add(new ArrayList<>(curr)); // 정답일 경우 처리
            } else if (sum < target) { // 아직 부족할 경우
                for (int candidate : candidates) {
                    // 모든 후보를 돌며 가장 마지막 값보다 크거나 같은 값을 추가하여 stack에 추가
                    if (curr.isEmpty() || candidate >= curr.get(curr.size() - 1)) {
                        List<Integer> newCombiantion = new ArrayList<>(curr);
                        newCombiantion.add(candidate);
                        stack.push(newCombiantion);
                    }
                }
            }
            // sum 초과일 경우 버림
        }

        return result;
    }
}