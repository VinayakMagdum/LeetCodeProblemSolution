package examples.easy;

public class ProblemNumber169 {

    public static void main(String[] args) {
        ProblemNumber169 obj = new ProblemNumber169();
        int[] arr = new int[]{2,2,1,1,1,2,2};
        System.out.println(obj.majorityElement(arr));
    }

    public int majorityElement(int[] num) {
        int candidate = num[0];
        int counter = 1;
        for (int i = 1; i < num.length; i ++){
            if (counter == 0){
                candidate = num[i];
                counter = 1;
            }
            else{
                if (num[i] == candidate)
                    counter ++;
                else
                    counter --;
            }
        }
        return candidate;
    }
}
