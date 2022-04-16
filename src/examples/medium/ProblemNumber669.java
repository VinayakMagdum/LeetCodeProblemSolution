package examples.medium;

/**
 * https://leetcode.com/problems/trim-a-binary-search-tree/
 */
public class ProblemNumber669 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] abc) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(0);
        node.right = new TreeNode(2);
        System.out.println(trimBST(node, 1, 2));
    }

    private static TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) {
            return null;
        }

        if(root.val > high) {
            return trimBST(root.left, low, high);
        }

        if(root.val < low) {
            return trimBST(root.right, low, high);
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
