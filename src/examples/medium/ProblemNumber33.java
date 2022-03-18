package examples.medium;
import java.util.Stack;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class ProblemNumber33 {
    public static void main(String[] args) {
        ProblemNumber33 obj = new ProblemNumber33();
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(obj.search(arr, target));
    }

    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
