import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent
{
	Plot plot;
	Plot encompass;
	Plot overlap;
	@BeforeEach
	void setUp() throws Exception
	{
		plot = new Plot(4,4,2,2);
		encompass = new Plot(0,0,10,10);
		overlap = new Plot(3,3,4,4);
	}

	@AfterEach
	void tearDown() throws Exception
	{
		plot = null;
		encompass = null;
		overlap = null;
	}

	@Test
	void testEncompasses()
	{
		assertTrue(encompass.encompasses(plot));
	}

	@Test
	void testOverlaps()
	{
		assertTrue(overlap.overlaps(plot));
		assertFalse(plot.overlaps(encompass));
	}

	@Test
	void testGetWidth()
	{
		assertEquals(plot.getWidth(), 2);
	}

	@Test
	void testGetDepth()
	{
		assertEquals(plot.getDepth(), 2);
	}

	@Test
	void testGetX()
	{
		assertEquals(plot.getX(), 4);
	}

	@Test
	void testGetY()
	{
		assertEquals(plot.getY(), 4);
	}

	@Test
	void testToString()
	{
		assertEquals(plot.toString(), "4,4,2,2");
	}
}
