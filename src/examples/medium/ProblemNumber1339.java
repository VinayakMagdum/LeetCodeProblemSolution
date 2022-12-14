package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/
 */
public class ProblemNumber1339 {
    public class TreeNode {
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

    }


    public int maxProduct(TreeNode root) {
        final int kMod = 1_000_000_007;
        long ans = 0;

        List<Integer> allSum = new ArrayList<>();
        final long totalSum = treeSum(root, allSum);

        for (final long sum : allSum)
            ans = Math.max(ans, sum * (totalSum - sum));

        return (int) (ans % kMod);
    }

    private int treeSum(TreeNode root, List<Integer> allSum) {
        if(root == null) {
            return 0;
        }

        int leftSum = treeSum(root.left, allSum);
        int rightSum = treeSum(root.right, allSum);
        int totalSum = root.val + leftSum + rightSum;
        allSum.add(totalSum);
        return totalSum;
    }
}
