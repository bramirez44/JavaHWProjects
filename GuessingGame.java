// GuessingGame.java
// Bryan Ramirez
// April 25, 2019

import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random();
		int number = randomNumbers.nextInt(10) + 1;
		
		int guess;
		int numGuesses = 0;
		boolean isItCorrect = true;
		System.out.println("I'm thinking of a number between 1 and 10.");
		do 
		{
	
			System.out.print("Guess what it is: ");
			guess = keyboard.nextInt();
			numGuesses += 1;
			
			if(guess == number)
			{
				System.out.println("Congratulations! You guessed it!");
				System.out.println("I was thinking of the number " + number);
				System.out.println("You got it right in " + numGuesses + " guesses");
				isItCorrect = true;
			}
			else if(guess < number)
			{
				System.out.println("No, that's too low");
				isItCorrect = false;
			}
			else if(guess > number)
			{
				System.out.println("No, that's too high");
				isItCorrect = false;
			}
					
		} while(!isItCorrect);
		
			
		

	}

}
