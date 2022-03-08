package examples.medium;

/**
 * https://leetcode.com/problems/container-with-most-water/submissions/
 *
 */
public class ProblemNumber11 {
    public static void main(String[] args) {
        ProblemNumber11 obj = new ProblemNumber11();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(arr));
    }

    /**
     * Find the maximum area
     *
     * @param height    Array of heights
     * @return
     */
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0, right = height.length -1;
        while(left < right) {
            result = Math.max(result, Math.min(height[left], height[right]) * (right - left));
            // int area = Math.min(height[left], height[right]) * (right - left);
            // if(result < area) {
            //     result = area;
            // }

            if(height[left] < height[right]) {
                left++;
            } else {
                right --;
            }
        }
        return result;
    }
}
