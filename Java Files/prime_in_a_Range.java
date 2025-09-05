import java.util.Scanner;

public class prime_in_a_Range{
    public static void prime_Range(int n){
        for (int i = 3; i<=n; i++){
            boolean isPrime = true;
            for (int j = 2; j<=Math.sqrt(i); j++){
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime_Range(n);
    }
}