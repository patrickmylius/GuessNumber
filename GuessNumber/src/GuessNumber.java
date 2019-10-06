import java.awt.*;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // generates a random number between 0...8-9-10.
        int tal = (int) (Math.random() * 10);

        // Guess is -1, so it enters the loop.
        int gaet = -1;

        System.out.println("Guess a number between <0-10> : ");

        // Loop runs until the number is guessed.
        while (gaet != tal) {
            gaet = input.nextInt(); // Number input for the scanner.
            if (gaet < tal) {
                System.out.println("for lavt");
            } else if (gaet > tal){
                System.out.println("for højt");
            }
        }
        System.out.println("Computeres tal = " + tal + " derfor gættede du rigtigt");
    }
}
