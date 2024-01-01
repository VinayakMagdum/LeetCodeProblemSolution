package examples.medium;

/**
 * https://leetcode.com/problems/minimum-time-to-make-rope-colorful/
 */
public class ProblemNumber1578 {
    public static void main(String[] args) {
//        System.out.println(minCost("abaac", new int[]{1,2,3,4,5}));

//        System.out.println(minCost("abc", new int[]{1,2,3}));

        System.out.println(minCost("aabaa", new int[]{1,2,3,4,1}));

//        System.out.println(minCost("cddcdcae", new int[]{4,8,8,4,4,5,4,2}));
    }

//    public static int minCost(String colors, int[] neededTime) {
//        int minCost = 0;
//        for (int i = 0; i < neededTime.length - 1; i++) {
//            int sum = neededTime[i];
//            boolean duplicateFound = false;
//            int max = neededTime[i];
//            for (int j = i+1; j < neededTime.length; j++) {
//                if(colors.charAt(i) == colors.charAt(j)) {
//                    max = Math.max(max, neededTime[j]);
//                    sum += neededTime[j];
//                    duplicateFound = true;
//                } else {
//                    break;
//                }
//                i++;
//            }
//            if (duplicateFound) {
//                minCost += (sum-max);
//            }
//        }
//        int sum = 0;
//        int max = neededTime[0];
//        for (int i = 1; i < colors.length() - 1; i++) {
//            if (colors.charAt(i) == colors.charAt(i-1)) {
//                sum += Math.min(max, neededTime[i]);
//                max += Math.max(max, neededTime[i]);
//            } else {
//                max = neededTime[i];
//            }
//        }
//
//        return minCost;
//    }


    public static int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int maxNeededTime = neededTime[0];

        for (int i = 1; i < colors.length(); ++i)
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                ans += Math.min(maxNeededTime, neededTime[i]);
                maxNeededTime = Math.max(maxNeededTime, neededTime[i]);
            } else {
                maxNeededTime = neededTime[i];
            }

        return ans;
    }
}
