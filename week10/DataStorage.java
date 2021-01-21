/** Application Purpose: This class serves as a storage location for a different method.
*   Author: Alex Dorodko
*   Date: 29/NOV/2020 
*   Time: 02:00 PM
*/

public class DataStorage 
{
    //Initiating the varible which stores a substring
    private String substr = "";

    //Making a simple constructor
    public DataStorage(String substr)
    {
        this.substr = substr;
    }

    //Making a setter and getting to set and retrieve data.
    public void setSubstring(String substr)
    {
        this.substr = substr;
    }

    public String getSubstring()
    {
        return substr;
    }
}
