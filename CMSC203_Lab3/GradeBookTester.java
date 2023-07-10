import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester
{
	private GradeBook first;
	private GradeBook second;
	@BeforeEach
	void setUp() throws Exception 
	{
		first = new GradeBook(5);
		second = new GradeBook(5);
		first.addScore(11.0);
		first.addScore(5.0);
		second.addScore(2.5);
		second.addScore(4.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		first = null;
		second = null;
	}

	@Test
	void testAddScore() 
	{
		assertEquals(first.toString(), "11.0 5.0 ");
		assertEquals(second.toString(), "2.5 4.0 ");
	}

	@Test
	void testSum()
	{
		assertEquals(first.sum(), 16.0);
		assertEquals(second.sum(), 6.5);
	}

	@Test
	void testMinimum()
	{
		assertEquals(first.minimum(), 5.0);
		assertEquals(second.minimum(), 2.5);
	}

	@Test
	void testFinalScore()
	{
		assertEquals(first.finalScore(), 11.0);
		assertEquals(second.finalScore(), 4.0);
	}

	@Test
	void testGetScoreSize()
	{
		assertEquals(first.getScoreSize(), 2);
		assertEquals(second.getScoreSize(), 2);
	}
}
