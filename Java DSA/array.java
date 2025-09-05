import java.util.*;

public class array {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        
        for (int index = 0; index < 4; index++) {
            marks[index] = sc.nextInt();
            sc.close();
        }
        for (int i = 0; i < 4; i++){
            System.out.println(marks[i]);
        }
    }
}