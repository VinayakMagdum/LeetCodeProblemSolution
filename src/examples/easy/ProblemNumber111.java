package examples.easy;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class ProblemNumber111 {
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

        System.out.println(minDepth(node));
    }

    private static int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            return 1;
        } else if(root.left == null) {
            return minDepth(root.right)+1;
        } else if(root.right == null){
            return minDepth(root.left) +1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
