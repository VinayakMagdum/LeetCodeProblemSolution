package examples.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element-ii/
 */
public class ProblemNumber229 {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int ocrCnt = nums.length / 3;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer key : map.keySet()) {
            if(map.get(key) > ocrCnt) {
                list.add(key);
            }
        }

        return list;
    }
}
