import java.util.Scanner;

public class interfaces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        System.out.println(a);
    }
}

interface Herbivore {
    
}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore {

}

interface ChessPlayer {
    void moves(); // By default public
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}
