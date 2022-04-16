package examples.medium;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ProblemNumber98 {

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

//        TreeNode node = new TreeNode(5);
//        node.left = new TreeNode(4);
//        node.left.left = new TreeNode(11);
//        node.left.left.left = new TreeNode(7);
//        node.left.left.right = new TreeNode(2);
//
//        node.right =  new TreeNode(8);
//        node.right.left =  new TreeNode(13);
//        node.right.right =  new TreeNode(4);
//        node.right.right.left =  new TreeNode(5);
//        node.right.right.right =  new TreeNode(1);
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);

        System.out.println(isValidBST(node));
    }

    private static boolean isValidBST(TreeNode root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBST(TreeNode root, long min, long max) {
        if(root == null) {
            return true;
        }

        if(root.val < min && root.val > max) {
            return false;
        }

        return checkBST(root.left, min,  root.val -1) && checkBST(root.right, root.val + 1, max);
    }

}
