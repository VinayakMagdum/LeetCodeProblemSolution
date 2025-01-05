package examples.easy;

import java.util.ArrayList;
import java.util.List;

public class ProblemNumber938 {
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
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right =  new TreeNode(15);

        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(7);

        node.right.right =  new TreeNode(18);

        System.out.println(rangeSumBST2(node, 7, 15));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) {
            return 0;
        }
        if(root.val < low) {
            return rangeSumBST(root.right, low, high);
        }

        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }

        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

    public static int rangeSumBST2(TreeNode root, int low, int high) {
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        traverse(root, low, high, list);
        for (int num : list){
            ans += num;
        }
        return ans;
    }

    public static void traverse(TreeNode root, int low, int high, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.val <= high && root.val >= low) {
            list.add(root.val);
        }

        traverse(root.left, low, high, list);
        traverse(root.right, low, high, list);
    }
}
