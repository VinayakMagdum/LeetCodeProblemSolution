package examples;

public class Adobe {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] abc) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.left.left = new TreeNode(1);

        node.right = new TreeNode(4);

        System.out.println(checkBST(node));
    }

    private static boolean checkBST(TreeNode node) {

        if(node == null) {
            return true;
        }

        if(node.left != null && node.val < node.left.val) {
            return false;
        }
        if(node.right != null && node.val > node.right.val) {
            return false;
        }

        return checkBST(node.left) && checkBST(node.right);
    }
}
