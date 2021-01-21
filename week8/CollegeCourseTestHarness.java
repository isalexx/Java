/** Application Purpose: This is the test harness for the college course program, which prints out the records and writes them down.
*   Author: Alex Dorodko
*   Date: 11/NOV/2020 
*   Time: 01:28 AM
*/

import java.util.Random;
import java.util.Scanner;

public class CollegeCourseTestHarness 
{
    public static void main(String[] args) 
    {
        //Creating the array and initiating the scanner and random.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        CollegeCourse[][] courses = new CollegeCourse[200][10];

        try 
        {
            //filling the 1st 100 rows with college course objects in which the default values are 0s
            for (int i = 0; i < 100; i++) 
            {
                for (int j = 0; j < 10; j++) 
                {
                    courses[i][j] = new CollegeCourse(0, 0);
                }    
            }

            //filling the last 100 rows with college course objects in which the default values are 9999
            for (int i = 100; i < 200; i++) 
            {
                for (int j = 0; j < 10; j++) 
                {
                    courses[i][j] = new CollegeCourse(9999, 9999);
                }    
            }

            //Printing out each object's state with a message.
            for (int i = 0; i < 200; i++) 
            {
                for (int j = 0; j < 10; j++) 
                {
                    System.out.println("\n-------------------------\n\nCollege Course Information:\n\nCourse Reference Number: " + courses[i][j].getCourseReference() + "\nCourse Number: " + courses[i][j].getCourseNumber());
                }    
            }

            //Going through the array and setting the new values.
            for (int i = 0; i < 200; i++) 
            {
                for (int j = 0; j < 10; j++) 
                {   
                    //Creating the unique 7 digit number for each object using math.random.
                    courses[i][j].setCourseReference(random.nextInt(9999999 - 0) + 0);

                    //Choosing one of the 4 possible course numbers from an array and choosing them. Upon some research online, I found the following solution.
                    int[] coursesNum = new int[]{53635, 30538, 95743, 65932};
                    //Picking a random value based on the arrays length.
                    int randomN = new Random().nextInt(coursesNum.length);
                    
                    //Setting the new Course number.
                    courses[i][j].setCourseNumber(coursesNum[randomN]);
                }    
            }

            //Printing out each object's UPDATED state with a message.
            for (int i = 0; i < 200; i++) 
            {
                for (int j = 0; j < 10; j++) 
                {
                    System.out.println("\n-------------------------\n\nCollege Course Information:\n\nCourse Reference Number: " + courses[i][j].getCourseReference() + "\nCourse Number: " + courses[i][j].getCourseNumber());
                }    
            }

            //The following code takes in two values, one for the row and one for the collumn of the array.
            System.out.println("\nPlease provide a row for the course information tab you are looking for (0 - 199): ");
            int row = sc.nextInt();

            System.out.println("\nPlease provide a collumn for the course information tab you are looking for (0 - 9): ");
            int collumn = sc.nextInt();

            //This code prints out the specific object you want. 
            System.out.println("\n-------------------------\n\nRequested College Course Information:\n\nCourse Reference Number: " + courses[row][collumn].getCourseReference() + "\nCourse Number: " + courses[row][collumn].getCourseNumber());
        }

        //If the collumn and row entered are out of bounds of the array, the next exception is caught. We then ask for input again with an appropriate error message. 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("\nThe row and collumn you entered do not exist in the database. Please enter the correct values.");

            System.out.println("\nPlease provide a row for the course information tab you are looking for (0 - 199): ");
            int row = sc.nextInt();

            System.out.println("\nPlease provide a collumn for the course information tab you are looking for (0 - 9): ");
            int collumn = sc.nextInt();

            System.out.println("\n-------------------------\n\nRequested College Course Information:\n\nCourse Reference Number: " + courses[row][collumn].getCourseReference() + "\nCourse Number: " + courses[row][collumn].getCourseNumber());
        }
    }
}
