package examples.medium;

import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
/**
 * https://leetcode.com/problems/binary-tree-right-side-view/
 */
public class ProblemNumber199 {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int value) {
            this.val = value;
        }

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.val = value;
            this.left = left;
            this.right = right;
        }
    }

    private static TreeMap<Integer, Integer> map = new TreeMap<>();


    public static void main(String[] args) {
        System.out.println("000A".hashCode());
        System.out.println("108738449".hashCode());

//        TreeNode node = new TreeNode(1);
//        node.left  = new TreeNode(2);
//        node.left.right  = new TreeNode(5);
//        node.right = new TreeNode(3);
//        node.right.right = new TreeNode(4);
//
//        System.out.println(rightSideView(node));
    }


    private static List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        List<Integer> list =  new ArrayList<>(map.values());
        return list;
    }

    private static void dfs(TreeNode node, int level) {
        level++;
        if (node == null)
            return;

        dfs(node.left, level);

        map.put(level, node.val);

        dfs(node.right, level);
    }
}
