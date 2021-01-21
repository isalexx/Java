/** Application Purpose: The main method for adding new airline customers using input as wellas other functions
*   Author: Alex Dorodko
*   Date: 13/OCT/2020 (Updated on 23/OCT/2020)
*   Time: 01:43 PM
*/

import java.util.Scanner;

public class AirlineReservationTestHarness 
{   
    public static void main(String[] args) 
    {   
        //Setting up the scanner to then intake input from the user.
        Scanner sc = new Scanner(System.in);

        //Creating and outputting first customer data
        AirlineReservation customer1 = new AirlineReservation("Mathias", "Eriksen", 24548, 2, 4534);

        System.out.println("Data for Customer #1:\n\nFirst Name: " + customer1.getFirstName() + "\nLast Name: " + customer1.getLastName() + "\nFlight Number: " + customer1.getFlightNumber() + "\nSeat Number: " + customer1.getSeatNumber() + "\nClass: " + customer1.getSeatingClass() + "\nTicket Number: " + customer1.getTicketNumber() + "\nNo Fly List: " + customer1.getNoflyCheck() + "\nObject String: " + customer1.getJointObjectString() + customer1.getSeatingClass() + customer1.getBigString() + "\n");
        
        //If customer is banned, print alert
        if (customer1.getNoflyCheck() == "9999")
        {   
            //Setting up the for loop in order to print alert 7 times
            for (int i = 0; i < 7; i++) 
            {   
                System.out.println("!! ALERT !!\n");
                //Throwing so much code at the computer that it takes around a second to proccess it.
                for (int j = 0; j < 99999; j++) 
                {
                    for (int j2 = 0; j2 < 29999; j2++)
                    {
                        for (int j3 = 0; j3 < 9999; j3++)
                        {
                            
                        }
                    }
                }
            }
        }
        //Creating the second customer data, and asking for input for each of the parameters

        AirlineReservation customer2 = new AirlineReservation();

        System.out.println("Hello, please enter the information for customer number #2 below:\n\nFirst Name: ");
        customer2.setFirstName(sc.nextLine());

        System.out.println("\nLast Name: ");
        customer2.setLastName(sc.nextLine());

        System.out.println("\nFlight Number: ");
        customer2.setFlightNumber(sc.nextInt());

        System.out.println("\nSeat Number: ");
        customer2.setSeatNumber(sc.nextInt());
        //Error proofing to make sure a correct seat number is entered.
        while (customer2.getSeatNumber() > 8 || customer2.getSeatNumber() < 1)
        {
            System.out.println("\nInvalid seat number. Seat Number (1-8): ");
            customer2.setSeatNumber(sc.nextInt());
        }

        System.out.println("\nTicket Number: ");
        customer2.setTicketNumber(sc.nextInt());

        //Outputting 2nd customer info
        System.out.println("\nData for Customer #2:\n\nFirst Name: " + customer2.getFirstName() + "\nLast Name: " + customer2.getLastName() + "\nFlight Number: " + customer2.getFlightNumber() + "\nSeat Number: " + customer2.getSeatNumber() + "\nClass: " + customer2.getSeatingClass() + "\nTicket Number: " + customer2.getTicketNumber() + "\nNo Fly List: " + customer2.getNoflyCheck() + "\n");

        //If customer is banned, print alert
        if (customer2.getNoflyCheck() == "9999")
        {   
            //Setting up the for loop in order to print alert 7 times
            for (int i = 0; i < 7; i++) 
            {   
                System.out.println("!! ALERT !!\n");
                //Throwing so much code at the computer that it takes around a second to proccess it.
                for (int j = 0; j < 99999; j++) 
                {
                    for (int j2 = 0; j2 < 29999; j2++)
                    {
                        for (int j3 = 0; j3 < 9999; j3++)
                        {
                            
                        }
                    }
                }
            }
        }
    }
}
