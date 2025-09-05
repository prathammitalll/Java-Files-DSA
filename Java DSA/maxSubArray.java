public class maxSubArray {
    public static int maxSum(int nums[]) {
        int isMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (sum > isMax) {
                    isMax = sum;
                }
            }
        }
        return isMax;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        maxSum(nums);
    }

}