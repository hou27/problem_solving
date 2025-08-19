import java.util.*;

public class Main {

}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        String a = dfs(root, p.val);
        String b = dfs(root, q.val);
    }

    static String dfs(TreeNode root, int target) {
        Stack<HashMap<TreeNode, String>> stack = new Stack<>();
        HashMap<TreeNode, String> map = new HashMap<>();
        map.put(root, String.valueOf(root.val));
        stack.push(map);

        while (!stack.isEmpty()) {
            HashMap<TreeNode, String> curr = stack.pop();
            TreeNode currNode = curr.keySet().iterator().next();

            if (currNode.val == target) {
                return curr.get(currNode);
            }

            if (currNode.left != null) {
                HashMap<TreeNode, String> newMap = new HashMap<>();
                newMap.put(currNode.left, curr.get(currNode) + String.valueOf(currNode.left.val));
                stack.push(newMap);
            } else if (currNode.right != null) {
                HashMap<TreeNode, String> newMap = new HashMap<>();
                newMap.put(currNode.right, curr.get(currNode) + String.valueOf(currNode.right.val));
                stack.push(newMap);
            }
        }

        return "";
    }
}