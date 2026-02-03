package examples.hard;

/**
 * https://leetcode.com/problems/trapping-rain-water/description/
 */
public class ProblemNumber42 {
    public static void main(String[] args) {
        System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(trap(new int[] {4,2,0,3,2,5}));


        System.out.println(trap2(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(trap2(new int[] {4,2,0,3,2,5}));
    }

    /**
     * TC = O(N)
     * SC = O(1)
     * @param height
     * @return
     */
    public static int trap2(int[] height) {
        int ans = 0;
        int left = 0; int right = height.length - 1;
        int leftMax = 0; int rightMax = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                ans += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }

    /**
     * TC = O(N)
     * SC = O(N)
     * @param height
     * @return
     */
    public static int trap(int[] height) {
        int ans = 0;
//        int[] prefixMax = findPrefixMax(height);
        int[] suffixMax = findSuffixMax(height);
        int leftMax = 0;
        for (int i = 0; i < height.length; i++) {
//            int leftMax = prefixMax[i];
            leftMax = Math.max(leftMax, height[i]);
            int rightMax = suffixMax[i];
            ans += Math.min(leftMax, rightMax) - height[i];
        }
        return ans;
    }


    private static int[] findPrefixMax (int[] nums) {
        int[] prefixMax = new int[nums.length];
        prefixMax[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i-1], nums[i]);
        }
        return prefixMax;
    }

    private static int[] findSuffixMax (int[] nums) {
        int length = nums.length;
        int[] suffixMax = new int[length];
        suffixMax[length-1] = nums[length-1];

        for (int i = length-2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i+1], nums[i]);
        }
        return suffixMax;
    }
}
