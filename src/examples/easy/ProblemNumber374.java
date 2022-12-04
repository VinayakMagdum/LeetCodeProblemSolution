package examples.easy;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/description/
 */
public class ProblemNumber374 {

    public int guessNumber(int n) {
        int min = 1, max = n;

        while (true) {
            int mid = min + (max - min)/2;
            switch (guessNumber(mid)) {
                case 1:
                    min = mid + 1;
                    break;
                case -1:
                    max = mid;
                    break;

                case 0 :
                    return mid;

            }
        }
    }
}
