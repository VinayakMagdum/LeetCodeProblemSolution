package examples.medium;

/**
 * https://leetcode.com/problems/recover-binary-search-tree/
 */
public class ProblemNumber99 {
    static class TreeNode {
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

    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);

    public static void main(String[] args) {

        TreeNode node = new TreeNode(3);

        node.left = new TreeNode(1);

        node.right =  new TreeNode(4);
        node.right.left =  new TreeNode(2);

        ProblemNumber99 obj = new ProblemNumber99();
        obj.recoverTree(node);
    }

    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);

        if(first == null && prev.val > root.val) {
            first = prev;
        }

        if(first != null && prev.val > root.val) {
            second = root;
        }
        prev = root;

        inorder(root.right);
    }

}
