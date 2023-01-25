package examples.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/restore-ip-addresses/
 */
public class ProblemNumber93 {
    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("101023"));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
            if(s.length() > 3 && s.length() <= 12) {
                dfs(s, 0, new ArrayList<>(), ans);
            }
        return ans;
    }

    private static void dfs(String s, int start, List<String> path, List<String> ans) {
        if(path.size() == 4 && start == s.length()) {
            ans.add(String.join(".", path));
        }

        if(path.size() == 4 || start == s.length()) {
            return;
        }

        for (int length = 1; length <=3; length++) {
            if(start + length  > s.length()) {
                return;
            }
            if (length > 1 && s.charAt(start) == '0') {
                return;
            }
            String num = s.substring(start, start+length);
            if(Integer.parseInt(num) > 255) {
                return;
            }

            path.add(num);
            dfs(s, start+length, path, ans);
            path.remove(path.size()-1);
        }
    }
}
