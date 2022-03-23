package examples.medium;

/**
 * https://leetcode.com/problems/unique-binary-search-trees/
 *
 */
public class ProblemNumber96 {

    public static void main(String[] args) {
        System.out.println(numTrees(7));
    }

    public static int numTrees(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        if(n == 1) {
            return 1;
        }
        for(int i =2; i<= n; i++) {
            for(int j = 0; j < i; j++) {
                arr[i] += arr[j] * arr[i - j - 1];
            }
        }
        return arr[n];
    }
}
