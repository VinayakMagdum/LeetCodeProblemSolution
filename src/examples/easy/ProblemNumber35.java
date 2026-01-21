package examples.easy;

/**
 * https://leetcode.com/problems/search-insert-position/
 *
 */
public class ProblemNumber35 {
    public static void main(String[] args) {
        ProblemNumber35 obj = new ProblemNumber35();
        int[] arr = {1,3,5,6};
        System.out.println(obj.searchInsert(arr, 5));
    }

    /**
     * Find index where we can insert target
     * Time Complexity - O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        boolean found = false;
        for(int i =0; i< nums.length; i++) {
            if(nums[i]>= target) {
                result =  i;
                found = true;
                break;
            }
        }
        if(!found) {
            result =  nums.length;
        }
        return result;
    }

    /**
     * Find index where we can insert target
     * Time Complexity - O(log n)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert2(int[] nums, int target) {
        int mid = 0;
        int left = 0; int right = nums.length;

        while (left < right) {
            mid = (right + left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return nums[mid] < target ? mid+1 : mid;
    }
}
