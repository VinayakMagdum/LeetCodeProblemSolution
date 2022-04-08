package examples.medium;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 */
public class ProblemNumber230 {
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

    public static int answer = -1;
    public static int count=0;


    public static void main(String[] args) {

        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(1);
        node.left.right = new TreeNode(2);
        node.right = new TreeNode(4);

        System.out.println(kthSmallest(node, 1));
    }

    private static int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return answer;
    }

    private static void traverse(TreeNode root, int k) {
        if(root == null) {
            return;
        }
        traverse(root.left, k);

        count++;
        if(count == k && answer==-1){
            answer=root.val;
            return;
        }

        traverse(root.right,k);
    }
}
