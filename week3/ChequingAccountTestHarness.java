
/** Application Purpose: 
*   Author: Alex Dorodko
*   Date: 30/SEP/2020
*   Time: 11:28 PM
*/

//Challenge 2

//Declairing the class
public class ChequingAccountTestHarness 
{
    	//Adding the main method.
	public static void main(String[] args) 
    	{   
        	//Instigating the object and passing in the four arguments
        	ChequingAccount customer1 = new ChequingAccount("Alex", "Keller", 999, 88004584);

       	 //Outputting the state elements with the appropriate labels.
        	System.out.println("\nCustomer Information:\n\nFirst Name: " + customer1.getFirst() + "\nLast Name: " + customer1.getLast() + "\nAccount Balance: " + customer1.getBalance() + "\nAccount Number: " + Math.round(customer1.getAccNumber()) + "\n");
	        
        	//Challenge 3

        	//Setting up the new 1st and last name
        	customer1.setFirst("Cole");
        	customer1.setLast("Phelps");

        	//Outputting the new information
        	System.out.println("\nUpdated Customer Information:\n\nFirst Name: " + customer1.getFirst() + "\nLast Name: " + customer1.getLast() + "\nAccount Balance: " + customer1.getBalance() + "\nAccount Number: " + Math.round(customer1.getAccNumber()) + "\n");
    	}
}

