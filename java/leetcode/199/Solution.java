import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);

        return result;
    }

    static void dfs(TreeNode node, List<Integer> result) {
        Stack<Map<TreeNode, Integer>> stack = new Stack<>();
        List<Integer> visited = new ArrayList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        map.put(node, 1);
        stack.push(map);

        if (node == null) {
            return;
        }
        int cnt = 0;
        result.add(node.val);
        cnt++;

        while (!stack.isEmpty()) {
            Map.Entry<TreeNode, Integer> curr = stack.pop().entrySet().iterator().next();
            TreeNode currNode = curr.getKey();
            int depth = curr.getValue();

            if (visited.contains(currNode.val)) {
                continue;
            }
            visited.add(currNode.val);

            if (cnt < depth) {
                result.add(currNode.val);
                cnt++;
            }

            if (currNode.right != null) {
                Map<TreeNode, Integer> rightMap = new HashMap<>();
                rightMap.put(currNode.right, depth + 1);
                stack.push(rightMap);
            }
            if (currNode.left != null) {
                Map<TreeNode, Integer> leftMap = new HashMap<>();
                leftMap.put(currNode.left, depth + 1);
                stack.push(leftMap);
            }
        }
    }
}