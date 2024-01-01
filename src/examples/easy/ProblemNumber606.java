package examples.easy;

/**
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 */
public class ProblemNumber606 {
    static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right =  new TreeNode(3);
        node.left.left =  new TreeNode(4);
        System.out.println(tree2str(node));
    }

    public static String tree2str(TreeNode root) {
        String str = traverse(root);
        return str;
    }

    private static String traverse(TreeNode root) {
        if(root == null) {
            return "";
        }
        if(root.right != null) {
            return root.val + "(" + traverse(root.left) + ")(" + traverse(root.right) + ")";
        }

        if(root.left != null) {
            return root.val + "(" + traverse(root.left) + ")";
        }

        return root.val + "";
    }
}
