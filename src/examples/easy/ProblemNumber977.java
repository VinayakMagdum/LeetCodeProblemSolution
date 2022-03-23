package examples.easy;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
 */
public class ProblemNumber977 {
    public static void main(String[] args) {
        int[] arr = new int[]{-4,-1,0,3,10};
        int [] res = sortedSquares(arr);

        for(int num : res) {
            System.out.print(num + " ");
        }

    }

    private static int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        int index = n - 1;
        int l = 0, r = n - 1;
        while (l <= r) {
            if (Math.abs(A[l]) < Math.abs(A[r])) {
                res[index--] = A[r] * A[r];
                r--;
            } else {
                res[index--] = A[l] * A[l];
                l++;
            }
        }
        return res;
    }


}
