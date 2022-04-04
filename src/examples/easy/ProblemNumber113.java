package examples.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/113_path_sum_ii__medium.html
 */
public class ProblemNumber113 {
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
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);

        node.right =  new TreeNode(8);
        node.right.left =  new TreeNode(13);
        node.right.right =  new TreeNode(4);
        node.right.right.left =  new TreeNode(5);
        node.right.right.right =  new TreeNode(1);

        System.out.println(pathSum(node, 22));
    }

    private static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        processTree(root, targetSum, new ArrayList<>(), result);

        return result;

    }

    private static void processTree(TreeNode root, int targetSum, List<Integer> curr, List<List<Integer>> result) {
        if(root == null) {
            return;
        }
        curr.add(root.val);
        if(root.left == null && root.right == null && root.val ==targetSum) {
            result.add(new ArrayList<>(curr));
        }

        processTree(root.left, targetSum - root.val, curr, result);
        processTree(root.right, targetSum - root.val, curr, result);
        curr.remove(curr.size() - 1);
    }
}
