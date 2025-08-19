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
        int[] pathP = findPath(root, p.val);
        int[] pathQ = findPath(root, q.val);

        int minLen = Math.min(pathP.length, pathQ.length);
        int lastCommonVal = pathP[0];

        for (int i = 1; i < minLen; i++) {
            if (pathP[i] != pathQ[i]) {
                return getNode(root, lastCommonVal);
            }
            lastCommonVal = pathP[i];
        }

        return getNode(root, lastCommonVal);
    }

    static int[] findPath(TreeNode root, int target) {
        Stack<Object[]> stack = new Stack<>();
        stack.push(new Object[] { root, new ArrayList<>(Arrays.asList(root.val)) });

        while (!stack.isEmpty()) {
            Object[] curr = stack.pop();
            TreeNode currNode = (TreeNode) curr[0];
            ArrayList<Integer> path = (ArrayList<Integer>) curr[1];

            if (currNode.val == target) {
                int[] result = new int[path.size()];
                for (int i = 0; i < path.size(); i++) {
                    result[i] = path.get(i);
                }
                return result;
            }

            if (currNode.right != null) {
                ArrayList<Integer> newPath = new ArrayList<>(path);
                newPath.add(currNode.right.val);
                stack.push(new Object[] { currNode.right, newPath });
            }

            if (currNode.left != null) {
                ArrayList<Integer> newPath = new ArrayList<>(path);
                newPath.add(currNode.left.val);
                stack.push(new Object[] { currNode.left, newPath });
            }
        }

        return new int[0];
    }

    static TreeNode getNode(TreeNode root, int target) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();

            if (curr.val == target) {
                return curr;
            }

            if (curr.right != null) {
                stack.push(curr.right);
            }

            if (curr.left != null) {
                stack.push(curr.left);
            }
        }

        return root;
    }
}