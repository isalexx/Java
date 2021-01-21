/** Application Purpose: This is the class which has state, setters & getters and 3 custom methods.
*   Author: Alex Dorodko
*   Date: 19/NOV/2020 
*   Time: 10:58 AM
*/

public class RealEstateTransaction 
{
    //The state
    private String streetNumber;
    private String streetName;
    private String city;
    private String purchasePrice;

    //Default constructor
    public RealEstateTransaction()
    {}

    //The main constructor. 
    public RealEstateTransaction(String streetNumber, String streetName, String city, String purchasePrice)
    {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.purchasePrice = purchasePrice;
    }

    //Setting up all the setters.
    public void setStreetNumber(String streetNumber)
    {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setPurchasePrice(String purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }


    //Set up the getters
    public String getStreetNumber()
    {
        return streetNumber;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getCity()
    {
        return city;
    }

    public String getPurchasePrice()
    {
        return purchasePrice;
    }


    //This is the method which returns half lowercase half uppercase letters.
    public String LowerAndUpper()
    {
        //Joining all the state together.
        String joint = streetNumber + streetName + city + purchasePrice;
        return joint.substring(0, joint.length() / 2).toLowerCase() + joint.substring(joint.length() / 2, joint.length()).toUpperCase();
    }

    //This is the second method which returns the 
    public String LowerAndUpperV2()
    {
        //Joining all the state together.
        String joint = streetNumber + streetName + city + purchasePrice;

        //Making the first random random number, which is between 0 and the highest index of the joint String. The (int) is there to make sure the value produced is an integer
        int random1 = (int)(Math.random() * (joint.length() - 0 + 1) + 0);

        //Making the second random number which is higher then the first random, but does not go higher then the highest index of the joint String.
        int random2 = (int)(Math.random() * (joint.length() - random1 + 1) + random1);

        //This is connecting both first part of the string which is lowercase, and the second part of the string which is uppercase. 
        return joint.substring(0, random1).toLowerCase() + joint.substring(random1, random2).toUpperCase();
    }

    //
    public String encryption(int keyCharacter, int indexValue)
    {
        //Joining all the state together.
        String joint = streetNumber + streetName + city + purchasePrice;
        
        //Getting the character which will replace the others.
        char letter = joint.charAt(keyCharacter);


        //Going through the string and replacing all the appropriate letters.
        for (int i = indexValue; i < joint.length(); i = i + indexValue) 
        {
            joint = joint.replace(joint.charAt(i), letter);
        }

        //returning the new string.
        return joint;
    }
}

 
