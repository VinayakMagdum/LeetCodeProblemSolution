package examples.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
public class ProblemNumber347 {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,1,1,2,2,3,3,3,3};
        int[] arr = new int[]{1,2};
        System.out.println(topKFrequent(arr, 2));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!count.containsKey(nums[i])) {
                count.put(nums[i], 0);
            }
            int c = count.get(nums[i]) + 1;
            max = Math.max(max, c);
            count.put(nums[i], c);
        }

        LinkedList<Integer>[] bucket = (LinkedList<Integer>[]) new LinkedList[max+1];

        for (Integer i:count.keySet()) {
            int val = count.get(i);
            if (bucket[val] == null) {
                bucket[val] = new LinkedList<Integer>();
            }
            bucket[val].add(i);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i ++) {
            while(bucket[max] == null || bucket[max].size() == 0) {
                max --;
            }
            result[i] = bucket[max].poll();
        }
        return result;
    }
}
