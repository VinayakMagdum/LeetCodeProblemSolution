package examples.easy;

import java.util.Arrays;

public class ProblemNumber136 {
    public static void main(String[] args) {
        ProblemNumber136 obj = new ProblemNumber136();
        int[] arr = new int[]{4, 1, 2, 1, 2, 4, 5};
        System.out.println(obj.singleNumber(arr));
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums)
            result = result ^ num;
        return result;
    }
}
