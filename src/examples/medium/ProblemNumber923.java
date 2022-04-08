package examples.medium;

/**
 * https://leetcode.com/problems/3sum-with-multiplicity/
 *
 * Solution explanation = https://www.youtube.com/watch?v=jZcAldZP1ag
 */
public class ProblemNumber923 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3,4,4,5,5};
        int target = 8;
        System.out.println(threeSumMulti(arr, target));
    }

//    /**
//     * Bruit force approach
//     * @param arr
//     * @param target
//     * @return
//     */
//    private static int threeSumMulti(int[] arr, int target) {
//        int mod = 1_000_000_007;// 10^9+7
//        int count = 0;
//
//        for(int i = 0; i <= arr.length; i++) {
//            int[] cache = new int[101];
//            for (int j = i + 1; j < arr.length; j++) {
//                int k = target - arr[i] - arr[j];
//                if (k >= 0 && k <= 100 && cache[k] > 0) {
//                    count += cache[k];
//                    count %= mod;
//                }
//                cache[arr[j]]++;
//            }
//
//        }
//        return count;
//    }


    /**
     * Optimised approach
     *
     * @param arr
     * @param target
     * @return
     */
    private static int threeSumMulti(int[] arr, int target) {
        int mod = 1_000_000_007;// 10^9+7
        long count = 0;

        long[] cache = new long[101];
        for(int i : arr) {
            cache[i]++;
        }

        for(int i = 0; i <= 100; i++) {
            for(int j = i; j<= 100; j++) {
                int k = target - i - j;
                if(k < 0 || k > 100) {
                    continue;
                }
                if(i==j && j==k) {
                    count += (cache[i] * (cache [i] -1 ) * (cache[i] - 2))/6;
                } else if( i== j && j != k){
                    count += (cache[i] * (cache [i] -1 )/2) * cache[k];
                } else if(i < j && j < k) {
                    count += cache[i]*cache[j]*cache[k];
                }
            }

        }
        return (int)(count%mod);
    }
}
