package examples.hard;

/**
 *
 */
public class ProblemNumber4 {
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int [] finalArr = new int[l1 + l2];
        int first = 0;
        int sec = 0;
        int cnt = 0;

        while(first < l1 && sec < l2) {
            if(nums1[first] < nums2[sec]) {
                finalArr[cnt] = nums1[first];
                first++;
            } else {
                finalArr[cnt] = nums2[sec];
                sec++;
            }
            cnt++;
        }

        while (first < l1)
            finalArr[cnt++] = nums1[first++];

        // Store remaining elements of second array
        while (sec < l2)
            finalArr[cnt++] = nums2[sec++];

        int mid = finalArr.length / 2;

        if(finalArr.length%2 != 0) {
            return (double) finalArr[mid];
        } else {
            return (double) (finalArr[mid-1]+ finalArr[mid])/2;
        }

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2}, nums2 = new int[]{3,4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
