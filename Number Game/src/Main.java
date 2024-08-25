import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int maxGuesses = 10;
        int totalScore = 0;
        boolean continuePlaying = true;

        System.out.println("Welcome to the Guess The Number Game!");

        while (continuePlaying) {
            int targetNumber = randomGenerator.nextInt(100) + 1;
            int currentAttempts = 0;
            boolean isGuessed = false;

            System.out.println("I've picked a number between 1 and 100. Can you find it?");

            while (currentAttempts < maxGuesses && !isGuessed) {
                System.out.print("Your guess: ");
                int playerGuess = inputScanner.nextInt();
                currentAttempts++;

                if (playerGuess == targetNumber) {
                    System.out.println("Well done! You've guessed the number!");
                    isGuessed = true;
                    totalScore += (maxGuesses - currentAttempts + 1);  // Higher score for fewer guesses
                } else if (playerGuess < targetNumber) {
                    System.out.println("Your guess is too low! Try again.");
                } else {
                    System.out.println("Your guess is too high! Try again.");
                }
            }

            if (!isGuessed) {
                System.out.println("You've run out of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Would you like to play another round? (yes/no): ");
            String playAgainResponse = inputScanner.next();
            if (!playAgainResponse.equalsIgnoreCase("yes")) {
                continuePlaying = false;
            }
        }

        System.out.println("Your total score is: " + totalScore);
        System.out.println("Thanks for playing Guess The Number Game!");
        inputScanner.close();
    }
}
