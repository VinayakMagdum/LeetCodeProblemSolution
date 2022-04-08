package examples.easy;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class ProblemNumber235 {
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

        TreeNode node = new TreeNode(6);

        node.left = new TreeNode(2);
        node.left.left = new TreeNode(0);
        node.left.right = new TreeNode(4);
        node.left.right.left = new TreeNode(3);
        node.left.right.right = new TreeNode(5);

        node.right =  new TreeNode(8);
        node.right.left =  new TreeNode(7);
        node.right.right =  new TreeNode(9);

        System.out.println(lowestCommonAncestor(node, node.left, node.right).val);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        return lca(root, min, max);

    }

    private static TreeNode lca(TreeNode root, int min, int max) {
        if(root == null) {
            return null;
        }

        if(root.val >= min && root.val <= max) {
            return root;
        }

        if(root.val > max) {
            return lca(root.left, min, max);
        }

        if(root.val < min) {
            return lca(root.right, min, max);
        }
        return null;
    }
}
