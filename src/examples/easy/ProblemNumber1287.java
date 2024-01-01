package examples.easy;

/**
 * https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
 */
public class ProblemNumber1287 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,1};
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int trip = (int) Math.ceil(len/4);
        for (int i= 0; i  < len - trip; i++) {
            if (arr[i] == arr[i + trip]) {
                return arr[i];
            }
        }
        return 0;
    }
}
