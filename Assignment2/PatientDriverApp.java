package applocation;
import java.util.Scanner;
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This class makes three Patient objects and three Procedure objects, and then displays their
 * 				details.
 * Due: 7/3/23
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Anner Arevalo
*/

public class PatientDriverApp
{
	static Scanner input = new Scanner(System.in);
	// Creating the main method of the program
	public static void main(String[] args)
	{
		// Creating the patient instance
		Patient firstPatient = new Patient("Anner", "Daniel", "Arevalo", "43 Elm St", "Rockville", "MD",
										   "20888", "293 456 9988", "Andrea Arevalo", "345 675 0086");
		// Creating the three Procedure instances
		Procedure firstProcedure = new Procedure("Physical Exam", "7/20/23", "Dr. Irvine", 250.0);
		Procedure secondProcedure = new Procedure("X-ray", "7/20/23", "Dr. Jamison", 500.0);
		Procedure thirdProcedure = new Procedure("Blood test", "7/20/23", "Dr. Smith", 200.0);
		// Displaying the information of the Patient
		System.out.println("This program was developed by a student: Anner Arevalo 6/10/23");
		System.out.println("Patient name: " + firstPatient.getFirstName() + " " + firstPatient.getMiddleName()
						   + " " + firstPatient.getLastName());
		System.out.println("Address: " + firstPatient.getAddress());
		System.out.println("City: " + firstPatient.getCity());
		System.out.println("State: " + firstPatient.getState());
		System.out.println("Zip:" + firstPatient.getZipcode());
		System.out.println("Emergency Contact: " + firstPatient.getEmergencyContactName());
		System.out.println("Emergency Contact: " + firstPatient.getEmergencyPhoneNumber());
		// Displaying the information of the first Procedure
		System.out.println("\nProcedure: " + firstProcedure.getProcedureName());
		System.out.println("Procedure Date: " + firstProcedure.getDate());
		System.out.println("Practitioner: " + firstProcedure.getPratctitionerName());
		System.out.println("Procedure Charge: " + firstProcedure.getPrice());
		// Displaying the information of the second Procedure
		System.out.println("\nProcedure: " + secondProcedure.getProcedureName());
		System.out.println("Procedure Date: " + secondProcedure.getDate());
		System.out.println("Practitioner: " + secondProcedure.getPratctitionerName());
		System.out.println("Procedure Charge: " + secondProcedure.getPrice());
		// Displaying the information of the third Procedure
		System.out.println("\nProcedure: " + thirdProcedure.getProcedureName());
		System.out.println("Procedure Date: " + thirdProcedure.getDate());
		System.out.println("Practitioner: " + thirdProcedure.getPratctitionerName());
		System.out.println("Procedure Charge: " + thirdProcedure.getPrice());
		// Displaying programmer information and ending the program
		System.out.println("\nStudent name: Anner Arevalo");
		System.out.println("Student MC M#: 21123012");
		System.out.println("Due Date: 07/03/23");
	}
}
