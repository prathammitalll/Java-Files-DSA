public class pairInArray {
    public static void painInArray(int nums[]) {
        int i = 0;

        while (i < nums.length) {
            for (int j = i+1; j < nums.length; j++) {
                System.out.print("("+nums[i] + "," + nums[j]+")");
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        painInArray(nums);
    }
}