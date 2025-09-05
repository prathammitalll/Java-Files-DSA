import java.util.Scanner;

public class myFile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        long n = sc.nextInt();
        
        long a = 0;
        long b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        for (long i = 2; i < n; i++){
            long c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}