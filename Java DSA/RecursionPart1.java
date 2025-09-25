public class RecursionPart1 {
    public static void DecreasingOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        DecreasingOrder(n - 1);
    }

    public static void IncreasingOrder(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        IncreasingOrder(n - 1);

        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1)
            return 1;

        int fn1 = factorial(n - 1);
        int fn = n * fn1;

        return fn;

    }

    public static int naturalSum(int n) {
        if (n == 0)
            return 1;

        int Sn1 = naturalSum(n - 1);
        int Sn = n + naturalSum(Sn1);
        return Sn;
    }

    public static int nthFibNumber(int n) {
        if (n == 0 || n == 1)
            return n;
        int fibn1 = nthFibNumber(n - 1);
        int fibn2 = nthFibNumber(n - 2);
        return fibn1 + fibn2;
    }

    public static boolean isArraySorted(int arr[], int i) {
        if (i == arr.length - 1)
            return true;

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isArraySorted(arr, i + 1);
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length)
            return -1;

        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, key, i + 1);
    }

    // public static int lastOccurance(int arr[], int key, int i) {
    //     if (i==0) return -1;

    //     if (arr[i]==key) return i;

    //     return lastOccurance(arr, key, i-1);
    // }

    // TODO: Another method to Do this

    public static int lastOccurance(int arr[], int key, int i) {
        if (i==arr.length) return -1;

        int isFound = lastOccurance(arr, key, i+1);

        if (isFound != -1 && arr[i]==key) {
            return i;
        }

        return isFound;
    }

    public static int PowerN(int x, int n) { // O(n)
        if (n==1) return x;

        return x * PowerN(x, n-1);   
    }

    public static int optimisedPower(int x, int n) { // O(logn)
        if (n==0) return 1;
        int halfPowerSq = optimisedPower(x, n/2) * optimisedPower(x, n/2);

        // n is odd
        if (n%2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;

    }

    



    public static void main(String[] args) {
        // int n = 5;
        // int arr[] = { 1, 2, 5, 3, 4 };

        // DecreasingOrder(n);
        // System.out.println();
        // IncreasingOrder(n);
        // System.out.println();
        // System.out.println(factorial(0));
        // System.out.println();
        // System.out.println(naturalSum(n));
        // System.out.println();
        // System.out.println(nthFibNumber(n));
        // System.out.println(isArraySorted(arr, 0));
        // System.out.println(firstOccurance(arr, 2, 0));
        // System.out.println(lastOccurance(arr, 3, arr.length - 1));

        // System.out.println(PowerN(2, 10));

        System.out.println(optimisedPower(2, 10));

    }
}