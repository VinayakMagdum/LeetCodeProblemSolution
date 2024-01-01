package examples.easy;

import examples.medium.ProblemNumber230;

/**
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 */
public class ProblemNumber530 {

    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.right =  new TreeNode(6);

        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);

        System.out.println(getMinimumDifference(node));
    }

    public static int getMinimumDifference(TreeNode root) {
        traversePreorder(root);
        return ans;
    }

    public static void traversePreorder(TreeNode root) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            return;
        } else if (root.left != null && root.right == null) {
            int rootVal = root.val;
            int left = root.left.val;
            ans = Math.min(ans, Math.abs(rootVal - left));
        } else if (root.left == null && root.right != null) {
            int rootVal = root.val;
            int right = root.right.val;
            ans = Math.min(ans, Math.abs(rootVal - right));
        } else {
            int rootVal = root.val;
            int left = root.left.val;
            int right = root.right.val;
            ans = Math.min(ans, Math.min(Math.abs(rootVal - left), Math.abs(rootVal - right)));
        }

        traversePreorder(root.left);

        traversePreorder(root.right);

    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}