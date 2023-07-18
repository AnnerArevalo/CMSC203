/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This class creates a property from a plot of land with an owner, an address, a name, and rent to be paid.
 * Due: 07/17/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Anner Arevalo
*/
public class Property
{
	private String propertyName;
	private String city;
	private double rent;
	private String owner;
	private Plot plot;
	/**
	 * Constructs a Property with no parameters and default values
	 */
	Property()
	{
		propertyName= "";
		city = "";
		owner = "";
		plot = new Plot();
	}
	/**
	 * Constructs a Property with a given name, city, rent amount, owner, and default Plot
	 * @param propName: The name of the Property
	 * @param cityName: The city the Property is in
	 * @param rentAmount: The amount of rent for the Property
	 * @param ownerName: The name of the Property's owner
	 */
	Property(String propName, String cityName, double rentAmount, String ownerName)
	{
		propertyName = propName;
		city = cityName;
		rent = rentAmount;
		owner = ownerName;
		plot = new Plot();
	}
	/**
     * Constructs a Property with a given name, city, rent amount, owner, and a plot with the given x, y, width, and depth values
	 * @param propName: The name of the Property
	 * @param cityName: The city the Property is in
	 * @param rentAmount: The amount of rent for the Property
	 * @param ownerName: The name of the Property's owner
	 * @param x: The x coordinate of the Property's Plot
	 * @param y: The y coordinate of the Property's Plot
	 * @param width: The width coordinate of the Property's Plot
	 * @param depth: The depth coordinate of the Property's Plot
	 */
	Property(String propName, String cityName, double rentAmount, String ownerName, int x,int y, int width, int depth)
	{
		propertyName = propName;
		city = cityName;
		rent = rentAmount;
		owner = ownerName;
		plot = new Plot(x,y,width,depth);
	}
	/**
	 * Constructs a copy of a Property
	 * @param otherProp: The Property being copied
	 */
	Property(Property otherProp)
	{
		propertyName = otherProp.getPropertyName();
		city = otherProp.getCity();
		rent = otherProp.getRentAmount();
		owner = otherProp.getOwner();
		plot = otherProp.getPlot();
	}
	/**
	 * Returns the Plot of a Property
	 * @return The Property's Plot
	 */
	public Plot getPlot()
	{
		return plot;
	}
	/**
	 * Returns the city of a Property
	 * @return The Property's city
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * Returns the owner of a Property
	 * @return The Property's owner
	 */
	public String getOwner()
	{
		return owner;
	}
	/**
	 * Returns the name of a Property
	 * @return The Property's name
	 */
	public String getPropertyName()
	{
		return propertyName;
	}
	/**
	 * Returns the rent amount of a Property
	 * @return The Property's rent
	 */
	public double getRentAmount()
	{
		return rent;
	}
	/**
	 * Returns the values of the Property
	 * @return The Property's values
	 */
	@Override
	public String toString()
	{
		return propertyName + "," + city + "," + owner + "," + rent;
	}
}