package examples.medium;

import java.util.Stack;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class ProblemNumber236 {
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

        TreeNode node = new TreeNode(3);

        node.left = new TreeNode(5);
        node.left.left = new TreeNode(6);
        node.left.right = new TreeNode(2);
        node.left.right.left = new TreeNode(7);
        node.left.right.right = new TreeNode(4);

        node.right =  new TreeNode(1);
        node.right.left =  new TreeNode(0);
        node.right.right =  new TreeNode(8);

        System.out.println(lowestCommonAncestor(node, node.left, node.right).val);
    }

    private static TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) {
            return null;
        }

        if(node == p || node == q) {
            return node;
        }

        TreeNode left = lowestCommonAncestor(node.left, p ,q);
        TreeNode right = lowestCommonAncestor(node.right, p, q);

        if(left != null && right != null) {
            return node;
        }

        if(left != null) {
            return left;
        } else {
            return right;
        }
    }


    private static TreeNode lca(TreeNode node, TreeNode p, TreeNode q) {
        Stack<TreeNode> pathToJ = pathToX(node, p);
        Stack<TreeNode> pathToK = pathToX(node, q);
        TreeNode lcaToReturn = null;

        while (!pathToJ.isEmpty() && !pathToK.isEmpty()) {
            TreeNode jPop = pathToJ.pop();
            TreeNode kPop = pathToK.pop();
            if (jPop == kPop) {
                lcaToReturn = jPop;
            } else {
                break;
            }
        }
        return lcaToReturn;
    }


    public static Stack<TreeNode> pathToX(TreeNode root, TreeNode x) {
        if (root == null) {
            return null;
        }

        if (root == x) {
            Stack<TreeNode> path = new Stack<TreeNode>();
            path.push(root);
            return path;
        }

        Stack<TreeNode> leftPath = pathToX(root.left, x);
        if (leftPath != null) {
            leftPath.push(root);
            return leftPath;
        }

        Stack<TreeNode> rightPath = pathToX(root.right, x);
        if (rightPath != null) {
            rightPath.push(root);
            return rightPath;
        }

        return null;
    }
}
