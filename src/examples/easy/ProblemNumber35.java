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
}
