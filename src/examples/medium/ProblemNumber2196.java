package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/create-binary-tree-from-descriptions/submissions/
 */
public class ProblemNumber2196 {
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

//    /**
//     * Solution 1
//     *
//     * @param descriptions
//     * @return
//     */
//    private static TreeNode createBinaryTree(int[][] descriptions) {
//        Map<Integer, TreeNode> map = new HashMap<>();
//        for(int i = 0; i< descriptions.length; i++) {
//            int[] elements = descriptions[i];
//            if(map.containsKey(elements[0])) {
//                if(elements[2] == 1) {
//                    if(map.containsKey(elements[1])) {
//                        (map.get(elements[0])).left = map.get(elements[1]);
//                    } else {
//                        TreeNode node =  new TreeNode(elements[1]);
//                        map.get(elements[0]).left = node;
//                        map.put(elements[1],node);
//                    }
//                } else {
//                    if(map.containsKey(elements[1])) {
//                        (map.get(elements[0])).right = map.get(elements[1]);
//                    } else {
//                        TreeNode node =  new TreeNode(elements[1]);
//                        map.get(elements[0]).right = node;
//                        map.put(elements[1],node);
//                    }
//                }
//            } else {
//                TreeNode root = new TreeNode(elements[0]);
//                map.put(elements[0], root);
//                if(elements[2] == 1) {
//                    if(map.containsKey(elements[1])) {
//                        map.get(elements[0]).left = map.get(elements[1]);
//                    } else {
//                        TreeNode child = new TreeNode(elements[1]);
//                        map.get(elements[0]).left = child;
//                        map.put(elements[1], child);
//                    }
//
//                } else {
//                    if(map.containsKey(elements[1])) {
//                        map.get(elements[0]).right = map.get(elements[1]);
//                    } else {
//                        TreeNode child = new TreeNode(elements[1]);
//                        map.get(elements[0]).right = child;
//                        map.put(elements[1], child);
//                    }
//                }
//            }
//        }
//
//        Set<Integer> childs = new TreeSet<>();
//        for(int[] desc : descriptions) {
//            childs.add(desc[1]);
//        }
//
//        for (Integer key : map.keySet()) {
//            if(!childs.contains(key)) {
//                return map.get(key);
//            }
//        }
//        return null;
//    }

    /**
     * Solution 2
     *
     * @param descriptions
     * @return
     */
    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> childNodes = new HashSet<>();
        for(int[] nodeDesc : descriptions){
            TreeNode parent = getNode(nodeDesc[0], map), child = getNode(nodeDesc[1], map);
            boolean isLeft = nodeDesc[2] == 1;
            childNodes.add(nodeDesc[1]);
            if(isLeft)
                parent.left = child;
            else
                parent.right = child;
        }

        for(int key : map.keySet())
            if(!childNodes.contains(key))
                return map.get(key);
        return null;
    }
    private static TreeNode getNode(int num, Map<Integer, TreeNode> map){
        map.putIfAbsent(num, new TreeNode(num));
        return map.get(num);
    }

    public static void main(String[] args) {
//        int[][] descriptions = new int[][]{
//                {20,15,1},
//                {20,17,0},
//                {50,20,1},
//                {50,80,0},
//                {80,19,1}
//        };

//        int[][] descriptions = new int[][]{
//                {1,2,1},
//                {2,3,0},
//                {3,4,1}
//        };

        int[][] descriptions = new int[][]{
                {39,70,1},
                {13,39,1},
                {85,74,1},
                {74,13,1},
                {38,82,1},
                {82,85,1}
        };

        System.out.println(createBinaryTree(descriptions));
    }
}
