import java.util.Scanner;
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This class creates a Movie instance using user inputs until the user tells the program to stop
 * Due: 7/3/23
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Anner Arevalo
*/
public class MovieDriver_Task2
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		String title = " ";
		String rating = " ";
		int tickets = 0;
		String yn = " ";
		do
		{
			Movie firstMovie = new Movie();
			System.out.println("Enter the name of a movie");
			title = input.nextLine();
			firstMovie.setTitle(title);
			System.out.println("Enter the rating of the movie");
			rating = input.nextLine();
			firstMovie.setRating(rating);
			System.out.println("Enter the number of tickets sold for this movie");
			tickets = input.nextInt();
			firstMovie.setSoldTickets(tickets);
			System.out.println(firstMovie.toString());
			System.out.println("Do you want to enter another? (y or n)");
			input.nextLine();
			yn = input.nextLine();
		}while(yn.equals("y") || yn.equals("Y"));
		System.out.println("Goodbye");
	}
}
