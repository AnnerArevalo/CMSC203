package application;
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: (Give a brief description for each Class)
 * Due: 06/12/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Anner Arevalo
*/

import java.util.Scanner;
import java.util.Random;

public class ESP
{
	// Making a scanner so that the program can take user inputs
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args)
	{
		// Setting up an array of colors for the computer and user to choose from
		String[] colors = {"Blue", "Black", "White", "Green"};
		// Setting up variables and program intro
		String name = "";
		String id = "";
		String description = "";
		String dueDate = "";
		int count = 0;
		int correct = 0;
		int color = 0;
		int userInput = 0;
		System.out.print("Please enter your name: ");
		name = input.nextLine();
		System.out.print("Please enter your MC M#: ");
		id = input.nextLine();
		System.out.print("Describe yourself: ");
		description = input.nextLine();
		System.out.print("Due Date: ");
		dueDate = input.nextLine();
		System.out.println("\nCMSC 203 Assignnment 1: Test your ESP skills!");
		// Using a while loop so that the game lasts ten rounds
		while(count < 10)
		{
			count++;
			// The computer chooses a color
			color = rand.nextInt(4);
			System.out.print("\nRound " + count);
			System.out.println("\nI'm thinking of a color.");
			System.out.println("Is it Blue(0), Black(1), White(2), or Green(3)?");
			// The user guesses a color
			System.out.print("Enter your guess: ");
			userInput = input.nextInt();
			System.out.println("\nI was thinking of " + colors[color]);
			// The program compares the users guess to the computers color and increases the users score if they are correct
			if(userInput == color)
				correct++;
		}
		// The game has ended and the program will now display the results
		System.out.println("Game over");
		System.out.println("\nYou guessed " + correct + " out of 10 colors correctly.");
		System.out.println("User Name: " + name);
		System.out.println("Student MC M#: " + id);
		System.out.println("User description " + description);
		System.out.println("Date: " + dueDate);
		System.out.print("Programmer Name: Anner Arevalo");
	}
}
