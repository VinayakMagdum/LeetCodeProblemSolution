package examples.easy;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public class ProblemNumber404 {
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

        ProblemNumber404 obj = new ProblemNumber404();
        StringBuilder abs  =new StringBuilder("abc");
        obj.doSm(abs);
        System.out.println(abs);

    }

    void doSm(StringBuilder ans) {
        for(int i =0; i <= 5; i++) {
            ans.append(i);
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return sumOfLeftLeaves(root.right);
        } else {
            int count = 0;
            if (root.left.left == null && root.left.right == null) {
                count += root.left.val;
            }
            else {
                count += sumOfLeftLeaves(root.left);
            }
            count += sumOfLeftLeaves(root.right);
            return count;
        }

    }
}
