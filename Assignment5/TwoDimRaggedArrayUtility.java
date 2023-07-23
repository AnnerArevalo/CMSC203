import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This class uses files and 2D ragged arrays to get information on store sales in the district
 * Due: 7/24/23
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Anner Arevalo
*/
public final class TwoDimRaggedArrayUtility
{	
	/**
	 * This method gets the average of all the values in a 2D array
	 * @param data: This is the 2D array
	 * @return The average value of all the numbers in the array
	 */
	public static double getAverage(double[][] data)
	{
		double count = 0.0;
		double average = 0.0;
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				average += data[i][j];
				count++;
			}
		}
		average /= count;
		return average;
	}
	/**
	 * This method gets the total value of a specified column in a 2D array
	 * @param arr: The 2D array
	 * @param column: The specified column being looked at
	 * @return The sum of the values in the specified column
	 */
	public static double getColumnTotal(double[][] arr, int column)
	{
		double answer = 0.0;
		for(int i = 0; i < arr.length; i++)
		{
			if(column < arr[i].length)
				answer += arr[i][column];
		}
		return answer;
	}
	/**
	 * This method gets the highest value in the 2D array
	 * @param arr: The 2D array being looked at
	 * @return The largest value in the 2D array
	 */
	public static double getHighestInArray(double[][] arr)
	{
		double max = arr[0][0];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] >= max)
					max = arr[i][j];
			}
		}
		return max;
	}
	/**
	 * This method gets the highest value in a specified column of a 2D array
	 * @param arr: The 2D array being looked at
	 * @param column: The column being checked
	 * @return The largest value of the specified column
	 */
	public static double getHighestInColumn(double[][] arr, int column)
	{
		//
		int rowWithMostColumns = 0;
		int numOfColumns = 0;
		for(int z = 0; z < arr.length; z++)
		{
			if(arr[z].length > numOfColumns)
			{
				rowWithMostColumns = z;
				numOfColumns = arr[z].length;
			}
		}
		//
		double max = arr[rowWithMostColumns][column];
		for(int i = 0; i < arr.length; i++)
		{
			if(column < arr[i].length)
			{
				if(arr[i][column] >= max)
				max = arr[i][column];
			}
		}
		return max;
	}
	/**
	 * This method gets the index of the highest value in a specified column of a 2D array
	 * @param arr: The 2D array
	 * @param column: The column being looked at
	 * @return The index of the largest value in the specified column
	 */
	public static int getHighestInColumnIndex(double[][] arr, int column)
	{
		//
		int rowWithMostColumns = 0;
		int numOfColumns = 0;
		for(int z = 0; z < arr.length; z++)
		{
			if(arr[z].length > numOfColumns)
			{
				rowWithMostColumns = z;
				numOfColumns = arr[z].length;
			}
		}
		//
		double max = arr[rowWithMostColumns][column];
		int index = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(column < arr[i].length)
			{
				if(arr[i][column] >= max)
				{
					max = arr[i][column];
					index = i;
				}
			}
		}
		return index;
	}
	/**
	 * This method gets the biggest value of a specified row in a 2D array
	 * @param arr: The 2D array being checked
	 * @param row: The specified row
	 * @return The largest value in the specified row
	 */
	public static double getHighestInRow(double[][] arr, int row)
	{
		double max = arr[row][0];
		for(int i = 0; i < arr[row].length; i++)
		{
			if(arr[row][i] >= max)
				max = arr[row][i];
		}
		return max;
	}
	/**
	 * This method gets the index of the largest value in a specified row of a 2D array
	 * @param arr: The 2D array being looked at
	 * @param row: The specified row
	 * @return The index of the Highest value in the specified row
	 */
	public static int getHighestInRowIndex(double[][] arr, int row)
	{
		double max = arr[row][0];
		int index = 0;
		for(int i = 0; i < arr[row].length; i++)
		{
			if(arr[row][i] >= max)
			{
				max = arr[row][i];
				index = i;
			}
		}
		return index;
	}
	/**
	 * This method returns the lowest value in a 2D array
	 * @param arr: The 2D array being checked
	 * @return The smallest value in the 2D array
	 */
	public static double getLowestInArray(double[][] arr)
	{
		double min = arr[0][0];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] <= min)
					min = arr[i][j];
			}
		}
		return min;
	}
	/**
	 * This method returns the lowest value of a specified column in a 2D array
	 * (that is equal to or above zero to avoid calculation errors in the HolidayBonus class)
	 * @param arr: The 2D array being looked at
	 * @param column: The specified column
	 * @return The smallest value in the specified column
	 */
	public static double getLowestInColumn(double[][] arr, int column)
	{
		int rowWithTheHighestColumn = getHighestInColumnIndex(arr, column);
		double min = arr[rowWithTheHighestColumn][column];
		for(int i = 0; i < arr.length; i++)
		{
			if(column < arr[i].length)
			{
				if(arr[i][column] <= min && arr[i][column] >= 0)
					min = arr[i][column];
			}
		}
		return min;
	}
	/**
	 * This method gets the index of the smallest value in a specified column of a 2D array
	 * (that is equal to or above zero to avoid calculation errors in the HolidayBonus class)
	 * @param arr: The 2D array being looked at
	 * @param column: The specified column
	 * @return The index of the lowest value in the specified column of the 2D array
	 */
	public static int getLowestInColumnIndex(double[][] arr, int column)
	{
		int rowWithTheHighestColumn = getHighestInColumnIndex(arr, column);
		double min = arr[rowWithTheHighestColumn][column];
		int index = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(column < arr[i].length)
			{
				if(arr[i][column] <= min && arr[i][column] >= 0)
				{
					min = arr[i][column];
					index = i;
				}
			}
		}
		return index;
	}
	/**
	 * This method gets the lowest value in a specified row of a 2D array
	 * @param arr: The 2D array being looked at
	 * @param row: The specified row
	 * @return The smallest value in the specified row of the 2D array
	 */
	public static double getLowestInRow(double[][] arr, int row)
	{
		double min = arr[row][0];
		for(int i = 0; i < arr[row].length; i++)
		{
			if(arr[row][i] <= min)
				min = arr[row][i];
		}
		return min;
	}
	/**
	 * This method gets the index of the lowest value in a specified row of a 2D array
	 * @param arr: The 2D array
	 * @param row: The specified row
	 * @return The index of the smallest value in the specified row of the 2D array
	 */
	public static int getLowestInRowIndex(double[][] arr, int row)
	{
		double min = arr[row][0];
		int index = 0;
		for(int i = 0; i < arr[row].length; i++)
		{
			if(arr[row][i] <= min)
			{
				min = arr[row][i];
				index = i;
			}
		}
		return index;
	}
	/**
	 * This method gets the total of all the values in a specified row of a 2D array
	 * @param arr: The 2D array being checked
	 * @param row: The specified row
	 * @return The total of the values in the specified row of the 2D array
	 */
	public static double getRowTotal(double[][] arr, int row)
	{
		double sum = 0.0;
		for(int i = 0; i < arr[row].length; i++)
		{
			sum += arr[row][i];
		}
		return sum;
	}
	/**
	 * This method gets the total of all the values in a 2D array
	 * @param arr: The 2D array being checked
	 * @return The total of all the values in the 2D array
	 */
	public static double getTotal(double[][] arr)
	{
		double sum = 0.0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				sum += arr[i][j];
			}
		}
		return sum;
	}
	/**
	 * This method reads values from a file and puts them into a 2D array
	 * @param file: The file being read
	 * @return The values of the file as a 2D array
	 * @throws FileNotFoundException
	 */
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		int row = 0;
		int column = 1;
		String line = "";
		String num = "";
		double number = 0;
		int length;
		Scanner input = new Scanner(file);
		while(input.hasNext())
		{
			input.nextLine();
			row++;
		}
		input.close();
		Scanner input2 = new Scanner(file);
		double[][] arr = new double[row][];
		for(int i = 0; i < row; i++)
		{
			line = input2.nextLine();
			length = line.length();
			for(int j = 0; j < length; j++)
			{
				if(line.charAt(j) == ' ')
				{
					column++;
				}	
			}
			arr[i] = new double[column];
			column = 1;
		}
		input2.close();
		Scanner input3 = new Scanner(file);
		for(int k = 0; k < row; k++)
		{
			column = 0;
			line = input3.nextLine();
			length = line.length();
			for(int l = 0; l < length; l++)
			{
				if(line.charAt(l) != ' ')
				{
					num += line.charAt(l);
				}
				else
				{
					number = Double.parseDouble(num);
					arr[k][column] = number;
					column ++;
					num = "";
				}
				if(l == length - 1)
				{
					number = Double.parseDouble(num);
					arr[k][column] = number;
					column ++;
					num = "";
				}
			}
		}
		input3.close();
		return arr;
	}
	/**
	 * This method writes values from a 2D array to a file
	 * @param arr: The 2D array whose values are being written
	 * @param file: The file the values are being written too
	 * @throws FileNotFoundException
	 */
	public static void writeToFile(double[][]arr, File file) throws FileNotFoundException
	{
		PrintWriter input = new PrintWriter(file);
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(j != arr[i].length-1)
					input.print(arr[i][j] + " ");
				else
					input.print(arr[i][j]);
			}
			input.print("\n");
		}
		input.close();
	}
}