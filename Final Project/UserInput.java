/** Application Purpose: This class shandles all of the interactions with the user.
*   Author: Alex Dorodko
*   Date: 06/DEC/2020
*   Time: 12:35 AM
*/

import java.util.Scanner;

public class UserInput
{
    //This is all of my private variables.
    private Scanner sc = new Scanner(System.in);
    private Board board = new Board();
    private int round = 1;
    private int newRow;
    private int newCollumn; 

    //Static varible so i can retrieve the data directly in a different class.
    public static String playAgainValue = " ";

    //Method for asking for the row.
    public int rowRq()
    {
        System.out.println("\nEnter the row where you would like to place the letter: ");
        return sc.nextInt();
    }

    //Method for asking for the collumn.
    public int collumnRq()
    {
        System.out.println("Enter the collumn where you would like to place the letter: ");
        return sc.nextInt();
    }

    //Method for checking if the row value is valid (between 1-3), if not, ask for it again.
    public int rowValueCheck(int row)
    {
        newRow = row;
        while (newRow > 3 || 0 >= newRow)
        {
            System.out.println("This number is not betweeen 1-3. Enter the row where you would like to place the letter: ");
            newRow = sc.nextInt();
        }

        return newRow;
    }

    //Method for checking if the collumn value is valid (between 1-3), if not, ask for it again.
    public int collumnValueCheck(int collumn)
    {
        newCollumn = collumn;
        while (newCollumn > 3 || 0 >= newCollumn)
        {
            System.out.println("This number is not betweeen 1-3. Enter the collumn where you would like to place the letter: ");
            newCollumn = sc.nextInt();
        }

        return newCollumn;
    }

    //This is a method to prevent the user from being able to place a letter o nthe board where a letter is already applied.
    public void positionCheck(int row,int collumn, String board[][])
    {
        while (board[row - 1][collumn - 1] != " ")
        {
            System.out.println("A letter is already placed here, try another location. Enter the row where you would like to place the letter: ");
            row = sc.nextInt();

            System.out.println("Enter the collumn where you would like to place the letter: ");
            collumn = sc.nextInt();
        }
    }

    //This is a method to ask the user if he/she would like to play again.
    public void playAgain()
    {
        System.out.println("\nWould you like to play again? (Y/N)");
        playAgainValue = sc.nextLine().toUpperCase();

        while (playAgainValue.equals("Y") != true && playAgainValue.equals("N") != true)
        {
            System.out.println("Invalid Answer. Would you like to play again? (Y/N)");
            playAgainValue = sc.nextLine().toUpperCase();
        }

        if (playAgainValue.equals("Y"))
        {
            round += 1;
            System.out.println("----- Round " + round +" -----");
        }

        else if (playAgainValue.equals("N"))
        {
            System.out.println("\nHope you had a good time, goodbye!");
        }
    }
}
