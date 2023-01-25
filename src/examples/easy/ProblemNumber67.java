package examples.easy;

/**
 * https://leetcode.com/problems/add-binary/
 */
public class ProblemNumber67 {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int len1 = a.length()-1;
        int len2 = b.length()-1;
        int carry = 0;

        while (len1 >=0 || len2 >=0) {
            int sum = carry;
            if(len1 >= 0) {
                sum += a.charAt(len1--) - '0';
            }
            if(len2 >= 0) {
                sum += b.charAt(len2--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }

        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
