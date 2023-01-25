package examples.easy;

/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 */
public class ProblemNumber944 {
    public static void main(String[] args) {
        String[] strs = new String[]{"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {
        final int n = strs[0].length();
        int result = 0;

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < strs.length -1; ++j) {
                if(strs[j].charAt(i) > strs[j+1].charAt(i)) {
                    ++result;
                    break;
                }
            }
        }
        return result;
    }
}
