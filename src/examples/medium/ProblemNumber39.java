package examples.medium;
import java.util.List;
import java.util.ArrayList;

public class ProblemNumber39 {
    public static void main(String[] args) {
        ProblemNumber39 obj = new ProblemNumber39();
        int[] arr = {2, 3, 6, 7};
        System.out.println(obj.combinationSum(arr, 7));
    }

    /**
     * Finding combinations whose sum is equal to target
     *
     * @param candidates    Input numbers
     * @param target        Target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> pairs = new ArrayList<Integer>();
        generateCombination(0, pairs, target, candidates, result);
        return result;
    }

    /**
     * Generating combinations
     *
     * @param start     Start point
     * @param pairs     List of combinations
     * @param target    Target Sum
     * @param nums      Input numbers
     * @param result    Result
     */
    public void generateCombination(int start, List<Integer> pairs, int target,
                                    int[] nums, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList(pairs));
        }
        if(target < 0) {
            return;
        }
        for(int i = start; i < nums.length; i++) {
            pairs.add(nums[i]);
            generateCombination(i, pairs, target-nums[i], nums, result);
            pairs.remove(pairs.size() - 1);
        }

    }
}
