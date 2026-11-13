package ticTacToeGame;

import java.util.Scanner;


public class TestTicTacToe {

    public static void main(String[] args) {

        // One Scanner for the whole game
        Scanner input = new Scanner(System.in);

        TicTacToe game = new TicTacToe();
        game.printBoard();

        // Keep playing until someone wins or the board is full
        while (!game.isGameOver()) {
            game.playerTurn(input);
        }

        if (game.hasWinner()) {
            System.out.println("The winner is player " + game.getCurrentPlayerSymbol());
        } else {
            System.out.println("The game is a draw.");
        }

        input.close();
    }
}