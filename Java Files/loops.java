import java.util.*;
public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int mySum = 0;
        int n = sc.nextInt();
        while (counter<=n){
            mySum += counter;
            counter++;
        }
        System.out.println("Sum is "+mySum);
    }
}