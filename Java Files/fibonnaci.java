import java.util.Scanner;

public class fibonnaci{
    public static void fibonnaci_series(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        for (int i = 2; i < n; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        fibonnaci_series(n);
    }
}
