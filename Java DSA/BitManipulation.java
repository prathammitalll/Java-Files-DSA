public class BitManipulation {
    public static String OddEven(int number) {
        return ((number & 1) == 1 ? "odd" : "even");

    }
    public static int getIthBit(int n, int i) {
        int bitMask = n<<i;
        return (n & bitMask) != 0 ? 1 : 0;
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit) {
        // return (newBit==0 ? clearithBit(n, i) : setithBit(n, i));
        // Another Approch 👇

        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask; 
    }
    public static int clearIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int clearIBitsInRange(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean powerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }

    public static int countNumberOfSetBits(int n) {
        int count = 0;

        while (n!=0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n>0) {
            if ((n & 1) != 0) { // check LSB
                ans *=  a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String args[]) {
        // System.out.println("Bitwise AND of 5 and 6 is " + (5 & 6)); // 4
        // System.out.println("Bitwise OR of 5 and 6 is " + (5 | 6)); // 7
        // System.out.println("Bitwise XOR of 5 and 6 is " + (5 ^ 6)); // 3
        // System.out.println("Bitwise NOT of 5 is " + (~5)); // -6
        // System.out.println("Bitwise Left Shift of 5 and 2 is " + (5 << 2)); // 20
        // System.out.println("Bitwise Right Shift of 5 and 2 is " + (5 >> 2)); // 1
        System.out.println(fastExpo(3, 5));
        
        
    }
}