package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/description/
 */
public class ProblemNumber2279 {
    public static void main(String[] args) {
        int[] capacity = new int[]{54,18,91,49,51,45,58,54,47,91,90,20,85,20,90,49,10,84,59,29,40,9,100,1,64,71,30,46,91},
                rocks = new int[]{14,13,16,44,8,20,51,15,46,76,51,20,77,13,14,35,6,34,34,13,3,8,1,1,61,5,2,15,18};
        int additionalRocks = 77;
//        int[] capacity = new int[]{2,3,4,5},
//                rocks = new int[]{1,2,4,4};
//        int additionalRocks = 2;
        System.out.println(maximumBags(capacity, rocks, additionalRocks));
    }

    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] difference = new int[capacity.length];
        for(int idx = 0; idx < capacity.length; idx++){
            difference[idx] = capacity[idx] - rocks[idx];
        }
        Arrays.sort(difference);
        int ans = 0;
        for(int i = 0; i < capacity.length && additionalRocks > 0; i++) {
            if(difference[i] <= additionalRocks) {
                ans++;
            }
            additionalRocks -= difference[i];
        }
        return ans;
    }
}
