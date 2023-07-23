import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent
{
	File file;
	double[][]arr;
	double[] bonus = {5000,5000,5000,6000};
	@BeforeEach
	void setUp() throws Exception
	{
		file = new File("C:\\Users\\Anner\\Downloads\\Assignment5_holidayBonis_st - 05_28_23(2)\\dataSet4.txt");
		arr = TwoDimRaggedArrayUtility.readFile(file);
	}

	@AfterEach
	void tearDown() throws Exception
	{
		file = null;
		arr = null;
	}

	@Test
	void testCalculateHolidayBonus()
	{
		boolean tf = true;
		double[] test  = HolidayBonus.calculateHolidayBonus(arr);
		for(int i = 0; i < bonus.length; i++)
		{
			if(test[i] != bonus[i])
				tf = false;
		}
		assertTrue(tf);
	}

	@Test
	void testCalculateTotalHolidayBonus()
	{
		assertEquals(HolidayBonus.calculateTotalHolidayBonus(arr), 21000);
	}

}
