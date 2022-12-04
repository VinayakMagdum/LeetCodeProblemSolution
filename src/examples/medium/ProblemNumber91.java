package examples.medium;

/**
 * https://leetcode.com/problems/decode-ways/
 */
public class ProblemNumber91 {
    public static void main(String[] args) {
        String s = "226";
        System.out.println(numDecodings(s));
    }

    public static int numDecodings(String s) {
        if(s == null || s.isEmpty()) {
            return 0;
        }
        int length = s.length();
        int[] ways = new int[ length + 1];
        ways[length] = 1;
        ways[length - 1] = (s.charAt(s.length() - 1) - 1) > '0' ? 1 : 0;
        for (int i = s.length() - 2; i >=0; i --) {
            if (s.charAt(i) == '0') {
                ways[i] = 0;
            } else {
                int tmp = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                if (tmp > 26) {
                    ways[i] = ways[i + 1];
                } else {
                    ways[i] = ways[i + 1] + ways[i + 2];
                }
            }
        }
        return ways[0];
    }
}
