package examples.easy;

import java.util.*;

public class ProblemNumber997 {
    public static void main(String[] args) {
//        int[][] arr = new int[][]{
//                {1,3},
//                {2,3},
//                {3,1}
//        };

        int[][] arr = new int[][]{
                {1,2},
                {2,1}
        };

        System.out.println(findJudge(3, arr));

    }

    private static int findJudge(int n, int[][] trust) {

         Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < trust.length; i++) {
            int val = trust[i][1];
            int follow = trust[i][0];
            if(map.containsKey(follow)) {
                map.put(follow, map.get(follow)-1);
            }
            if(map.containsKey(val)) {
                map.put(val, map.get(val)+1);
            } else {
                map.put(val, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if((int)entry.getValue() == n-1) {
                return (int)entry.getKey();
            }
        }

        return -1;

    }
}
