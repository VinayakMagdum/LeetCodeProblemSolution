package examples.easy;

/**
 * https://leetcode.com/problems/first-bad-version/
 *
 */
public class ProblemNumber278 {

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int midPoint = left + (right - left) / 2;
            if (isBadVersion(midPoint)) {
                right = midPoint - 1; //Shifting right
            }
            else {
                left = midPoint + 1;//Shifting left
            }
        }
        if (isBadVersion(left)) {
            return left;
        }
        return left + 1;
    }

    /**
     * Just created to ignore compile time error
     * @param number
     * @return
     */
    public boolean isBadVersion(int number) {
        return true;
    }
}
