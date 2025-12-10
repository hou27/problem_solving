/**
 * Definition for a binary tree node.
 */
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

// divide and conquer
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        System.out.println("root idx:" + preStart);

        int size = 0;
        for (int i = inStart; i <= inEnd; i++) {
            size++;
            if (root.val == inorder[i]) {
                System.out.println("size: " + (size - 1));
                System.out.println(
                        "left:" + (preStart + 1) + ", " + (preStart + size - 1) + " and " + inStart + ", " + (i - 1));
                root.left = buildTree(preorder, preStart + 1, preStart + size - 1, inorder, inStart, i - 1);
                System.out.println(
                        "right:" + (preStart + size + 1 - 1) + ", " + preEnd + " and " + (i + 1) + ", " + inEnd);
                // if (preStart + size + 1 < preorder.length) {
                root.right = buildTree(preorder, preStart + size + 1 - 1, preEnd, inorder, i + 1, inEnd);
                // }
                break;
            }
        }

        return root;
    }
}