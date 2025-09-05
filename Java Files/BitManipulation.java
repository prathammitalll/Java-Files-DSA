public class BitManipulation {
    public static void main(String args[]) {
        System.out.println("Bitwise AND of 5 and 6 is " + (5 & 6)); // 4
        System.out.println("Bitwise OR of 5 and 6 is " + (5 | 6)); // 7
        System.out.println("Bitwise XOR of 5 and 6 is " + (5 ^ 6)); // 3
        System.out.println("Bitwise NOT of 5 is " + (~5)); // -6
        System.out.println("Bitwise Left Shift of 5 and 2 is " + (5 << 2)); // 20
        System.out.println("Bitwise Right Shift of 5 and 2 is " + (5 >> 2)); // 1
    }
}