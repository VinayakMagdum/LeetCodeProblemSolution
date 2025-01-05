package examples.easy;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/relative-sort-array/
 */
public class ProblemNumber1122 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[] {2,1,4,3,9,6};

//        int[] arr1 = new int[] {28,6,22,8,44,17};
//        int[] arr2 = new int[] {22,28,8,6};

        int[] result = relativeSortArray(arr1, arr2);
        for (int num : result) {
            System.out.print(num + ", ");
        }
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[arr1.length];
        int idx = 0;

        for (int num : arr2) {
            int freq = map.get(num);
            while (freq-- > 0) {
                ans[idx++] = num;
            }
            map.remove(num);
        }

        for (int key : map.keySet()) {
            int freq = map.get(key);
            while (freq-- > 0) {
                ans[idx++] = key;
            }
        }
        return ans;
    }
}
