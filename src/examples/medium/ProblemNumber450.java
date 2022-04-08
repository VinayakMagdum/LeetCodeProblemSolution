package examples.medium;

/**
 * https://leetcode.com/problems/delete-node-in-a-bst/
 */
public class ProblemNumber450 {
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

        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(4);

        node.right =  new TreeNode(6);
        node.right.right =  new TreeNode(7);

//        TreeNode node = new TreeNode(3);
        System.out.println(deleteNode(node, 3));
    }

    private static TreeNode deleteNode(TreeNode root, int key) {
        TreeNode temp = root;
        return traverse(temp, key);
    }

    private static TreeNode traverse(TreeNode root, int key) {
        if(root == null)
            return null;

        if(root.val != key) {
            if(root.val < key) {
                root.right = deleteNode(root.right, key);
                return root;
            } else if(root.val > key) {
                root.left = deleteNode(root.left, key);
                return root;
            }
        }

        if(root.left == null && root.right == null)
            return null;
        else if(root.left == null)
            return root.right;
        else if(root.right == null)
            return root.left;
        else {
            TreeNode parentForLeftSubTree = root.right;

            while(parentForLeftSubTree.left != null)
                parentForLeftSubTree = parentForLeftSubTree.left;
            parentForLeftSubTree.left = root.left;

            return root.right;
        }
    }
}
