package examples.medium;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ProblemNumber7 {


    public static int reverse(int x) {
        int result  = 0;
        while (x != 0) {
            int reminder = x % 10;
            int newResult = result * 10 + reminder;

            if((newResult - reminder)/10 != result) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

}
