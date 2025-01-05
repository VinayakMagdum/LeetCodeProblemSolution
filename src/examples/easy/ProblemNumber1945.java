package examples.easy;

/**
 * https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
 */
public class ProblemNumber1945 {
    public static void main(String[] args) {
        int a = 'z';
        int z = '3';
//        System.out.println(5 + '5' - '0');
        System.out.println(getLucky("zbax", 2));
    }

    static int getLucky(String s, int k) {
        String digits = "";
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 96;
            digits += num;
        }
        int ans = 0;
        while (k > 0) {
            int num = 0;
            for (int i = 0; i < digits.length(); i++) {
                num += digits.charAt(i) - '0';
            }
            if(num <= 9) {
                return num;
            }
            digits = "" + num;
            k--;
            ans = num;
        }
        System.out.println(digits);
        return ans;
    }
}
