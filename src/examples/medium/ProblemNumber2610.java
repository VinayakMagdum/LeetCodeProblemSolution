package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
 */
public class ProblemNumber2610 {
    public static void main(String[] args) {
        System.out.println(findMatrix(new int[] {1,3,4,1,2,3,1}));
//        System.out.println(findMatrix(new int[] {1,2,3,4}));
    }

//    public static List<List<Integer>> findMatrix(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        list.add(nums[0]);
//        ans.add(list);
//        for (int i = 1; i < nums.length; i++) {
//            int num = nums[i];
//            boolean flag = true;
//            for (List<Integer> list1 : ans) {
//                if(!list1.contains(num)) {
//                    list1.add(num);
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag) {
//                List<Integer> list1 = new ArrayList<>();
//                list1.add(num);
//                ans.add(list1);
//            }
//        }
//        return ans;
//    }


    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for (int num: nums) {
            if(freq[num] >= ans.size()) {
                ans.add(new ArrayList<>());
            }

            ans.get(freq[num]).add(num);
            freq[num]++;
        }
        return ans;
    }
}
