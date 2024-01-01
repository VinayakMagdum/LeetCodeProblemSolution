package examples.easy;

/**
 * https://leetcode.com/problems/maximum-score-after-splitting-a-string/
 */
public class ProblemNumber1422 {
    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }

    public static int maxScore(String s) {
        char[] chars = s.toCharArray();
        int zerosCnt = chars[0] == '0'? 1 : 0;
        int onesCnt = 0;
        for (int j = 1; j < chars.length; j++) {
            if(chars[j] == '1') {
                onesCnt++;
            }
        }
        int ans = zerosCnt + onesCnt;

        for (int i = 1; i < chars.length-1; i++) {
            zerosCnt = chars[i] == '0' ? ++zerosCnt : zerosCnt;
            onesCnt = chars[i] == '1' ? --onesCnt: onesCnt;
            ans = Math.max(ans, (zerosCnt+onesCnt));
        }
        return ans;

//        for (int i = 0; i < chars.length-1; i++) {
//            if(chars[i] == '0') {
//                zerosCnt++;
//            }
//            int ones = 0;
//            for (int j = i+1; j < chars.length; j++) {
//                if(chars[j] == '1') {
//                    ones++;
//                }
//            }
//            ans = Math.max(ans, (zerosCnt+ones));
//        }
//        return ans;
    }
}
