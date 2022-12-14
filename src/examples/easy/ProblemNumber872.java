package examples.easy;

import java.util.List;
import java.util.ArrayList;

/**
 * https://leetcode.com/problems/leaf-similar-trees/
 */
public class ProblemNumber872 {
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1, leaves1);
        dfs(root2, leaves2);

        return leaves1.equals(leaves2);

    }

    public void dfs(TreeNode root, List<Integer> leaves) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            leaves.add(root.val);
        }
        dfs(root.left, leaves);
        dfs(root.right, leaves);
    }
}
