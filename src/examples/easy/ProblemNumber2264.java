package examples.easy;

/**
 * https://leetcode.com/problems/largest-3-same-digit-number-in-string/
 */
public class ProblemNumber2264 {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
//        System.out.println("333".compareTo("777"));
    }

    public static String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 0; i < num.length() - 2; i++) {
            String str = num.substring(i, i+3);
            if(str.charAt(0) == str.charAt(1) && str.charAt(0) == str.charAt(2)) {
                if (ans.equals("")) {
                    ans = str;
                } else {
                    ans = Integer.parseInt(ans) > Integer.parseInt(str) ? ans : str;
                }
            }
        }
        return ans;
    }
}
