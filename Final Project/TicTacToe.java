/** Application Purpose: This class shandles all of the interactions with the user.
*   Author: Alex Dorodko
*   Date: 05/DEC/2020
*   Time: 12:50 PM
*/

import java.util.*;
import java.util.Scanner;


public class TicTacToe
{
    
    public static void main(String[] args) 
    {
        //Initiating the userinput and board objects.
        UserInput input = new UserInput();
        Board board = new Board();

        //Starting a try/catch block to catch any exceptions, in addition to the one in the coreCode funtion.
        try 
        {
            //Introduction
            System.out.println("Hello, welcome to a game of Tic Tac Toe. Here, you can play the game with two players, each taking turns. \nThere will be player X, and player O. Player X goes first, so you can choose between each other who that is.\n");

            
            //Executing the main function which runs the game, and if at the end they would like to play again, the while loop executes again.
            do 
            {
                CoreFunctions.coreCode();

                input.playAgain();
            } 
            
            while (input.playAgainValue.equals("Y"));
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