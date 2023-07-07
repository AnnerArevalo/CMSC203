/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: A class based off of the CryptoManagerTestPublic class that tests the each of the methods 
 * 				in the CryptoManager class
 * Due: 07/11/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. 
 *  I have not copied the code from a student or any source. 
 *  I have not given my code to any student.
 *  Print your Name here: Anner Arevalo
*/

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerTestStudent {
	CryptoManager cryptoManager;

	@BeforeEach
	public void setUp() throws Exception
	{
		cryptoManager = new CryptoManager();
	}

	@AfterEach
	public void tearDown() throws Exception
	{
		cryptoManager = null;
	}

	@Test
	public void testStringInBounds()
	{
		assertTrue(CryptoManager.isStringInBounds("ANNER"));
		assertFalse(CryptoManager.isStringInBounds("anner"));
	}

	@Test
	public void testEncryptCaesar()
	{
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("HeLlO", 3));
		assertEquals("PQR", CryptoManager.caesarEncryption("ABC", 15));
	}

	@Test
	public void testDecryptCaesar()
	{
		assertEquals("BCD", CryptoManager.caesarDecryption("PQR", 14));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("OT[PQ", CryptoManager.bellasoEncryption("HELLO", "GOODBYE"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("HELLO", CryptoManager.bellasoDecryption("OT[PQ", "GOODBYE"));

	}

}
