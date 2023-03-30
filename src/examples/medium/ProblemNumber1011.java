package examples.medium;

/**
 * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 */
public class ProblemNumber1011 {
    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int totLoad = 0;
        int maxLoad = 0;
        for(int weight : weights) {
            totLoad += weight;
            if(weight > maxLoad) {
                maxLoad = weight;
            }
        }
        int left = maxLoad, right = totLoad;

        while (left < right) {
            int mid = (left+right) / 2;
            if(feasible(weights, mid, days)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }

        return left;
    }

    private static boolean feasible(int[] weights, int capacity, int days) {
        int daysNeeded = 1, currentLoad = 0;
        for (int weight : weights) {
            currentLoad += weight;
            if (currentLoad > capacity) {
                daysNeeded++;
                currentLoad = weight;
            }
        }

        return daysNeeded <= days;
    }
}
