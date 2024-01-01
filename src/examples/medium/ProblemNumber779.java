package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/k-th-symbol-in-grammar/
 */
public class ProblemNumber779 {
    public static void main(String[] args) {
        System.out.println(kthGrammar(2, 2));
    }

    public static int kthGrammar(int n, int k) {
        List<String> list = new ArrayList<>();
        list.add(0, "0");
        for(int i = 1; i < n; i++) {
            String str = list.get(i-1);
            StringBuilder val = new StringBuilder();
            for (int j =0; j < str.length(); j++) {
                if(str.charAt(j) == '0') {
                    val.append("01");
                } else if (str.charAt(j) == '1') {
                    val.append("10");
                }
            }
            list.add(i, val.toString());
        }
        return Character.getNumericValue(list.get(n-1).charAt(k-1));
    }
}
