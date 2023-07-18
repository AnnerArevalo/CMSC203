/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This class creates a management company that owns one or multiple properties.
 * Due: 07/17/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Anner Arevalo
*/
public class ManagementCompany
{
	
	private static final int MAX_PROPERTY = 5;
	private static final int MGMT_DEPTH = 10;
	private static final int MGMT_WIDTH = 10;
	
	private String companyName;
	private String taxID;
	private double feePercentage;
	
	private Property[] properties = new Property[MAX_PROPERTY];
	private Plot plot;
	private int numberOfProperties;
	/**
	 * Constructs a Management Company with default values
	 */
	public ManagementCompany()
	{
		companyName = "";
		taxID = "";
		feePercentage = 0.0;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		numberOfProperties = 0;
	}
	/**
	 * Constructs a Management Company from a given name, tax ID, and management fee. Has a default Plot
	 * @param compName: The name of the Management Company
	 * @param tax: The tax ID of the Management Company
	 * @param fee: The management fee
	 */
	public ManagementCompany(String compName, String tax, double fee)
	{
		companyName = compName;
		taxID = tax;
		feePercentage = fee;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		numberOfProperties = 0;
	}
	/**
	 * Constructs a Management Company and Plot from the given values 
	 * @param compName: The name of the Management Company
	 * @param tax: The tax ID of the Management Company
	 * @param fee: The management fee
	 * @param x: The x coordinate of the Management Company's Plot
	 * @param y: The y coordinate of the Management Company's Plot
	 * @param width: The width of the Management Company's Plot
	 * @param depth: The depth of the Management Company's Plot
	 */
	public ManagementCompany(String compName, String tax, double fee, int x, int y, int width, int depth)
	{
		companyName = compName;
		taxID = tax;
		feePercentage = fee;
		plot = new Plot(x, y, width, depth);
		properties = new Property [MAX_PROPERTY];
		numberOfProperties = 0;
	}
	/**
	 * Constructs a copy of a Management Company
	 * @param otherCompany: The Management Company being copied
	 */
	public ManagementCompany(ManagementCompany otherCompany)
	{
		companyName = otherCompany.getName();
		taxID = otherCompany.getTaxID();
		feePercentage = otherCompany.getMgmFeePer();
		plot = otherCompany.getPlot();
		properties = otherCompany.getProperties();
		numberOfProperties = otherCompany.getPropertiesCount();
	}
	/**
	 * Adds a Property made from the given values with a default Plot to the Management Company
	 * @param name: The Property's name
	 * @param cityName: The city the Property is in
	 * @param rentAmount: The Property's rent
	 * @param ownerName: The Property's owner
	 * @return -1 if the Management Company's array is full, -2 if the Property is null, 
	 * 		   -3 if the Property is outside of the Management Company's Plot, -4 if the new Property overlaps any existing Properties,
	 * 		   otherwise it returns the index where the Property is stored
	 */
	public int addProperty(String name,String cityName, double rentAmount, String ownerName)
	{
		int answer;
		boolean four = false;
		Property newProp = new Property(name,cityName,rentAmount,ownerName);
		Plot newPlot;
		for(int i = 0; i < numberOfProperties; i++)
		{
			newPlot = properties[i].getPlot();
			if(newPlot.overlaps(newProp.getPlot()) == true)
				four = true;
		}
		if(numberOfProperties == MAX_PROPERTY)
			answer = -1;
		else if(newProp == null)
			answer = -2;
		else if(plot.encompasses(newProp.getPlot()))
			answer = -3;
		else if(four == true)
			answer = -4;
		else
		{
			properties[numberOfProperties] = newProp;
			answer = numberOfProperties;
			numberOfProperties++;
		}
		return answer;
	}
	/**
	 * Adds a Property with a Plot made from the given values to the Management Company
	 * @param name: The Property's name
	 * @param cityName: The city the Property is in
	 * @param rentAmount: The Property's rent
	 * @param ownerName: The Property's owner
	 * @param x: The x coordinate of the Plot
	 * @param y: The y coordinate of the Plot
	 * @param width: The width of the Plot 
	 * @param depth: The depth of the Plot
	 * @return -1 if the Management Company's array is full, -2 if the Property is null, 
	 * 		   -3 if the Property is outside of the Management Company's Plot, -4 if the new Property overlaps any existing Properties,
	 * 		   otherwise it returns the index where the Property is stored
	 */
	public int addProperty(String name,String cityName, double rentAmount, String ownerName, int x, int y, int width, int depth)
	{
		int answer;
		boolean four = false;
		Property newProp = new Property(name,cityName,rentAmount,ownerName,x,y,width,depth);
		Plot newPlot;
		for(int i = 0; i < numberOfProperties; i++)
		{
			newPlot = properties[i].getPlot();
			if(newPlot.overlaps(newProp.getPlot()) == true)
				four = true;
		}
		if(numberOfProperties == MAX_PROPERTY)
			answer = -1;
		else if(newProp == null)
			answer = -2;
		else if(plot.encompasses(newProp.getPlot()))
			answer = -3;
		else if(four == true)
			answer = -4;
		else
		{
			System.out.println(numberOfProperties);
			properties[numberOfProperties] = newProp;
			answer = numberOfProperties;
			numberOfProperties++;
		}
		return answer;
	}
	/**
	 * Adds a Property to the Management Company
	 * @param prop: The Property being added
	 * @return -1 if the Management Company's array is full, -2 if the Property is null, 
	 * 		   -3 if the Property is outside of the Management Company's Plot, -4 if the new Property overlaps any existing Properties,
	 * 		   otherwise it returns the index where the Property is stored
	 */
	public int addProperty(Property prop)
	{
		int answer;
		boolean four = false;
		Property newProp = new Property(prop);
		Plot newPlot;
		for(int i = 0; i < numberOfProperties; i++)
		{
			newPlot = properties[i].getPlot();
			if(newPlot.overlaps(newProp.getPlot()) == true)
				four = true;
		}
		if(numberOfProperties == MAX_PROPERTY)
			answer = -1;
		else if(newProp == null)
			answer = -2;
		else if(plot.encompasses(newProp.getPlot()))
			answer = -3;
		else if(four == true)
			answer = -4;
		else
		{
			properties[numberOfProperties] = newProp;
			answer = numberOfProperties;
			numberOfProperties++;
		}
		return answer;
	}
	/**
	 * Removes the last non-null Property of the Management Company's array
	 */
	public void removeLastProperty()
	{
		properties[numberOfProperties] = null;
		numberOfProperties--;
	}
	/**
	 * Determines if the Management Company's array is full
	 * @return true if the array is full, false if it's not
	 */
	public boolean isPropertiesFull()
	{
		boolean answer = false;
		if(numberOfProperties == MAX_PROPERTY)
			answer = true;
		return answer;
			
	}
	/**
	 * Gets the total amount of rent from all of the Management Company's Properties
	 * @return The total amount of rent
	 */
	public double getTotalRent()
	{
		double sum = 0.0;
		for(int i = 0; i < numberOfProperties; i++)
		{
			sum += properties[i].getRentAmount();
		}
		return sum;
	}
	/**
	 * Gets the Property with the highest rent
	 * @return The Property with the highest rent
	 */
	public Property getHighestRentProperty()
	{
		Property prop;
		double max = 0.0;
		int index = 0;
		for(int i = 0; i < numberOfProperties; i++)
		{
			if(properties[i].getRentAmount() > max)
			{
				max = properties[i].getRentAmount();
				index = i;
			}
		}
		prop = new Property(properties[index]);
		return prop;
	}
	/**
	 * Gets the number of Property's the Management Company has
	 * @return The number of Properties the Management Company has
	 */
	public int getPropertiesCount()
	{
		return numberOfProperties;
	}
	/**
	 * Determines if the Management Company's fee is valid
	 * @return true if the fee is between 0 and 100 percent, false otherwise
	 */
	public boolean isManagementFeeValid()
	{
		boolean answer = false;
		if(feePercentage > 0 && feePercentage < 100)
			answer = true;
		return answer;
	}
	/**
	 * Gets the name of the Management Company
	 * @return The Management Company's name
	 */
	public String getName()
	{
		return companyName;
	}
	/**
	 * Gets the Management Company's tax ID
	 * @return The Management Company's tax ID
	 */
	public String getTaxID()
	{
		return taxID;
	}
	/**
	 * Gets the Properties the Management Company has
	 * @return The Management Company's array of Properties
	 */
	public Property[] getProperties()
	{
		return properties;
	}
	/**
	 * Gets the Management Company's fee
	 * @return The Management Companies fee percentage
	 */
	public double getMgmFeePer()
	{
		return feePercentage;
	}
	/**
	 * Gets the Management Company's Plot
	 * @return The Management Companies Plot
	 */
	public Plot getPlot()
	{
		return plot;
	}
	/**
	 * Lists out the values of all the Management Companies Properties
	 */
	@Override
	public String toString()
	{
		int index = numberOfProperties;
		String answer = "List of properties for " + companyName + ", tax ID: " + taxID;
		for(int i = 0; i < index; i++)
		{
			answer += "\nProperty Name: " + properties[i].getPropertyName() + "\n Located in " + properties[i].getCity() +
					  "\n Belonging to: " + properties[i].getOwner() + "\n Rent Amount : " + properties[i].getRentAmount();
		}
		return answer;
	}
}
