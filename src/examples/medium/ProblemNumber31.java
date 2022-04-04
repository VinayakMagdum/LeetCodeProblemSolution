package examples.medium;

public class ProblemNumber31 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 5, 4, 1};
        ProblemNumber31 obj = new ProblemNumber31();
        obj.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0) {
            int j = nums.length-1;
            while(j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start){
        int end = nums.length-1;
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
