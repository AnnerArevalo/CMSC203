/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Due: 07/11/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. 
 *  I have not copied the code from a student or any source. 
 *  I have not given my code to any student.
 *  Print your Name here: Anner Arevalo
*/

/**
 * Description:
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager 
{
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) 
	{
		boolean answer = true;
		for(int i = 0; i < plainText.length(); i++)
		{
			if(plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE)
			{
				answer = false;
			}
		}
		return answer;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key)
	{
		String answer = "";
		int num = key;
		int newNum;
		char newChar;
		if(isStringInBounds(plainText) == false)
			answer = "The selected string is not in bounds, Try again.";
		else
		{
			for(int i = 0; i < plainText.length(); i++)
			{
				newNum = plainText.charAt(i)+num;
				while(newNum > UPPER_RANGE)
				{
					newNum -= RANGE;
				}
				newChar = (char)newNum;
				answer += newChar;
			}
		}
		return answer;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr)
	{
		String answer = "";
		int bellasoIndex = 0;
		int newNum;
		char newChar;
		for(int i = 0; i < plainText.length(); i++)
		{
			if(bellasoIndex > bellasoStr.length()-1)
			{
				bellasoIndex = 0;
			}
			newNum = plainText.charAt(i)+bellasoStr.charAt(bellasoIndex);
			while(newNum > UPPER_RANGE)
			{
				newNum -= RANGE;
			}
			newChar = (char)newNum;
			answer += newChar;
			bellasoIndex++;
		}
		return answer;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	// works but fails test
	/*public static String caesarDecryption (String encryptedText, int key)
	{
		String answer = "";
		int num;
		int newNum;
		char newChar;
		for(int i = 0; i < encryptedText.length(); i++)
		{
			num = encryptedText.charAt(i);
			newNum = num - key;
			newChar = (char)newNum;
			answer += newChar;
		}
		return answer;
	}
	*/
	public static String caesarDecryption (String encryptedText, int key)
	{
		String answer = "";
		int num;
		int newNum;
		char newChar;
		for(int i = 0; i < encryptedText.length(); i++)
		{
			num = encryptedText.charAt(i);
			newNum = num - key;
			while(newNum < LOWER_RANGE)
			{
				newNum += RANGE;
			}
			newChar = (char)newNum;
			answer += newChar;
		}
		return answer;
	}
	/**
	 * Decrypts a string according the Bellaso Cipher. Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	
	public static String bellasoDecryption(String encryptedText, String bellasoStr) 
	{
		String answer = "";
		int newNum;
		char newChar;
		int bellasoIndex = 0;
		for(int i = 0; i < encryptedText.length(); i++)
		{
			if(bellasoIndex > bellasoStr.length()-1)
			{
				bellasoIndex = 0;
			}
			newNum = encryptedText.charAt(i);
			newNum -= bellasoStr.charAt(bellasoIndex);
			while(newNum < LOWER_RANGE)
			{
				newNum += RANGE;
			}
			newChar = (char)newNum;
			answer += newChar;
			bellasoIndex++;
		}
		return answer;
		
	}
}