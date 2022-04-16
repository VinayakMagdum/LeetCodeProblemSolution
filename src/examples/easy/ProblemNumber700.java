package examples.easy;

public class ProblemNumber700 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] abc) {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);

        node.right = new TreeNode(7);
        searchBST(node, 2);
    }

    private static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }

        if(root.val > val) {
            return searchBST(root.left, val);
        }
        if(root.val < val) {
            return searchBST(root.right, val);
        }
        return null;
    }
}
