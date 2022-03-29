package examples.medium;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class ProblemNumber287 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,3,4,2};

        System.out.println(arr);
    }

//    /**
//     * Solution 1
//     * @param nums
//     * @return
//     */
//    private static int findDuplicate(int[] nums) {
//        int[] temp = nums.clone();
//        Arrays.sort(temp);
//        for (int i = 0; i < temp.length -1 ; i++) {
//            if(temp[i] == temp[i+1]) {
//                return temp[i];
//            }
//        }
//        return 0;
//    }

    /**
     * Solution 2
     *
     * @param nums
     * @return
     */
    private static int findDuplicate(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int num : nums) {
            if(!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
