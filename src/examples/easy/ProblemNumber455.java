package examples.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/assign-cookies/
 */
public class ProblemNumber455 {
    public static void main(String[] args) {
//        int[] g = new int[] {1,2,3};
//        int[] s = new int[] {1,1};

        int[] g = new int[] {1,2};
        int[] s = new int[] {1,2,3};

//        int[] g = new int[] {1,2,3};
//        int[] s = new int[] {3};


//        int[] g = new int[] {10,9,8,7};
//        int[] s = new int[] {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIndex = 0;
        int contentChildren = 0;
        while (cookieIndex < s.length && contentChildren < g.length) {
            if(s[cookieIndex] >= g[contentChildren]) {
                contentChildren++;
            }
            cookieIndex++;
        }
        return contentChildren;
    }
}
