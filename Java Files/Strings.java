import java.util.Scanner;

public class Strings {
    public static void printLetters(String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = new String("abcd"); // or we can make string like this

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);

        String name;
        // name = sc.next(); // Takes only one word
        name = sc.nextLine(); // Takes whole line
        
        System.out.println(name.length()); // Determines length of String
        
        // Concatenation
        String firstName = "Pratham";
        String lastName = "Mittal";
        String fullName = firstName+" "+lastName; // Concatenated String

        System.out.println(fullName.charAt(0)); // Gets the character at the particular index

        printLetters(fullName); // Print all the letters in the string

        System.out.println(fullName);
    }
}
