/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: This class creates a plot of land with a width and depth starting from an x and y coordinate.
 * Due: 07/17/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Anner Arevalo
*/

public class Plot
{
	private int x;
	private int y;
	private int width;
	private int depth;
	/**
	 * Constructs a plot with no x or y values, and a width and depth of 1
	 */
	Plot()
	{
		width = 1;
		depth = 1;
	}
	/**
	 * Constructs a plot with an x value, y value, width, and depth
	 * @param plotX: The x coordinate of the plot
	 * @param ploty: The y coordinate of the plot
	 * @param plotWidth: The width of the plot
	 * @param plotDepth: The depth of the plot 
	 */
	Plot(int plotX, int plotY, int plotWidth, int plotDepth)
	{
		x = plotX;
		y = plotY;
		width = plotWidth;
		depth = plotDepth;
	}
	/**
	 * Constructs a copy of another plot
	 * @param otherPlot: The Plot to be copied
	 */
	Plot(Plot otherPlot)
	{
		x = otherPlot.getX();
		y = otherPlot.getY();
		width = otherPlot.getWidth();
		depth = otherPlot.getDepth();
	}
	/**
	 * Determines if a plot is encompassed by another plot
	 * @param otherPlot: The plot that is possibly being encompassed
	 * @return true if the other Plot is encompassed, false if the other Plot is not encompassed
	 */
	public boolean encompasses(Plot otherPlot)
	{
		boolean answer = false;
		int otherX = otherPlot.getX();
		int otherY = otherPlot.getY();
		int otherWidth = otherPlot.getWidth();
		int otherDepth = otherPlot.getDepth();
		if(otherX >= x && (otherX + otherWidth) <= (x + width))
		{
			if(otherY <= y && (otherY - otherDepth) >= (y - depth))
			{
				answer = true;
			}
		}
		return answer;
	}
	/**
	 * Determines if two Plots are overlapping
	 * @param otherPlot: The Plot that might be overlapping
	 * @return true if the two Plots overlap, false if they don't overlap
	 */
	public boolean overlaps(Plot otherPlot)
	{
		int otherX = otherPlot.getX();
		int otherY = otherPlot.getY();
		int otherWidth = otherPlot.getWidth();
		int otherDepth = otherPlot.getDepth();
		boolean answer = false;
		// case 1
		if((otherX + otherWidth < x) && (otherX + otherWidth < x+width))
		{
			if((otherY - otherDepth < y) && (otherY - otherDepth > y - depth))
			{
				answer = true;
			}
		}
		// case 2
		else if((otherX > x) && (otherX < x + width))
		{
			if((otherY - otherDepth < y) && (otherY - otherDepth > y - depth))
			{
				answer = true;
			}
		}
		// case 3
		else if((otherX > x) && (otherX < x + width))
		{
			if((otherY - otherDepth < y) && (otherY - otherDepth > y - depth))
			{
				answer = true;
			}
		}
		// case 4
		else if((otherX > x) && (otherX < x + width))
		{
			if((otherY < y) && (otherY > y - depth))
			{
				answer= true;
			}
		}
		// case 5
		else if((otherX > x) && (otherX < x + width))
		{
			if((otherY < y) && (otherY > y - depth))
			{
				answer = true;
			}
		}
		// case 6
		else if((otherX > x) && (otherX < x + width))
		{
			if((otherY < y) && (otherY > y - depth))
			{
				answer = true;
			}
		}
		// case 7
		else if((otherX + otherWidth > x) && (otherX + otherWidth < x + width))
		{
			if((otherY < y) && (otherY > y - depth))
			{
				answer = true;
			}
		}
		// case 8
		else if((otherX + otherWidth < x) && (otherX + otherWidth < x + width))
		{
			if((otherY < y) && (otherY > y - depth))
			{
				answer = true;
			}
		}
		return answer;
	}
	/**
	 * Gets the width of this Plot
	 * @return The width of this Plot
	 */
	public int getWidth()
	{
		return width;
	}
	/**
	 * Gets the depth of this Plot
	 * @return The depth of this Plot
	 */
	public int getDepth()
	{
		return depth;
	}
	/**
	 * Gets the x coordinate of this Plot
	 * @return The x coordinate of this Plot
	 */
	public int getX()
	{
		return x;
	}
	/**
	 * Gets the y coordinate of this Plot
	 * @return The y coordinate of this Plot
	 */
	public int getY()
	{
		return y;
	}
	/**
	 * Changes the x coordinate of the Plot
	 * @param newX: The new x coordinate
	 */
	public void setX(int newX)
	{
		x = newX;
	}
	/**
	 * Changes the y coordinate of the Plot
	 * @param newY: The new y coordinate
	 */
	public void setY(int newY)
	{
		y = newY;
	}
	/**
	 * Changes the width of the Plot
	 * @param newWidth: The new width
	 */
	public void setWidth(int newWidth)
	{
		width = newWidth;
	}
	/**
	 * Changes the depth of the Plot
	 * @param newDepth: The new depth
	 */
	public void setDepth(int newDepth)
	{
		depth = newDepth;
	}
	/**
	 * Returns the values of the Plot
	 * @return The x and y coordinates as well as the width and depth of the Plot
	 */
	@Override
	public String toString()
	{
		return x + "," + y + "," + width + "," + depth;
	}
}