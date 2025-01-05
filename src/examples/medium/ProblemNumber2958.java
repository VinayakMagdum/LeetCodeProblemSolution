package examples.medium;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class ProblemNumber2958 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,1,2,3,1,2};
//        int[] arr = new int[] {1,2,1,2,1,2,1,2};
//        int[] arr = new int[] {5,5,5,5,5,5,5};
//        int[] arr = new int[] {1,11};//2

        System.out.println(maxSubarrayLength(arr, 2));
    }

    public static int maxSubarrayLength(int[] nums, int k) {
        int ans = 0, start = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int end = 0; end < nums.length; end++) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            while (map.get(nums[end]) > k) {
                start++;
                map.put(nums[start], map.get(nums[start]) - 1);
            }
            ans = Math.max(ans, end - start);
        }
        return ans;
    }
}
