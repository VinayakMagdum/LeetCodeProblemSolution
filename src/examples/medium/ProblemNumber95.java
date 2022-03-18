package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/unique-binary-search-trees-ii/
 */
public class ProblemNumber95 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
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

    public static void main(String[] args) {
        int n = 3;
        List<TreeNode> nodes = generateTrees(n);
        for (TreeNode node: nodes) {
            System.out.println(node);
        }
    }

    private static List<TreeNode> generateTrees(int n) {
        if(n ==0 ) {
            return new ArrayList<>();
        } else {
            return findBST(1, n);
        }
    }

    private static List<TreeNode> findBST(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if(start > end) {
            list.add(null);
            return list;
        } else {
            for(int i = start; i <= end; i++) {
                List<TreeNode> lefts = findBST(start, i-1);
                List<TreeNode> rights = findBST(i+1, end);
                for (TreeNode left : lefts) {
                    for (TreeNode right : rights) {
                        list.add(new TreeNode(i, left, right));
                    }
                }
            }
        }
        return list;
    }
}
