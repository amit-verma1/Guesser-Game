import java.util.Scanner;
import java.util.Random;;

public class GuesserGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int numOfTries = 0;
        System.out.println("----- Welcome to the Game -----");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        while (guess != randomNumber) {
            System.out.print("Enter your guess : ");
            guess = sc.nextInt();
            numOfTries++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in "+ numOfTries + " tries.");
            }
        }
        sc.close();
    }
}
