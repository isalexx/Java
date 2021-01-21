/** Application Purpose: This class stores the core functions of the TicTacToe
*   Author: Alex Dorodko
*   Date: 05/DEC/2020 
*   Time: 03:00 PM
*/

import java.util.*;

public class CoreFunctions
{
    //This checks if the provided user won the game, or if its a tie.
    public static boolean winCheck(String board[][], boolean win, String ltr)
    {
        //bottom horizontal 1
        if (board[2][0] == ltr && board[2][1] == ltr && board[2][2] == ltr)
        {
            System.out.println("Player " + ltr + " won!");
            win = true;
            
        }

        //middle horizontal 2
        else if (board[1][0] == ltr && board[1][1] == ltr && board[1][2] == ltr)
        {
            System.out.println("Player " + ltr + " won!");
            win = true;
            
        }

        //top horizontal 3
        else if (board[0][0] == ltr && board[0][1] == ltr && board[0][2] == ltr)
        {
            System.out.println("Player " + ltr + " won!");
            win = true;
            
        }

        //vertical left 4 
        else if (board[0][0] == ltr && board[1][0] == ltr && board[2][0] == ltr)
        {
            System.out.println("Player " + ltr + " won!");
            win = true;
            
        }

        //vertical middle 5
        else if (board[0][1] == ltr && board[1][1] == ltr && board[2][1] == ltr)
        {
            System.out.println("Player " + ltr + " won!");
            win = true;
            
        }

        //vertical right 6
        else if (board[0][2] == ltr && board[1][2] == ltr && board[2][2] == ltr)
        {
            System.out.println("Player " + ltr + " won!");
            win = true;
            
        }

        //top left to bottom right 7
        else if (board[0][0] == ltr && board[1][1] == ltr && board[2][2] == ltr)
        {
            System.out.println("Player " + ltr + " won!");
            win = true;
            
        }

        //top right to bottom left 8
        else if (board[0][2] == ltr && board[1][1] == ltr && board[2][0] == ltr)
        {
            System.out.println("Player " + ltr + " won!");
            win = true;
            
        }

        //Checking if all the slots are filled up, and if there is no winner, it is a tie.
        int counter = 0;
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (board[i][j] != " ") 
                {
                    counter += 1;
                }
            }    
        }

        if (counter == 9)
        {
            System.out.println("Draw!");
            win = true;
        }

        return win;
    }

    public static void coreCode()
    {
        int row;
        int collumn;

        boolean win = false;
        Board board = new Board();
        UserInput input = new UserInput();

        try 
        {
            while (win == false)
            {
                //Outputting the board
                board.getBoard();

                //Stating the current player's turn.
                System.out.println("Current Turn: Player X");
                
                //requesting the coordinates where to put the letter
                
                //Asking for the row, and making sure the value is valid.
                row = input.rowRq();
                row = input.rowValueCheck(row);

                collumn = input.collumnRq();
                collumn = input.collumnValueCheck(collumn);

                //Checking if a letter is already positioned there
                input.positionCheck(row, collumn, board.getBoardValues());

                //Setting the new letter in the array of values
                board.setLetter(row, collumn, "X");
                    
                //Outputting the board
                board.getBoard();

                //Checking if the person won
                win = CoreFunctions.winCheck(board.getBoardValues(), win, "X");
                if (win == true)
                {
                    break;
                }
                    
                System.out.println("Current Turn: Player O");
                //requesting the coordinates where to put the letter
                
                //Asking for the row, and making sure the value is valid.
                row = input.rowRq();
                row = input.rowValueCheck(row);

                collumn = input.collumnRq();
                collumn = input.collumnValueCheck(collumn);

                //Checking if a letter is already positioned there
                input.positionCheck(row, collumn, board.getBoardValues());

                //Setting the new letter in the array of values
                board.setLetter(row, collumn, "O");

                //Outputting the board
                board.getBoard();

                //Checking if a person won. If one did, end the loop.
                win = CoreFunctions.winCheck(board.getBoardValues(), win, "O");
                if (win == true)
                {
                    break;
                }
            }
        }
        
        //If the user enters incorrect array index, prevents the program from crashing.
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("You have entered an invalid number for rows or collumns. Starting the game over.");
            CoreFunctions.coreCode();
        }

        //If the user inputs a char or string instead of an int, it also catches the exception.
        catch (InputMismatchException e)
        {
            System.out.println("You have entered a character instead of a number for row or collumns. Starting the game over.");
            CoreFunctions.coreCode();
        }
    }
}
