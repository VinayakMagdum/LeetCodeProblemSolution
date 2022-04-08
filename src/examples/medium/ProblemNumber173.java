package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-search-tree-iterator/
 */
public class ProblemNumber173 {
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

    List<TreeNode> list;
    int index = 0;

    public ProblemNumber173(TreeNode root) {
        list = new ArrayList<>();
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }

    public int next() {
        return list.get(index++).val;
    }

    public boolean hasNext() {
        return index < list.size();
    }
    public static void main(String[] args) {

        TreeNode node = new TreeNode(7);
        node.left = new TreeNode(3);
        node.right = new TreeNode(15);
        node.right.left =  new TreeNode(9);
        node.right.right =  new TreeNode(20);

        ProblemNumber173 bSTIterator = new ProblemNumber173(node);
        System.out.println(bSTIterator.next());   // return 3
        System.out.println(bSTIterator.next());    // return 7
        System.out.println(bSTIterator.hasNext()); // return True
        System.out.println(bSTIterator.next());    // return 9
        System.out.println(bSTIterator.hasNext()); // return True
        System.out.println(bSTIterator.next());    // return 15
        System.out.println(bSTIterator.hasNext()); // return True
        System.out.println(bSTIterator.next());    // return 20
        System.out.println(bSTIterator.hasNext());// return False
    }

}
