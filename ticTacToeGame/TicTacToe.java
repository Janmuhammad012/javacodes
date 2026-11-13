package ticTacToeGame;

import java.util.Scanner;


public class TicTacToe {

    // Constants: values used to mark a cell as taken
    private static final int PLAYER_O = 0;
    private static final int PLAYER_X = -1;

    // 3x3 board
    private int[][] board = new int[3][3];

    private boolean hasWin;     // becomes true when someone wins
    private int currentPlayer;  // PLAYER_O or PLAYER_X
    private int movesPlayed;    // counts moves, used to detect a draw

    // Constructor: fills the board with 1 to 9 and sets the starting state
    public TicTacToe() {
        hasWin = false;
        currentPlayer = PLAYER_O;
        movesPlayed = 0;

        int number = 1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = number;
                number++;
            }
        }
    }

    // Converts a cell value to what the player should see: O, X or the number
    private String symbolOf(int value) {
        if (value == PLAYER_O) {
            return "O";
        } else if (value == PLAYER_X) {
            return "X";
        }
        return String.valueOf(value);
    }

    // Prints the board
    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println("-------------");
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf(" %s |", symbolOf(board[i][j]));
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    // Plays one turn of the current player.
    // The Scanner is created once in main and passed here.
    public void playerTurn(Scanner input) {
        System.out.println("Turn of player " + symbolOf(currentPlayer));
        System.out.println("Enter position (1-9):");

        // If the user types text instead of a number, skip it and ask again
        if (!input.hasNextInt()) {
            input.next();
            System.out.println("Invalid input. Please enter a number.");
            return;
        }

        int position = input.nextInt();

        // Position must be between 1 and 9
        if (position < 1 || position > 9) {
            System.out.println("Invalid position. Choose a number from 1 to 9.");
            return;
        }

        // Convert the position (1-9) into row and column (0-2)
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        // A cell holding 0 or -1 is already taken
        if (board[row][col] == PLAYER_O || board[row][col] == PLAYER_X) {
            System.out.println("That cell is already taken.");
            return;
        }

        // Valid move: mark the cell, count the move and check for a winner
        board[row][col] = currentPlayer;
        movesPlayed++;
        this.checkWinner();
        this.printBoard();

        // Switch the turn only if the game is not finished
        if (!hasWin) {
            currentPlayer = (currentPlayer == PLAYER_O) ? PLAYER_X : PLAYER_O;
        }
    }

    // Checks all 8 winning lines: 3 rows, 3 columns and 2 diagonals.
    // Free cells hold different numbers (1-9), so three equal cells
    // in a line always belong to the same player.
    public void checkWinner() {
        for (int i = 0; i < 3; i++) {
            // Row i
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                hasWin = true;
            }
            // Column i
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                hasWin = true;
            }
        }

        // Main diagonal
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            hasWin = true;
        }
        // Other diagonal
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            hasWin = true;
        }
    }

    // True if a player has won
    public boolean hasWinner() {
        return this.hasWin;
    }

    // True if the game has ended, either by a win or because the board is full
    public boolean isGameOver() {
        return hasWin || movesPlayed == 9;
    }

    // Symbol of the current player (after a win, this is the winner)
    public String getCurrentPlayerSymbol() {
        return symbolOf(currentPlayer);
    }
}