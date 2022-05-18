package examples.medium;

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
}
