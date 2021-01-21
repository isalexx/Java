/**
* Author: Alex Dorodko
* Date: 10/OCT/2020
* Time: 5:52 PM
* Application purpose: Testing out the student record class, and using input to fill a student record. 
 */

import java.util.Scanner;

public class StudentRecordTestHarness 

{
    public static void main(String[] args) 
    {      
        //Initiating the scanner to read user input
        Scanner sc = new Scanner(System.in);

        //Instigating the first record using random values for percentage and student number
        StudentRecord firstRecord = new StudentRecord("Johny", "Guitar", Math.random() * (10000 - 0 + 1) + 0, Math.random() * (100 - 0 + 1) + 0);

        //Outputting the first student record
        System.out.println("\nStudent Record #1\n\nFirst Name: " + firstRecord.getFirstName() + "\nLast Name: " + firstRecord.getLastName() + "\nStudent Number: " + Math.round(firstRecord.getStudentID()) + "\nPercent Grade: " + Math.round(firstRecord.getGradeCourseOne()) + "\nLetter Grade: " + firstRecord.gradeLetter() + "\n");
        
        //Outputting the number of vowels, but it will only count them if the name is less then 5 charactes long.
        System.out.println("The number of vowels in the first name is " + firstRecord.numberVowels() + ".\n");

        //Creating the second student record with no arguments.
        StudentRecord secondRecord = new StudentRecord();

        //Asking the user for the first name for the second record and storing it
        System.out.println("Creating the second record:\n\nEnter the first name: ");
        secondRecord.setFirstName(sc.nextLine());

        //Asking the user for the last name for the second record and storing it
        System.out.println("\nEnter the last name: ");
        secondRecord.setLastName(sc.nextLine());

        //Asking the user for the student number for the second record and storing it
        System.out.println("\nEnter the student number: ");
        secondRecord.setStudentID(sc.nextDouble());
        //Making sure the student number is between 1 and 10,000
        while (secondRecord.getStudentID() <= 0 || secondRecord.getStudentID() > 10000)
        {
            System.out.println("\nInvalid student number. Value must be between 1 - 10,000. Enter the student number: ");
            secondRecord.setStudentID(sc.nextDouble());
            
        }

        //Asking the user for the percent grade which the student recieved for the second record and storing it
        System.out.println("\nEnter the percent grade:");
        secondRecord.setGradeCourseOne(sc.nextDouble());
        //Making sure the input is between 0 and 100
        while (secondRecord.getGradeCourseOne() < 0 || secondRecord.getGradeCourseOne() > 100)
        {
            System.out.println("\nInvalid percent. Value must be between 0 and 100. Enter the percent grade:");
            secondRecord.setGradeCourseOne(sc.nextDouble());
        }

        //Outputting the second student record.
        System.out.println("\nStudent Record #2\n\nFirst Name: " + secondRecord.getFirstName() + "\nLast Name: " + secondRecord.getLastName() + "\nStudent Number: " + Math.round(secondRecord.getStudentID()) + "\nPercent Grade: " + Math.round(secondRecord.getGradeCourseOne()) + "\nLetter Grade: " + secondRecord.gradeLetter() + "\n");  
        
        System.out.println("The number of vowels in the first name is " + secondRecord.numberVowels() + ".\n");

        //3rd student record for the last challenge where we ask the user for 5 letter name, and print the number of vowels in the name along with other data

        //Creating the third student record with no arguments.
        StudentRecord thirdRecord = new StudentRecord();

        //Asking the user for the first name for the third record and storing it
        System.out.println("Creating the third record:\n\nEnter the first name which is 5 or less letters: ");
        //Need this following scanner to fix java skipping over the next important input request
        sc.nextLine();
        thirdRecord.setFirstName(sc.nextLine());
        while (thirdRecord.getFirstName().length() > 5)
        {
            System.out.println("Name is too long. Enter the first name which is 5 or less letters: ");
            thirdRecord.setFirstName(sc.nextLine());
        }

        //Asking the user for the last name for the third record and storing it
        System.out.println("\nEnter the last name: ");
        thirdRecord.setLastName(sc.nextLine());

        //Asking the user for the student number for the third record and storing it
        System.out.println("\nEnter the student number: ");
        thirdRecord.setStudentID(sc.nextDouble());
        //Making sure the student number is between 1 and 10,000
        while (thirdRecord.getStudentID() <= 0 || thirdRecord.getStudentID() > 10000)
        {
            System.out.println("\nInvalid student number. Value must be between 1 - 10,000. Enter the student number: ");
            thirdRecord.setStudentID(sc.nextDouble());
        }

        //Asking the user for the percent grade which the student recieved for the third record and storing it
        System.out.println("\nEnter the percent grade:");
        thirdRecord.setGradeCourseOne(sc.nextDouble());
        //Making sure the input is between 0 and 100
        while (thirdRecord.getGradeCourseOne() < 0 || thirdRecord.getGradeCourseOne() > 100)
        {
            System.out.println("\nInvalid percent. Value must be between 0 and 100. Enter the percent grade:");
            thirdRecord.setGradeCourseOne(sc.nextDouble());
        }

        //Outputting the third student record.
        System.out.println("\nStudent Record #2\n\nFirst Name: " + thirdRecord.getFirstName() + "\nNumber of vowels: " + thirdRecord.numberVowels() + "\nLast Name: " + thirdRecord.getLastName() + "\nStudent Number: " + Math.round(thirdRecord.getStudentID()) + "\nPercent Grade: " + Math.round(thirdRecord.getGradeCourseOne()) + "\nLetter Grade: " + thirdRecord.gradeLetter() + "\n");  
    }
}
