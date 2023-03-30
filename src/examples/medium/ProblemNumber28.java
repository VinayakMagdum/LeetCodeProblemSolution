package examples.medium;

/**
 *
 */
public class ProblemNumber28 {
    public static void main(String[] args) {
        String haystack = "sbdbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                int cnt = 0;
                for(int j =0; j < needle.length(); j++) {
                    if(needle.charAt(j) == haystack.charAt(i + j)) {
                        cnt++;
                        continue;
                    } else {
                        break;
                    }
                }
                if(cnt == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
