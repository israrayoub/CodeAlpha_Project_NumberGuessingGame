import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number within the valid range.");
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > generatedNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + generatedNumber + " correctly!");
            }
        } while (userGuess != generatedNumber);

        scanner.close();
    }
}
