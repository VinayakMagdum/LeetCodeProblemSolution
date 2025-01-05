package examples.easy;

import java.util.*;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class ProblemNumber350 {
    public static void main(String[] args) {
//        int[] nums1 = new int[]{1,2,2,1};
//        int[] nums2 = new int[]{2,2};

        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        System.out.println(intersect(nums1, nums2));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int len1 = nums1.length;
//        int len2 = nums2.length;
//        List<Integer> list = new ArrayList();
//        int idx1 = 0;
//        int idx2 = 0;
//        while(idx1 < len1 || idx2 < len2) {
//            if(nums1[idx1] == nums2[idx2]) {
//                list.add(nums1[idx1]);
//                idx1++;
//                idx2++;
//            } else {
//                int n = nums1[idx1] < nums2[idx2] ? idx1++ : idx2++;
//            }
//
//        }
//
//        int[] ans = list.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
//        return ans;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }
}

