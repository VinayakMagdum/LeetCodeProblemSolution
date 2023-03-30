package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class Test {
}
// Java program for different tree traversals


/* Class containing left and right child of
current node and key value*/
class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

/* Class to print the inorder traversal */
class BinaryTree
{
    Node root;
    void inorder()
    {
        if (root == null)
            return;


        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // traverse the tree
        while (curr != null || s.size() > 0)
        {

            /* Reach the left most Node of the
            curr Node */
            while (curr !=  null)
            {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.data + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }

    public static void main(String args[])
    {

        /* creating a binary tree and entering
        the nodes */
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//        tree.inorder();

        System.out.println(catalan(7));
    }

    public static int numTrees(int n) {
        if(n==1)
            return 1;
        Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
        cache.put(0, new Integer(1));
        cache.put(1, new Integer(1));
        return (fact(cache, 2*n))/(fact(cache, n+1)*fact(cache, n));
    }

    private static  int catalan(int n)
    {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        if(n == 1) {
            return 1;
        }
        for(int i =2; i<= n; i++) {
            for(int j = 0; j < i; j++) {
                arr[i] += arr[j] * arr[i - j - 1];
            }
        }
        return arr[n];
//        int res = 0;
//
//        // Base case
//        if (n <= 1)
//        {
//            return 1;
//        }
//        for (int i = 0; i < n; i++)
//        {
//            res += catalan(i)
//                    * catalan(n - i - 1);
//        }
//        return res;
    }
    private static int fact(Map<Integer, Integer> cache, int n) {
        for (int i = 2; i <= n; i++) {

            cache.put(i, i*cache.get(i-1));
        }
        return cache.get(n);
    }
}
