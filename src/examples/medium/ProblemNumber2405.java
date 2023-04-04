package examples.medium;

/**
 * https://leetcode.com/problems/optimal-partition-of-string/
 */
public class ProblemNumber2405 {
    public static void main(String[] args) {
        String s = "ssssss";
        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {
        int ans = 0;
        String subStr = "";
        for (int i = 0; i < s.length(); i++) {
            if(subStr.contains(s.charAt(i) + "")) {
                ans++;
                subStr = s.charAt(i) + "";
            } else {
                subStr += s.charAt(i) + "";
            }
        }
        if(subStr.length() > 0) {
            ans++;
        }
        return ans;
    }
}
