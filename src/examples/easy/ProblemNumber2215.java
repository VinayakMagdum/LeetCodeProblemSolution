package examples.easy;
import java.util.*;

/**
 * https://leetcode.com/problems/find-the-difference-of-two-arrays/
 */
public class ProblemNumber2215 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,3};
        int[] nums2 = new int[] {1,1,2,2};

//        System.out.println(findDifference(nums1, nums2));
    }

//    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//        Set<Integer> onlyInNums2 = new HashSet<>();
//        for (int i = 0; i < nums2.length; i++) {
//            onlyInNums2.add(nums2[i]);
//        }
//
//        Set<Integer> onlyInNums1 = new HashSet<>();
//        for(int num : nums1) {
//            if(!onlyInNums2.contains(num)) {
//                onlyInNums1.add(num);
//            }
//        }
//        List<List<Integer>> ans  = new ArrayList<>();
//        List<Integer> list1 = Arrays.stream(nums1).boxed().toList();
//        List<Integer> list2 = Arrays.stream(nums2).boxed().toList();
//
//        Set<Integer> notPresentIn2 = new HashSet<>();
//        Set<Integer> notPresentIn1 = new HashSet<>();
//        for (int num : list1) {
//            if(!list2.contains(num)) {
//                notPresentIn2.add(num);
//            }
//        }
//        for (int num : list2) {
//            if(!list1.contains(num)) {
//                notPresentIn1.add(num);
//            }
//        }
//
//        ans.add(notPresentIn2.stream().toList());
//        ans.add(notPresentIn1.stream().toList());
//        return ans;
//    }
}
