public class SearchAlgo {
    public static int linear_search(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start<=end) {
            int mid = (start+end)/2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int key = 12;

        int index = linear_search(nums, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
