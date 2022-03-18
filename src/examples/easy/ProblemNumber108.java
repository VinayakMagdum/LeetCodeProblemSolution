package examples.easy;

public class ProblemNumber108 {
    class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        return buildBST(nums, 0, nums.length-1);
    }

    private TreeNode buildBST(int[] nums, int start, int end) {
        if(start > end) {
            return null;
        } else {
            int mid = (start + end) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = buildBST(nums, start, mid-1);
            node.right = buildBST(nums, mid+1, end);
            return node;
        }
    }
}
