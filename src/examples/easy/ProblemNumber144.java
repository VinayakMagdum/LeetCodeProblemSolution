package examples.easy;

import java.util.List;
import java.util.ArrayList;


/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class ProblemNumber144 {
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
        TreeNode node = new TreeNode(1);

        node.right =  new TreeNode(2);
        node.right.left =  new TreeNode(3);

        System.out.println(preorderTraversal(node));

    }

    private static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode temp = root;
        traverse(temp, list);
        return list;
    }

    private static void traverse(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }
}
