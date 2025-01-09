package examples.easy;

/**
 * https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/?envType=daily-question&envId=2025-01-08
 */
public class ProblemNumber3042 {
    public static void main(String[] args) {
        System.out.println(countPrefixSuffixPairs(new String[]{"pa","papa","ma","mama"}));
//        System.out.println(countPrefixSuffixPairs(new String[]{"a","aba","ababa","aa"}));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static boolean isPrefixAndSuffix(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;
        }
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
