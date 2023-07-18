import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent
{
	Property defaultProperty;
	Property prop;
	Plot defaultPlot;
	Plot plot;
	@BeforeEach
	void setUp() throws Exception
	{
		defaultProperty = new Property();
		prop = new Property("Town Square", "Rockville", 1200.0, "Anner", 4,4,2,2);
		defaultPlot = new Plot(0,0,1,1);
		plot = new Plot(4,4,2,2);
	}

	@AfterEach
	void tearDown() throws Exception
	{
		defaultProperty = null;
		prop = null;
		defaultPlot = null;
		plot = null;
	}

	@Test
	void testGetPlot()
	{
		assertEquals(defaultProperty.getPlot().toString(), defaultPlot.toString());
		assertEquals(prop.getPlot().toString(), plot.toString());
	}

	@Test
	void testGetCity()
	{
		assertEquals(defaultProperty.getCity(), "");
		assertEquals(prop.getCity(), "Rockville");
	}

	@Test
	void testGetOwner()
	{
		assertEquals(defaultProperty.getOwner(), "");
		assertEquals(prop.getOwner(), "Anner");
	}

	@Test
	void testGetPropertyName()
	{
		assertEquals(defaultProperty.getPropertyName(), "");
		assertEquals(prop.getPropertyName(), "Town Square");
	}

	@Test
	void testGetRentAmount()
	{
		assertEquals(defaultProperty.getRentAmount(), 0.0);
		assertEquals(prop.getRentAmount(), 1200.0);
	}

	@Test
	void testToString()
	{
		assertEquals(defaultProperty.toString(), ",,,0.0");
		assertEquals(prop.toString(), "Town Square,Rockville,Anner,1200.0");
	}
}
