/** Application Purpose: This is the test harness for RealEstateTransaction class which displays 3 methods.
*   Author: Alex Dorodko
*   Date: 19/NOV/2020 
*   Time: 02:58 PM
*/

//Importing the scanner.
import java.util.Scanner;


public class RealEstateTransactionTestHarness 
{
    public static void main(String[] args) 
    {
        //Initiating the classes.
        Scanner sc = new Scanner(System.in);
        RealEstateTransaction obj1 = new RealEstateTransaction("ABCDE", "FGHIJ", "KLMNOP", "QRSTU");

        //Showing off the first method.
        System.out.println("\nThe first method: " + obj1.LowerAndUpper());

        //Showing off the second method.
        System.out.println("\nThe second method: " + obj1.LowerAndUpperV2());

        //Asking for the key character.
        System.out.println("\nEnter the key character: ");
        int keyCharacter = sc.nextInt();

        //Asking for the index value.
        System.out.println("Enter the index value: ");
        int indexValue = sc.nextInt();

        //Outputting 3rd method.
        System.out.println("\nThe third method: " + obj1.encryption(keyCharacter, indexValue));

    }
}