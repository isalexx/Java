/** Application Purpose: This is the test harness for the Bank Transaction class with the main method.
*   Author: Alex Dorodko
*   Date: 31/OCT/2020 
*   Time: 09:34 PM
*/


//importing Scanner and Random.
import java.util.Random;
import java.util.Scanner;

//Declaring the class
public class BankTransactionTestHarness 
{
    //This is the main method.
    public static void main(String[] args) 
    {
        //Instigating the scanner and random.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Instigating the BankTransaction constructor, which has 500 records.
        BankTransaction[] mainArray = new BankTransaction[500];

        //This will come later on for the for loop, just declaring it at this time.

        //This will fill all the 500 records with random data, and print it out.
        for (int i = 0; i < 500; i++, BankTransaction.recordNumber++) 
            {
                mainArray[i] = new BankTransaction(random.nextBoolean(), random.nextDouble() * (10000 - 0 + 1), random.nextInt(), random.nextLong());

                System.out.println("\n" + mainArray[i].getCanadianFunds() + "\n" + mainArray[i].getExchangeRate() + "\n" + mainArray[i].getTransactionNumber() + "\n" + mainArray[i].getTranscationReferenceNumber() + "\n" + (BankTransaction.recordNumber + 1) + "\n\n-----------------------");
            }

        //Asking the user if he would like to run this section again.

        System.out.println("\nWould you like to run this code again? (true/false)\n");
        boolean answer = sc.nextBoolean();

        //This section will run the code again, filling the 500 records, overriding them. 
        while (answer == true) 
        {
            //Resetting the counter for the records.
            BankTransaction.recordNumber = 0;

            for (int i = 0; i < 500; i++, BankTransaction.recordNumber++) 
            {
                mainArray[i] = new BankTransaction(true, 999.999, 12345, 948346355);

                System.out.println("\n" + mainArray[i].getCanadianFunds() + "\n" + mainArray[i].getExchangeRate() + "\n" + mainArray[i].getTransactionNumber() + "\n" + mainArray[i].getTranscationReferenceNumber() + "\n" + (BankTransaction.recordNumber + 1) + "\n\n-----------------------");
            }

            //Asking them once again, if they would like to keep running it. They can run it as many times as they wish.
            System.out.println("\nWould you like to run this code again? (true/false)\n");
            answer = sc.nextBoolean();
        }
    }
}
