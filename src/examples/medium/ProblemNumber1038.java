package examples.medium;

/**
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
public class ProblemNumber1038 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private static int sum = 0;

    public static void main(String[] abc) {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(0);
        node.left.right = new TreeNode(2);
        node.left.right.right = new TreeNode(3);


        node.right = new TreeNode(6);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(7);
        node.right.right.right = new TreeNode(8);
        System.out.println(bstToGst(node));
    }

    private static TreeNode bstToGst(TreeNode root) {
        if(root != null) {
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }
}
