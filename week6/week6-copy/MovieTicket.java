/** Application Purpose: This is the blueprint for a movie ticket
*   Author: Alex Dorodko
*   Date: 25/OCT/2020 
*   Time: 12:33 PM
*/

public class MovieTicket 
{
    //Variables
    private String movieName;
    private int ticketNumber;
    private double ticketPrice = 14.99;
    private int theatreNumber;
    private double tax;

    //Default constructor
    public MovieTicket()
    {}

    //Constructor.
    public MovieTicket(String movieName, int ticketNumber, int theatreNumber)
    {
        this.movieName = movieName;
        this.ticketNumber = ticketNumber;
        this.theatreNumber = theatreNumber;
    }

    //Creating the setters for each instance variable, except ticketprice

    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }

    public void setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }

    public void setTheatreNumber(int theatreNumber)
    {
        this.theatreNumber = theatreNumber;
    }

    public String getMovieName()
    {
        return movieName;
    }

    public int getTicketNumber()
    {
        return ticketNumber;
    }

    public int getTheatreNumber()
    {
        return theatreNumber;
    }

    public double getTicketPrice()
    {
        return ticketPrice;
    }
    
    //Creating the tax ammount return
    public double taxAmmount()
    {
        tax = ticketPrice * 0.13;
        return tax;
    }

    //Creating the two static overloaded methods
    //This method takes in the movie name
    public void runDates(String movieName)
    {
        switch (movieName) 
        {
            case "Tenet":
                System.out.println("\nToday's showing times for Tenet:\n09:30 AM, 01:00 PM, 08:45 PM");
                break;
            
            case "Batman":
                System.out.println("\nToday's showing times for Batman:\n10:30 AM, 12:15 PM, 09:15 PM");
                break;
            
            case "Your Name":
                System.out.println("\nToday's showing times for Your Name:\n10:15 AM, 5:15 PM, 11:30 PM");
                break;
            case "Fast and Furious":
                System.out.println("\nToday's showing times for Fast and Furious:\n11:30 AM, 6:45 PM, 10:00 PM");
                break;

            default:
                System.out.println("\nThere are no showing times for this movie today.");
                break;
        }
    }

    //This method will take in the ticket number, and if it is one of the four, it will return the show times for the movie.
    public void runDates(int ticketNumber)
    {
        switch (ticketNumber) 
        {
            case 0011:
                System.out.println("\nYour ticket is for the movie Tenet. Today's showing times for Tenet are:\n09:30 AM, 01:00 PM, 08:45 PM");
                break;
            
            case 0012:
                System.out.println("\nYour ticket is for the movie Batman. Today's showing times for Batman are:\n10:30 AM, 12:15 PM, 09:15 PM");
                break;
            
            case 0013:
                System.out.println("\nYour ticket is for the movie Your Name. Today's showing times for Your Name are:\n10:15 AM, 5:15 PM, 11:30 PM");
                break;

            case 0014:
                System.out.println("\nYour ticket is for the movie Fast and Furious. Today's showing times for Fast and Furious are:\n11:30 AM, 6:45 PM, 10:00 PM");
                break;

            default:
                System.out.println("\nInvalid ticket number.");
                break;
        }
    }
}
