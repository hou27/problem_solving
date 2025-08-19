import java.util.*;

public class MainEfficient {

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
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Look for p and q in left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right returned a node, it means p and q are in different
        // subtrees,
        // so the current root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null node (either left or right)
        return left != null ? left : right;
    }
}
