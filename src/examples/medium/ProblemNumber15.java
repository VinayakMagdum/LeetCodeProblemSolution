package examples.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProblemNumber15 {
    public static void main(String[] args) {
        ProblemNumber15 obj = new ProblemNumber15();
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        System.out.println(obj.threeSum(arr));
    }

    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new LinkedList<List<Integer>>();
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0 || nums[i] != nums[i-1]) {
//                int start = i + 1, end = nums.length - 1;
//                while (start < end) {
//                    int sum = nums[i] + nums[start] + nums[end];
//                    if (sum == 0){
//                        List<Integer> tmp = new LinkedList<Integer>();
//                        tmp.add(nums[i]);
//                        tmp.add(nums[start]);
//                        tmp.add(nums[end]);
//                        result.add(tmp);
//                        int startVal = nums[start];
//                        int endVal = nums[end];
//                        while (start < end && startVal == nums[start]) {
//                            start ++;
//                        }
//                        while (end > start && endVal == nums[end]) {
//                            end --;
//                        }
//                    }
//                    else if (sum < 0) {
//                        start ++;
//                    }
//                    else {
//                        end --;
//                    }
//                }
//            }
//        }
//        return result;


        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        for(int i = 0; i < nums.length; i++) {
            if(i ==0 || nums[i]!=nums[i-1]) {
                int start = i+1, end = nums.length-1;
                while(start < end) {
                    int sum = nums[i] + nums[start] + nums[end];
                    if(sum == 0) {
                        List<Integer> tmp = new LinkedList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[start]);
                        tmp.add(nums[end]);
                        result.add(tmp);
                        int startVal = nums[start];
                        int endVal = nums[end];
                        while(start < end && startVal == nums[start]) {
                            start++;
                        }
                        while(end > start && endVal == nums[end]) {
                            end--;
                        }
                    } else if(sum < 0) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return result;
    }

}
