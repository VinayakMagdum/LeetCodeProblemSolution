package examples.easy;

/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
public class ProblemNumber744 {
    public static void main(String[] args) {

    }

    // Brute Force
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        for (char ch : letters) {
            if(ch > target) {
                ans = ch;
                break;
            }
        }
        return ans;
    }


    // BFS
    public char nextGreatestLetter2(char[] letters, char target) {
        int left = 0, right = letters.length -1, mid;

        while (left < right) {
            mid = (left + right) / 2;
            if(letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return left == letters.length ? letters[0] : letters[left];
    }
}
