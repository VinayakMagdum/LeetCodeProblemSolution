package examples.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class ProblemNumber102 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode node) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(node);

        while (!queue.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode n = queue.poll();
                l.add(n.val);
                if(n.left != null) {
                    queue.add(n.left);
                }
                if(n.right != null) {
                    queue.add(n.right);
                }
            }
            list.add(l);
        }
        return list;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode first = new TreeNode(9);
        TreeNode sec = new TreeNode(20);
        root.left = first;
        root.right = sec;

        TreeNode fourth = new TreeNode(15);
        TreeNode fifth = new TreeNode(7);
        sec.left = fourth;
        sec.right = fifth;

        System.out.println(levelOrder(root));
    }

}