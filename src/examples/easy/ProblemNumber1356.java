package examples.easy;

import java.util.*;

/**
 * https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
 */
public class ProblemNumber1356 {
    public static void main(String[] args) {
        System.out.println(sortByBits(new int[]{0,1,2,3,4,5,6,7,8}));
    }

    public static int[] sortByBits(int[] arr) {
        Integer[] A = Arrays.stream(arr).boxed().toArray(Integer[] ::new);
        Arrays.sort(A,
                (a, b)
                        -> Integer.bitCount(a) == Integer.bitCount(b)
                        ? a - b
                        : Integer.bitCount(a) - Integer.bitCount(b));
        return Arrays.stream(A).mapToInt(Integer::intValue).toArray();
    }

}
