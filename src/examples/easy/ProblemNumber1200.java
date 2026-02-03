package examples.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-absolute-difference/description/
 */
public class ProblemNumber1200 {
    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[] {4,2,1,3}));
        System.out.println(minimumAbsDifference(new int[] {1,3,6,10,15}));
        System.out.println(minimumAbsDifference(new int[] {3,8,-10,23,19,-4,-14,27}));
        System.out.println(minimumAbsDifference(new int[] {40,11,26,27,-20}));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if((arr[i] - arr[i-1]) < minDifference) {
                minDifference = arr[i] - arr[i-1];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i-1] == minDifference) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }

        return ans;
    }
}
