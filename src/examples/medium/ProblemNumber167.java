package examples.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class ProblemNumber167 {
    public static void main(String[] args) {
//        System.out.println((int) Math.ceil(3/2.0));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4, 12}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4, 6, 8, 10, 11, 25, 27, 30}, 11)));


        System.out.println(Arrays.toString(twoSum2(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum2(new int[]{2, 3, 4, 12}, 6)));
        System.out.println(Arrays.toString(twoSum2(new int[]{2,3,4, 6, 8, 10, 11, 25, 27, 30}, 11)));
    }

    /**
     * TC = O(n)
     * SC = O(n)
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int index = 0; index < numbers.length; index++) {
            int reqNum = target - numbers[index];
            if (map.containsKey(reqNum)) {
                int idx = map.get(reqNum);
                ans = idx > index ? new int[] {++index, ++idx} : new int[] {++idx, ++index};
                return ans;
            } else {
                map.put(numbers[index], index);
            }
        }
        return ans;
    }

    /**
     * TC = O(n)
     * SC = O(1)
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] {++left, ++right};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] {};
    }
}
