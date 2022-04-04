package examples.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class ProblemNumber103 {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode() {
        }

        TreeNode(int value) {
            this.val = value;
        }

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.val = value;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left  = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        System.out.println(zigzagLevelOrder(node));
    }

    private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> qu = new LinkedList<>();

        if(root == null) {
            return res;
        }

        qu.add(root);
        int level = 0;
        while (!qu.isEmpty()) {
            int size = qu.size();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i< size; i++) {
                TreeNode node = qu.poll();
                if(level % 2 == 0) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }

                if(node.left != null)
                    qu.add(node.left);
                if(node.right != null)
                    qu.add(node.right);
            }

            res.add(list);
            level++;
        }


        return res;
    }
}
