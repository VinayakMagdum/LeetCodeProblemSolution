package examples.medium;

/**
 * https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
 */
public class ProblemNumber2125 {
    public static void main(String[] args) {
        String[] bank = new String[]{"011001","000000","010100","001000"};
//        String[] bank = new String[]{"000","111","000"};

        System.out.println(numberOfBeams(bank));
    }

    public static int numberOfBeams(String[] bank) {
        int ans = 0;
        if (bank.length <= 1) {
            return 0;
        }
        int onesCnt = findOnesCnt(bank[0]);
        for (int i = 1; i < bank.length; i++) {
            int curOnesCnt = findOnesCnt(bank[i]);
            if(curOnesCnt == 0) {
                continue;
            }
            if (onesCnt != 0) {
                ans += onesCnt * curOnesCnt;
            }
            onesCnt = curOnesCnt;
        }

        return ans;
    }

    private static int findOnesCnt(String s) {
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if(ch == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}
