package examples.easy;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class ProblemNumber191 {
    public static void main(String[] args) {
        ProblemNumber191 obj = new ProblemNumber191();
        obj.hammingWeight(00000000000000000000000000001011);
    }

    public int hammingWeight(int n) {
        int ans = 0;

        for (int i = 0; i < 32; ++i)
            if (((n >> i) & 1) == 1)
                ++ans;

        return ans;
    }
}
