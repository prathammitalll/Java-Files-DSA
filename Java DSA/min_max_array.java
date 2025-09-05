public class min_max_array {
    public static int[] minMax(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        int minMax[] = {maxNum, minNum};
        return minMax;

    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 56, 10000, 167};
        System.out.println(minMax(arr));
    }
}
