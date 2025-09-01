import java.util.Random;

import java.util.Scanner;



public class NumberGuess {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Scanner sc = new Scanner(System.in);

&nbsp;       Random rand = new Random();



&nbsp;       int numberToGuess = rand.nextInt(100) + 1; // random number 1–100

&nbsp;       int attempts = 0;

&nbsp;       int guess = 0;



&nbsp;       System.out.println("🎯 Welcome to the Number Guessing Game!");

&nbsp;       System.out.println("Guess a number between 1 and 100.");



&nbsp;       while (guess != numberToGuess) {

&nbsp;           System.out.print("Enter your guess: ");

&nbsp;           guess = sc.nextInt();

&nbsp;           attempts++;



&nbsp;           if (guess < numberToGuess) {

&nbsp;               System.out.println("Too low! Try again.");

&nbsp;           } else if (guess > numberToGuess) {

&nbsp;               System.out.println("Too high! Try again.");

&nbsp;           } else {

&nbsp;               System.out.println("✅ Correct! You guessed it in " + attempts + " tries.");

&nbsp;           }

&nbsp;       }

&nbsp;       sc.close();

&nbsp;   }

}



