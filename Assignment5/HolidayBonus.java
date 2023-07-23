import java.io.File;
import java.io.FileNotFoundException;
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This class uses the TwoDimRaggedArrayUtility class to calculate store bonuses for the district
 * Due: 7/24/23
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Anner Arevalo
*/
public class HolidayBonus
{
	private static final int MAX = 5000;
	private static final int MIN = 1000;
	private static final int OTHER = 2000;
	/**
	 * This method calculates the bonuses given to every store in the district based on their sales
	 * @param arr: The stores in the district and their sales
	 * @return The bonus amount given to each store in the district as an array of doubles
	 */
	public static double[] calculateHolidayBonus(double[][] arr)
	{
		double[] bonuses;
		int numOfBonuses = arr.length;
		int numOfColumns = 0;
		int i;
		int j;
		int maxIndex;
		int minIndex;
		bonuses = new double[numOfBonuses];
		// getting the highest number of columns
		for(i = 0; i < arr.length; i++)
		{
			if(arr[i].length > numOfColumns)
				numOfColumns = arr[i].length;
		}
		for(int k = 0; k < numOfColumns; k++)
		{
			maxIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(arr, k);
			if(TwoDimRaggedArrayUtility.getHighestInColumn(arr, k) > 0)
				bonuses[maxIndex] += MAX;
			minIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(arr, k);
			if(TwoDimRaggedArrayUtility.getLowestInColumn(arr, k) > 0)
				if(TwoDimRaggedArrayUtility.getLowestInColumn(arr, k) != TwoDimRaggedArrayUtility.getHighestInColumn(arr, k))
					bonuses[minIndex] += MIN;
			for(j = 0; j < arr.length; j++)
			{
				if(k < arr[j].length)
				{	
					if(j != maxIndex && j != minIndex)
					{
						if(arr[j][k] > 0)
						{
							bonuses[j] += OTHER;
						}
					}
				}
			}
		}
		return bonuses;
	}
	/**
	 * This method gets the total bonuses of all the stores in a district
	 * @param arr: The array of the stores and their sales in the district
	 * @return The total amount of bonuses given to the stores in the district
	 */
	public static double calculateTotalHolidayBonus(double[][] arr)
	{
		double total = 0.0;
		double[] bonusArray = calculateHolidayBonus(arr);
		for(int i = 0; i < bonusArray.length; i++)
		{
			total += bonusArray[i];
		}
		return total;
	}
}
