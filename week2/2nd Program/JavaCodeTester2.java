/** Application Purpose: The application's purpose is to complete Challenge 2 and 3 and output the results. Some of the things which are done are setting up variables, combining strings, if statements, setting up boolean values.
*   Author: Alex Dorodko
*   Date: 22/SEP/2020
*   Time: 10:45 PM
*/

public class JavaCodeTester2 
{
	public static void main (String [] args)
	{	
		//Challenge 2
		
		//Setting up the three strings which will then be combined.
		String text1 = "cool";
		String text2 = "story";
		String text3 = "man";
		
		//Combining and outputting the three Strings.
		String jointText = text1 + text2 + text3;
		System.out.println("The 3rd character of " + jointText + " is " + jointText.charAt(2) + ". The 5th character is " + jointText.charAt(4) + ". The 7th character is " + jointText.charAt(6) + ".");

		//Setting up a boolean value, to mean false since the 1st word of the jointTxt is not "test", then outputting the result.
		boolean text = false;
		System.out.println(text);
		
		//Displaying the joint string from step 2 to be all uppercase.
		System.out.println(jointText.toUpperCase());
		
		//Setting up an integer varibale, then outputting it with the increments.
		int integer =  1;
		System.out.println(++integer);
		System.out.println(integer++);

		//Challenge 3

		//Storing an integer value

		int integer2 = 7;
		
		//Setting up the condition, where I use modulus to determine if a number is even or odd.
		if (integer2%2 == 0)
		{
			System.out.println("The number is " + integer2 + ", therefore it is even.");
		}
		else
		{
			System.out.println("The number is " + integer2 + ", therefore it is odd.");
		}
	}

}