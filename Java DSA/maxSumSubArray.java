public class maxSumSubArray {
    public static void sub_numsay(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, -3, 4};
        sub_numsay(nums);
    }
}
