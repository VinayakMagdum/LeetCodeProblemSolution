package examples.easy;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/binary-search/
 *
 */
public class ProblemNumber704 {
    public static void main(String[] args) {
        ProblemNumber704 obj = new ProblemNumber704();
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(obj.search(arr, target));
    }

    /**
     * Search if number is present in array or not.
     *
     * @param nums      Input Array
     * @param target    Target
     * @return
     */
    public int search(int[] nums, int target) {
        int result =  Arrays.binarySearch(nums, target);
        return result >= 0 ? result : -1;
    }
}
