package examples.medium;

/**
 * <a href="https://leetcode.com/problems/maximum-product-subarray/description/">ProblemNumber152</a>
 */
public class ProblemNumber152 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {2,3,-2,4,2,3,}));
//        System.out.println(maxProduct(new int[] {-2,0,-1}));
    }

    public static int maxProduct(int[] nums) {
        int ans = nums[0];
        int maxEnding = nums[0];
        int minEnding = nums[0];

        for (int right = 1; right < nums.length; right++) {
            int curr = nums[right];
            int tempMax = Math.max(curr, Math.max(curr* maxEnding, curr * minEnding));
            minEnding = Math.min(curr, Math.min(curr* maxEnding, curr * minEnding));
            maxEnding = tempMax;
            ans = Math.max(ans, maxEnding);
        }

        return ans;
    }
}
