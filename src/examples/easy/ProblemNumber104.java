package examples.easy;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class ProblemNumber104 {
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

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right =  new TreeNode(20);
        node.right.left =  new TreeNode(15);
        node.right.right =  new TreeNode(7);

        System.out.println(maxDepth(node));
    }

    private static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) +1;

    }
}
