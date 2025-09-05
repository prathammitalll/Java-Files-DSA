import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num%i==0){
                isPrime = false;
            }
        }
        if (isPrime==true) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}