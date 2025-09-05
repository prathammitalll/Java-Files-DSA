import java.util.*;
public class multiple10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = sc.nextInt();
            System.out.println("Number is "+num);
            if (num%10==0){
                break;
            }
        }

    }
}
