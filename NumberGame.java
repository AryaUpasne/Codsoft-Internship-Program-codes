/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        // Set the initial number of attempts
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Can you guess it?");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Prompt the user to guess the number
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                // Check if the guess is correct
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                // Consume the invalid input to avoid an infinite loop
                scanner.next();
            }
        }

        // Close the scanner
        scanner.close();
    }
}
