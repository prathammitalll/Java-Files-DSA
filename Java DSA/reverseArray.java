public class reverseArray {
    public static void reverse_array(int nums[]) {
            int first = 0;
            int last = nums.length - 1;
    
            while (first < last) {
                int temp = nums[last];
                nums[last] = nums[first];
                nums[first] = temp;
    
                first++;
                last--;
            }
        }
    
        public static void main(String args[]) {
            int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
            reverse_array(nums);
    
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
}
