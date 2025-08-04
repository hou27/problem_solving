import java.util.*;

public class Main {

}

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

class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorderTraversal(root, arr);

        for (int idx = 1; idx < arr.size(); idx++) {
            if (arr.get(idx) <= arr.get(idx - 1)) {
                return false;
            }
        }

        return true;
    }

    static void inorderTraversal(TreeNode node, List<Integer> arr) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, arr);
        arr.add(node.val);
        inorderTraversal(node.right, arr);
    }
}