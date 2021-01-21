/** Application Purpose: This class stores all varibales and methods related to the TicTacToe board.
*   Author: Alex Dorodko
*   Date: 06/DEC/2020 
*   Time: 10:49 PM
*/

import java.util.Scanner;

public class Board 
{
    //Creating the board array
    private String[][] board = { {" ", " ", " "},
                             {" ", " ", " "},
                             {" ", " ", " "} };

    //This is the method to retrieve the board, formatted with values.
    public void getBoard()
    {
        System.out.println("    1     2     3" + 
                             "\n1   " + board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2] + "  " + 
                             "\n  -----|-----|-----" +
                             "\n2   " + board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2] + "  " +
                             "\n  -----|-----|-----" +
                             "\n3   " + board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2] + "  \n");
    }

    //This is a method to set a value of the board.
    public void setLetter(int row, int collumn, String ltr)
    {
        this.board[row - 1][collumn - 1] = ltr;
    }

    //This is the method to get the board values raw, without formatting.
    public String[][] getBoardValues()
    {
        return board;
    }

}
