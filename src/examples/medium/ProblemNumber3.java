package examples.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class ProblemNumber3 {
    private static int lengthOfLongestSubstring(String s) {
        int result = 0;
        for(int i = 0; i < s.length();) {
            StringBuilder sb = new StringBuilder();
            while( i < s.length() && !(sb.toString()).contains(s.charAt(i) + "")) {
                sb.append(s.charAt(i));
                i++;
            }
            if(result < sb.toString().length()) {
                result = sb.toString().length();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring2(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        int left = 0;
        int ans = 1;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            // Update max length
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
