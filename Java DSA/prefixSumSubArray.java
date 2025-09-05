public class prefixSumSubArray {
    public static int sub_numsay(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(sub_numsay(nums));
    }
}
