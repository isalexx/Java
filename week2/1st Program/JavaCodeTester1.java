/**	Application Purpose: The purpose of this program is to output each of the variables created here onto the users screen. 
*	Author: Alex Dorodko
*	Date: 22/SEP/2020
*	\\Time: 02:48 PM
*/

//Declairing the class
public class JavaCodeTester1
{	
	//Declairing the main method.
	public static void main (String [] args)
	{	
		//Setting up the boolean variable.
		boolean trueFalse = true;
		
		//Setting up a char variable.
		char character = 'a';
		
		//Setting up two variables, to then combine them together during output.
		String mainWord = "col";
		String secondaryWord = "lege";
		
		//Setting up an integer value.
		int integer = 1;

		//Setting up a double variable with an appropriate name.
		double doubleNumber = 23.21;
		
		//Outputting all of the variables, according to the assignment instructions. 
		System.out.println(trueFalse);
		System.out.println(character);
		System.out.println(mainWord+secondaryWord);
		System.out.println(integer);
		System.out.println(doubleNumber);
	}
}
