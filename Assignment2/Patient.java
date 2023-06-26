package applocation;
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This class sets up a procedure object that describes the details of a patient. It has get and
 * 				set methods.
 * Due: 7/3/23
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Anner Arevalo
*/

public class Patient
{
	// Setting up all the required fields for the Patient class
	String firstName = "";
	String middleName = "";
	String lastName = "";
	String address = "";
	String city = "";
	String state = "";
	String zipcode = "";
	String phoneNumber = "";
	String emergencyName = "";
	String emergencyPhoneNumber = "";
	// Creating the patient class constructor
	public Patient(String first, String middle, String last, String patientAddress, String patientCity, 
			       String patientState, String patientZipcode, String patientPhoneNumber, 
			       String emergencyContactName, String emergencyContactNumber)
	{
		firstName = first;
		middleName = middle;
		lastName = last;
		address = patientAddress;
		city = patientCity;
		state = patientState;
		zipcode = patientZipcode;
		phoneNumber = patientPhoneNumber;
		emergencyName = emergencyContactName;
		emergencyPhoneNumber = emergencyContactNumber;
	}
	// Creating the get methods for all the fields
	/**
	* Function: getFirstName(); 
	* Description: Function is used to get the first name of any Patient.
	* Pre: None. 
	* Post: The function will return the first name of the Patient.
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	* Function: getLastName(); 
	* Description: Function is used to get the last name of any Patient.
	* Pre: None. 
	* Post: The function will return the last name of the Patient.
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	* Function: getMiddleName(); 
	* Description: Function is used to get the middle name of any Patient.
	* Pre: None. 
	* Post: The function will return the middle name of the Patient.
	 */
	public String getMiddleName()
	{
		return middleName;
	}
	/**
	* Function: getAddress(); 
	* Description: Function is used to get the address of any Patient.
	* Pre: None. 
	* Post: The function will return the address of the Patient.
	 */
	public String getAddress()
	{
		return address;
	}
	/**
	* Function: getCity(); 
	* Description: Function is used to get the city of any Patient.
	* Pre: None. 
	* Post: The function will return the city of the Patient.
	 */
	public String getCity()
	{
		return city;
	}
	/**
	* Function: getState(); 
	* Description: Function is used to get the state of any Patient.
	* Pre: None. 
	* Post: The function will return the state of the Patient.
	 */
	public String getState()
	{
		return state;
	}
	/**
	* Function: getZipcode(); 
	* Description: Function is used to get the zipcode of any Patient.
	* Pre: None. 
	* Post: The function will return the zipcode of the Patient.
	 */
	public String getZipcode()
	{
		return zipcode;
	}
	/**
	* Function: getPhoneNumber(); 
	* Description: Function is used to get the phone number of any Patient.
	* Pre: None. 
	* Post: The function will return the phone number of the Patient.
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	/**
	* Function: getEmergencyContactName(); 
	* Description: Function is used to get the name of any Patients emergency contact.
	* Pre: None. 
	* Post: The function will return the name of any Patients emergency contact.
	 */
	public String getEmergencyContactName()
	{
		return emergencyName;
	}
	/**
	* Function: getEmergencyPhoneNumber(); 
	* Description: Function is used to get the phone number of any Patients emergency contact.
	* Pre: None. 
	* Post: The function will return the phone number of any Patients emergency contact.
	 */
	public String getEmergencyPhoneNumber()
	{
		return emergencyPhoneNumber;
	}
	// Creating set methods for all the fields
	/**
	* Function: setFirstName(String); 
	* Description: Function is used to set the first name of any Patient.
	* Pre: Patients new first name. 
	* Post: The function will change the Patients first name.
	 */
	public void setFirstName(String newFirstName)
	{
		firstName = newFirstName;
	}
	/**
	* Function: setMiddleName(String); 
	* Description: Function is used to set the middle name of any Patient.
	* Pre: Patients new middle Name. 
	* Post: The function will change the Patients middle name.
	 */
	public void setMiddleName(String newMiddleName)
	{
		middleName = newMiddleName;
	}
	/**
	* Function: setLastName(String); 
	* Description: Function is used to set the last name of any Patient.
	* Pre: Patients new last Name. 
	* Post: The function will change the Patients last name.
	 */
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}
	/**
	* Function: setAddress(String); 
	* Description: Function is used to set the address of any Patient.
	* Pre: Patients new address. 
	* Post: The function will change the Patients address.
	 */
	public void setAddress(String newAddress)
	{
		address = newAddress;
	}
	/**
	* Function: setCity(String); 
	* Description: Function is used to set the city of any Patient.
	* Pre: Patients new city. 
	* Post: The function will change the Patients city.
	 */
	public void setCity(String newCity)
	{
		city = newCity;
	}
	/**
	* Function: setState(String); 
	* Description: Function is used to set the state any Patient.
	* Pre: Patients new state. 
	* Post: The function will change the Patients state.
	 */
	public void setState(String newState)
	{
		state = newState;
	}
	/**
	* Function: setZipcode(String); 
	* Description: Function is used to set the zipcode of any Patient.
	* Pre: Patients new zipcode. 
	* Post: The function will change the Patients zipcode.
	 */
	public void setZipcode(String newZipcode)
	{
		zipcode = newZipcode;
	}
	/**
	* Function: setPhoneNumber(String); 
	* Description: Function is used to set the phone number of any Patient.
	* Pre: Patients new phone number. 
	* Post: The function will change the Patients phone number.
	 */
	public void setPhoneNumber(String newPhoneNumber)
	{
		phoneNumber = newPhoneNumber;
	}
	/**
	* Function: setEmergencyName(String); 
	* Description: Function is used to set the name of any Patients emergency contact.
	* Pre: Patients new emergency contact name. 
	* Post: The function will change the name of any Patients emergency contact.
	 */
	public void setEmergencyName(String newEmergencyName)
	{
		emergencyName = newEmergencyName;
	}
	/**
	* Function: setEmergencyPhoneNumber(String); 
	* Description: Function is used to set the phone number of any Patients emergency contact.
	* Pre: Patients new emergency contact phone number. 
	* Post: The function will change the phone number of any Patients emergency contact.
	 */
	public void setEmergencyPhoneNumber(String newEmergencyPhoneNumber)
	{
		emergencyPhoneNumber = newEmergencyPhoneNumber;
	}
}