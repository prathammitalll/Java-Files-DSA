import java.util.*;
public class tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income = sc.nextInt();
        float tax = 0;

        if (income<500000){
            tax = 0;
            System.out.println(tax);
        }
        else if (income>500000 && income<100000){
            tax = income*0.2f;
            System.out.println(tax);
        }
        else{
            tax = income*0.3f;
            System.out.println(tax);
        }
    }
}
