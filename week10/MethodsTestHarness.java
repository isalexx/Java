/** Application Purpose: This file is a test harness to test out both methods.
*   Author: Alex Dorodko
*   Date: 28/NOV/2020 
*   Time: 03:00 PM
*/

public class MethodsTestHarness 
{
    //The first method which outputs the words from a joint string.
    public static void main(String[] args) 
    {
        //Printing out the first method.
        System.out.println("The words of method one are:\n");
        System.out.println(SuperString.MethodOne());

        System.out.println("The substrings of method two are:\n");
        SuperString.MethodTwo("GFDSGDSFGSVBNGFHG", 3, 'G');
    }   
}
