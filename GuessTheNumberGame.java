import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        int lowerBound = 1;
		        int upperBound = 100;
		        int numberOfRounds = 3;
		        int totalScore = 0;

		        System.out.println("Welcome, now you can Guess the Number!");

		        for (int round = 1; round <= numberOfRounds; round++) {
		            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
		            int attempts = 0;
		            int maxAttempts = 6;

		            System.out.println("\nRound " + round + ": Guess a number between " + lowerBound + " and " + upperBound);

		            while (attempts < maxAttempts) {
		                System.out.print("Enter your guess: ");
		                int userGuess = scanner.nextInt();
		                attempts++;

		                if (userGuess == targetNumber) {
		                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
		                    int roundScore = maxAttempts - attempts + 1;
		                    totalScore += roundScore;
		                    System.out.println("Round Score: " + roundScore);
		                    break;
		                } else if (userGuess < targetNumber) {
		                    System.out.println("Try again! The number is higher.");
		                } else {
		                    System.out.println("Try again! The number is lower.");
		                }

		                if (attempts == maxAttempts) {
		                    System.out.println("Sorry! You've reached the maximum number of attempts. The correct number was: " + targetNumber);
		                }
		            }
		        }

		        System.out.println("\nGame Over!");
		        System.out.println("Total Score: " + totalScore);

		        scanner.close();
		    }
		


	}


