/** Application Purpose: This is the test harness to for the movieticket *class.
*   Author: Alex Dorodko
*   Date: 25/OCT/2020 
*   Time: 04:13 PM
*/

import java.util.Scanner;

public class MovieTicketTestHarness 
{
    public static void main(String[] args) 
    {
        //Instigating the scanner and MovieTicket.
        Scanner sc = new Scanner(System.in);
        MovieTicket t1 = new MovieTicket();

        //Asking user for movie name
        System.out.println("Enter your ticket details below:\n\nEnter the movie name: ");
        t1.setMovieName(sc.nextLine());

        
        //asking user for ticket number
        System.out.println("\nEnter the ticket number: ");
sdf
g
sdfg


        
        //asking user for theatre number
        System.out.println("\nEnter the theatre number: ");
        t1.setTheatreNumber(sc.nextInt());



        //Outputting all the ticket information
        System.out.println("\nTicket Information\n\nMovie Name: " + t1.getMovieName() + "\nTicket Number: " + t1.getTicketNumber() + "\nTheatre Number: " + t1.getTheatreNumber() + "\nPrice: $" + t1.getTicketPrice() + "\nTax: $" + Math.round(t1.taxAmmount() * 100.0) / 100.0 + "\n");  

        //Asking the user for a movie name to see the showtimes
        System.out.println("Enter the movie name to see showtimes: ");
        sc.nextLine();
        t1.runDates(sc.nextLine());

        //Asking the user for a movie ticket to see the show times.
        System.out.println("\nEnter the ticket number to see showtimes (11-14): ");
        t1.runDates(sc.nextInt());
    }
}
