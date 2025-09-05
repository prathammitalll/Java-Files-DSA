import java.util.Arrays;

public class MajorityElement {
    public static int MajorityElements(int nums[]) {
        Arrays.sort(nums);
        int maxCount = 0, n = nums.length;
        
        for (int i=0; i<n; i++) {
            int count = 1;

            while (i<n-1 && nums[i]==nums[i+1]) {
                count++;
                i++;
            }

            if (count>maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        System.out.println(MajorityElements(nums));
    }
}
