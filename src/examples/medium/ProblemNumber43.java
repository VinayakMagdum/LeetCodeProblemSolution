package examples.medium;

import java.math.BigInteger;

/**
 * https://leetcode.com/problems/multiply-strings/
 */
public class ProblemNumber43 {

    public static void main(String[] args) {
        String first = "123";
        String sec = "456";
        System.out.println(multiply(first, sec));
    }


//    private static String multiply(String num1, String num2) {
//        BigInteger first = new BigInteger(num1);
//        BigInteger sec = new BigInteger(num2);
//
//        BigInteger res = first.multiply(sec);
//
//        return String.valueOf(res);
//    }

    private static String multiply(String num1, String num2) {
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();
        int[] d = new int[n1.length()+n2.length()];
        for(int i=0; i < n1.length(); i++){
            for(int j=0; j < n2.length(); j++){
                d[i+j] += (n1.charAt(i)-'0') * (n2.charAt(j)-'0');
            }
        }

        String result = "";
        for(int i=0; i < d.length; i++) {
            int digit = d[i]%10;
            int carry = d[i]/10;
            if(i+1 < d.length){
                d[i+1] += carry;
            }
            result = (digit + "") + result;
        }
        int index = 0;
        while(index < result.length() - 1 && result.charAt(index)=='0'){
            index ++;
        }
        return result.substring(index);

    }
}
