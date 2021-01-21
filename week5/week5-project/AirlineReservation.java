/** Application Purpose: This is the blueprint for a flight customer's data.
*   Author: Alex Dorodko
*   Date: 13/OCT/2020 (Updated on 23/OCT/2020)
*   Time: 01:41 PM
*/

public class AirlineReservation 
{
    //Initiating all the variables
    private String firstName;
    private String lastName;
    private int flightNumber;
    private int seatNumber;
    private int ticketNumber;

    public AirlineReservation()
    {}
    
    //Constructor
    public AirlineReservation(String firstName, String lastName, int flightNumber, int seatNumber, int ticketNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.ticketNumber = ticketNumber;
    }

    //Setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public void setSeatNumber(int seatNumber)
    {
        this.seatNumber = seatNumber;
    }

    public void setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }

    //getters

    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }

    public int getFlightNumber()
    {
        return flightNumber;
    }

    public int getSeatNumber()
    {
        return seatNumber;
    }

    public int getTicketNumber()
    {
        return ticketNumber;
    }

    //Getting the seating class back depending on the seat #
    public String getSeatingClass()
    {   
        String seatingClass = "";
        switch(seatNumber)
        {
            case 1:
            case 2:
                seatingClass = "First Class";
                break;
            case 3:
            case 4:
                seatingClass = "Second Class";
                break;
            case 5:
            case 6:
                seatingClass = "Third Class";
                break;
            case 7:
            case 8:
                seatingClass = "Fourth Class";
                break;
        }
        return seatingClass;
    }

    //If an induvidual is on the fly list the program will alert us.
    public String getNoflyCheck()
    {   
        String noflyCheck;
        String fullName = firstName + " " + lastName;

        switch(fullName.toUpperCase())
        {
            case "JACK BLUE":
                noflyCheck = "9999";
                break;
            
            case "JACK GREEN":
                noflyCheck = "9999";
                break;
            
            case "JILL WHITE":
                noflyCheck = "9999";
                break;
            default:
                noflyCheck = "CLEAR";
                break;
        }
        return noflyCheck;
    }

    //Challenge 3

    public String getJointObjectString()
    {
        String joined = firstName + lastName + String.valueOf(seatNumber) + String.valueOf(ticketNumber) + String.valueOf(flightNumber);

        return joined;
    }

    public String getBigString()
    {
        String joined = firstName + lastName + String.valueOf(seatNumber) + String.valueOf(ticketNumber) + String.valueOf(flightNumber);
        
        //Turning the joint string to upper case
        joined = joined.toUpperCase();
        
        //getting the first and last number of ticket number
        String first =  String.valueOf(flightNumber).substring(0, 1);
        String last = String.valueOf(flightNumber).substring(String.valueOf(flightNumber).length() - 1, String.valueOf(flightNumber).length());

        //Returning the partial string of the joint string
        String result = joined.substring(Integer.parseInt(first), Integer.parseInt(last));
        
        return result;
    }
}