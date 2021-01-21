/** Application Purpose: 
*   Author: Alex Dorodko
*   Date: 30/SEP/2020
*   Time: 12:17 PM
*/

//This is so that we can import the object into the test harness later
package testpackage;

//Declairing the class
public class ChequingAccount
{
	//Setting up the instance variables
	private String first;
	private String last;
	private double balance;
	private double accNumber;

	
	//Making the constructor with all of the instance variables
	public ChequingAccount(String first, String last, double balance, double accNumber)
    	{
        	this.first = first;
        	this.last = last;
        	this.balance = balance;
        	this.accNumber = accNumber;
    	}

   	 //Setting the setters for each of the 4 instance variables.
    	public void setFirst(String first)
    	{
        	this.first = first;
    	}
    
    	public void setLast(String last)
    	{
        	this.last = last;
    	}

    	public void setBalance(double balance)
    	{
        	this.balance = balance;
    	}

    	public void setAccNumber(double accNumber)
    	{
        	this.accNumber = accNumber;
    	}

    	//Setting the getters for each of the 4 instance variables.
    	public String getFirst()
    	{
        	return first;
    	}

    	public String getLast()
    	{
        	return last;
    	}

    	public double getBalance()
    	{
        	return balance;
    	}

   	public double getAccNumber()
    	{
        	return accNumber;
    	}
}   
