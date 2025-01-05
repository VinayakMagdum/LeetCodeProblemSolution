package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/find-players-with-zero-or-one-losses/
 */
public class ProblemNumber2225 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
//                {1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}
                {2,3},{1,3},{5,4},{6,4}
        };

        System.out.println(findWinners(arr));
    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> winMap = new HashMap();
        Map<Integer, Integer> looseMap = new HashMap();

        for (int[] arr : matches) {
            winMap.put(arr[0], winMap.getOrDefault(arr[0], 0) + 1);
            looseMap.put(arr[1], looseMap.getOrDefault(arr[1], 0) + 1);
        }

        List<Integer> list1 = new ArrayList<>();
        for (Integer key : winMap.keySet()) {
            if(!looseMap.containsKey(key)) {
                list1.add(key);
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for (Integer key : looseMap.keySet()) {
            if(looseMap.get(key) == 1) {
                list2.add(key);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}
