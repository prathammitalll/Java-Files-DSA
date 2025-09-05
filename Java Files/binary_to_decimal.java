import java.util.Scanner;

public class binary_to_decimal {
    public static int binToDec(int n){
        int pow = 0;
        int dec = 0;

        while (n > 0) {
            int rem = n % 10;
            dec += rem * Math.pow(2, pow);
            n /= 10;
            pow++;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binToDec(n));
    }
}
