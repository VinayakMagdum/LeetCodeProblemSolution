package examples.easy;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class ProblemNumber169 {

    public static void main(String[] args) {
        ProblemNumber169 obj = new ProblemNumber169();
        int[] arr = new int[]{3, 1, 3, 3, 2, 3, 1, 3};
        System.out.println(obj.majorityElement(arr));
    }

    public int majorityElement(int[] nums) {
        int element = 0, count = 0;
        for(int num : nums) {
            if (count == 0){
                element = num;
                count++;
            } else if (num == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}
