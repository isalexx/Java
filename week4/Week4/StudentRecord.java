/**
* Author: Alex Dorodko
* Date: 09/OCT/2020
* Time: 11:54 PM
* Application purpose: creating the StudentRecord blueprint for a college student record. 
 */
public class StudentRecord 
{
    private String firstName;
    private String lastName;
    private double studentID;
    private double gradeCourseOne;
    private char letter;

    //Constuctor with no arguments.
    public StudentRecord()
    {}

    //Constructor with 4 arguments.
    public StudentRecord(String firstName, String lastName, double studentID, double gradeCourseOne)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.gradeCourseOne = gradeCourseOne;
    }
    
    //Setting up the setters.
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setStudentID(double studentID)
    {
        this.studentID = studentID;
    }

    public void setGradeCourseOne(double gradeCourseOne)
    {
        this.gradeCourseOne = gradeCourseOne;
    }

    
    //Setting up the setters.
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    //Method within a getter which returns a letter based on grade
    public double getStudentID()
    {
        return studentID;
    }

    public double getGradeCourseOne()
    {
        return gradeCourseOne;
    }

   	public char gradeLetter()
    {
        if (gradeCourseOne < 50) 
        {
            letter = 'F';
        }

        else if (gradeCourseOne >= 50 && gradeCourseOne <= 59)
        {
            letter = 'E';
        }

        else if (gradeCourseOne >= 60 && gradeCourseOne <= 69)
        {
            letter = 'D';
        }

        else if (gradeCourseOne >= 70 && gradeCourseOne <= 79)
        {
            letter = 'C';
        }

        else if (gradeCourseOne >= 80 && gradeCourseOne <= 89)
        {
            letter = 'B';
        }

        else if (gradeCourseOne >= 90 && gradeCourseOne <= 100)
        {
            letter = 'A';
        }

        return letter;
    }


    //Making the vowel counter as a setter.
    public int numberVowels()
    {   
        //Initiating the variables needed.
        String name = firstName.toLowerCase();
        int vowels = 0;

        //Checking if name is less or equal to 5 letters
        if (firstName.length() <= 5)
        {   
            //loops through each letter checking if its a vowel, then adding to the counter if it is.
            for (int i = 0; i <  firstName.length(); i++) 
            {
                if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'y')
                {   
                    vowels = vowels + 1;
                }
            }
        }
        return vowels;
    }
}