package examples.medium;

/**
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class ProblemNumber129 {
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

    private static int ans = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode first = new TreeNode(2);
        TreeNode sec = new TreeNode(3);
        root.left = first;
        root.right = sec;

        System.out.println(sumNumbers(root));
    }

    public static int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    private static void dfs(TreeNode root, int path) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            ans += path * 10 + root.val;
            return;
        }
        dfs(root.left, path * 10 + root.val);
        dfs(root.right, path * 10 + root.val);
    }

}
