import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;

class TwoDimRaggedArrayUtilityTestStudent
{
	File file;
	double[][] arr = {{0.0, -0.5, 20.0},{5.0},{6.5,2.0}};
	double[][] dataSet4 = {{-2.5, -5.3, 6.1}, {-4.4, 8.2}, {2.3, -7.5}, {-4.2, 7.3, -5.9, 2.6}};
	@BeforeEach
	void setUp() throws Exception
	{
		file = new File("C:\\Users\\Anner\\Downloads\\Assignment5_holidayBonis_st - 05_28_23(2)\\dataSet4.txt");
	}

	@AfterEach
	void tearDown() throws Exception
	{
		arr  = null;
		file = null;
		dataSet4 = null;
	}

	@Test
	void testGetAverage()
	{
		assertEquals(TwoDimRaggedArrayUtility.getAverage(arr), 5.5);
	}

	@Test
	void testGetColumnTotal()
	{
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(arr,0), 11.5);
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(arr,1), 1.5);
		assertEquals(TwoDimRaggedArrayUtility.getColumnTotal(arr,2), 20.0);
	}

	@Test
	void testGetHighestInArray()
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInArray(arr), 20.0);
	}

	@Test
	void testGetHighestInColumn()
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(arr, 0), 6.5);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(arr, 1), 2.0);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumn(arr, 2), 20.0);
	}

	@Test
	void testGetHighestInColumnIndex()
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(arr, 0), 2);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(arr, 1), 2);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInColumnIndex(arr, 2), 0);
	}

	@Test
	void testGetHighestInRow()
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(arr, 0), 20.0);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(arr, 1), 5.0);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRow(arr, 2), 6.5);
	}

	@Test
	void testGetHighestInRowIndex()
	{
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(arr, 0), 2);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(arr, 1), 0);
		assertEquals(TwoDimRaggedArrayUtility.getHighestInRowIndex(arr, 2), 0);
	}

	@Test
	void testGetLowestInArray()
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInArray(arr), -.5);
	}

	@Test
	void testGetLowestInColumn()
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(arr, 0), 0.0);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(arr, 1), 2.0);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumn(arr, 2), 20.0);
	}

	@Test
	void testGetLowestInColumnIndex()
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(arr, 0), 0);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(arr, 1), 2);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInColumnIndex(arr, 2), 0);
	}

	@Test
	void testGetLowestInRow()
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(arr, 0), -.5);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(arr, 1), 5.0);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRow(arr, 2), 2.0);
	}

	@Test
	void testGetLowestInRowIndex()
	{
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(arr, 0), 1);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(arr, 1), 0);
		assertEquals(TwoDimRaggedArrayUtility.getLowestInRowIndex(arr, 2), 1);
	}

	@Test
	void testGetRowTotal()
	{
		assertEquals(TwoDimRaggedArrayUtility.getRowTotal(arr, 0), 19.5);
		assertEquals(TwoDimRaggedArrayUtility.getRowTotal(arr, 1), 5.0);
		assertEquals(TwoDimRaggedArrayUtility.getRowTotal(arr, 2), 8.5);
	}

	@Test
	void testGetTotal()
	{
		assertEquals(TwoDimRaggedArrayUtility.getTotal(arr), 33.0);
	}

	@Test
	void testReadFile() throws FileNotFoundException
	{
		boolean tf = true;
		double[][] test = TwoDimRaggedArrayUtility.readFile(file);
		for(int i = 0; i < dataSet4.length; i++)
		{
			for(int j = 0; j < dataSet4[i].length; j++)
			{
				if(test[i][j] != dataSet4[i][j])
					tf = false;
			}
		}
		assertTrue(tf);
	}

	@Test
	void testWriteToFile() throws FileNotFoundException
	{
		boolean tf = true;
		File file = new File("test.txt");
		TwoDimRaggedArrayUtility.writeToFile(arr, file);
		double[][] test = TwoDimRaggedArrayUtility.readFile(file);
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(test[i][j] != arr[i][j])
					tf = false;
			}
		}
		assertTrue(tf);
	}
}
