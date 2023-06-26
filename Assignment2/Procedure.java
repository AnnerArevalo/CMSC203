package applocation;
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This class sets up a procedure object that describes the details of a procedure a patient has
 * 				undergone. It also has get and set methods for all of its fields.
 * Due: 7/3/23
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Anner Arevalo
*/

public class Procedure
{
	// Setting up all the required fields for the Procedure class
	private String procedureName = "";
	private String date = "";
	private String practitionerName = "";
	private double price;
	// Creating the Procedure class constructor
	public Procedure(String nameOfProcedure, String dateOfProcedure, String nameOfPractitioner, 
			         double procedurePrice)
	{
		procedureName = nameOfProcedure;
		date = dateOfProcedure;
		practitionerName = nameOfPractitioner;
		price = procedurePrice;
	}
	// Creating the get methods for all the Procedure class fields
	/**
	* Function: getProcedureName(); 
	* Description: Function is used to get the name of the Procedure.
	* Pre: None. 
	* Post: The function will get the name of any Procedure.
	 */
	public String getProcedureName()
	{
		return procedureName;
	}
	/**
	* Function: getDate(); 
	* Description: Function is used to get the date of the Procedure.
	* Pre: None.
	* Post: The function will get the date of any Procedure.
	 */
	public String getDate()
	{
		return date;
	}
	/**
	* Function: getPractitionerName(); 
	* Description: Function is used to get the name of the Procedures practitioner.
	* Pre: None.
	* Post: The function will get the name of any Procedures practitioner.
	 */
	public String getPratctitionerName()
	{
		return practitionerName;
	}
	/**
	* Function: getPrice(); 
	* Description: Function is used to get the price of the Procedure.
	* Pre: None.
	* Post: The function will get the price of any Procedure.
	 */
	public double getPrice()
	{
		return price;
	}
	//Creating all the set methods for the Procedure class fields
	/**
	* Function: setProcedureName(String); 
	* Description: Function is used to change the name of the Procedure.
	* Pre: The new name of the Procedure.
	* Post: The function will change the name of any Procedure.
	 */
	public void setProcedureName(String newProcedureName)
	{
		procedureName = newProcedureName;
	}
	/**
	* Function: setPractitionerName(String); 
	* Description: Function is used to change the name of the Procedures practitioner.
	* Pre: The new name of the Procedures practitioner.
	* Post: The function will change the name of any Procedures practitioner.
	 */
	public void setPractitionerName(String newPractitionerName)
	{
		practitionerName = newPractitionerName;
	}
	/**
	* Function: setDate(String); 
	* Description: Function is used to change the date of the Procedure.
	* Pre: The new date of the Procedure.
	* Post: The function will change the date of any Procedure.
	 */
	public void setDate(String newDate)
	{
		date = newDate;
	}
	/**
	* Function: setPrice(String); 
	* Description: Function is used to change the price of the Procedure.
	* Pre: The new price of the Procedure.
	* Post: The function will change the price of any Procedure.
	 */
	public void setPrice(double newPrice)
	{
		price = newPrice;
	}
}
