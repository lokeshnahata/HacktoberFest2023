import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");

        // Set the range for the random number
        int lowerLimit = 1;
        int upperLimit = 100;

        // Generate a random number
        Random random = new Random();
        int secretNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

        // Initialize variables
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        Scanner scanner = new Scanner(System.in);

        while (!hasGuessedCorrectly) {
            // Get the player's guess
            System.out.print("Guess the number between " + lowerLimit + " and " + upperLimit + ": ");
            int playerGuess = scanner.nextInt();

            // Increment the attempts
            attempts++;

            // Check if the guess is correct
            if (playerGuess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
            } else if (playerGuess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}
