package examples.hard;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 */
public class ProblemNumber297 {

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
        node.left = new TreeNode(2);

        node.right =  new TreeNode(3);
        node.right.left =  new TreeNode(4);
        node.right.right =  new TreeNode(5);

        System.out.println(serialize(node));
    }

    private static String serialize(TreeNode root) {
        if (root == null) return "#";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    private static TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(queue);
    }

    private static TreeNode helper(Queue<String> queue) {
        String s = queue.poll();
        if (s.equals("#")) return null;
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = helper(queue);
        root.right = helper(queue);
        return root;
    }
}
