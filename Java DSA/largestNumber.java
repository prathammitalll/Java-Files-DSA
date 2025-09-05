public class largestNumber {
    public static int largest_number(int num[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static int smallest_number(int num[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        return smallest;
    }
    
    public static void main(String[] args) {
        int num[] = {2,3,5,4};
        System.out.println("Largest number is: " + largest_number(num));
        System.out.println("Smallest number is: " + smallest_number(num));
    }
}