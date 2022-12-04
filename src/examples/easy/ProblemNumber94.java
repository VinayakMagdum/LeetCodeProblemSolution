package examples.easy;

import java.util.List;
import java.util.ArrayList;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 *
 */
public class ProblemNumber94 {
    static class  TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right =  new TreeNode(20);
        node.right.left =  new TreeNode(15);
        node.right.right =  new TreeNode(7);

        System.out.println(inorderTraversal(node).toString());
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode node = root;
        traverseInorder(node, result);
        return result;

    }

    public static void traverseInorder(TreeNode node, List<Integer> result) {
        if(node == null) {
            return;
        }
        if(node.left != null) {
            traverseInorder(node.left, result);
        }
        result.add(node.val);
        if(node.right != null) {
            traverseInorder(node.right, result);
        }
    }
}