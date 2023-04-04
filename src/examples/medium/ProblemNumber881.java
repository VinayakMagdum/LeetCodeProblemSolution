package examples.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/boats-to-save-people/
 */
public class ProblemNumber881 {
    public static void main(String[] args) {
        int[] people = new int[]{3,2,2,1};
        System.out.println(numRescueBoats(people, 5));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            ans++;
            if(people[i] + people[j] <= limit) {
                i++;
            }

            j--;
        }
        return ans;
    }
}
