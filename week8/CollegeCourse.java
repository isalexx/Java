/** Application Purpose: This is the class for a College Course.
*   Author: Alex Dorodko
*   Date: 11/NOV/2020 
*   Time: 11:58 PM
*/

public class CollegeCourse 
{
    //State
    private int courseReference;
    private int courseNumber;

    //Default constructor
    public CollegeCourse()
    {}

    //Main constructor.
    public CollegeCourse( int courseReference, int courseNumber)
    {
        this.courseReference = courseReference;
        this.courseNumber = courseNumber;
    }


    //the setters.
    public void setCourseReference(int courseReference)
    {
        this.courseReference = courseReference;
    }

    public void setCourseNumber(int courseNumber)
    {
        this.courseNumber = courseNumber;
    }


    //The getters
    public int getCourseReference()
    {
        return courseReference;
    }

    public int getCourseNumber()
    {
        return courseNumber;
    }
}

