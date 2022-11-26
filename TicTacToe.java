/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author samestrada
 */
// stopping point 30:06
// https://www.youtube.com/watch?v=ROvAUVINlBE
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create board
        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};

        // print board
        printBoard(board);
        while (true) {
            // player takes turn
            playerMove(board, scanner);
            if (isGameFinished(board)) {
                break;
            }
            // print board
            printBoard(board);
            // computer takes turn
            computerTurn(board);
            if (isGameFinished(board)) {
                break;
            }
            // print board
            printBoard(board);
        }
        scanner.close();
    }

    private static boolean isGameFinished(char[][] board) {

        if (hasContestantWon(board, 'X')) {
            printBoard(board);
            System.out.println("Player wins!");
            return true;
        }

        if (hasContestantWon(board, 'O')) {
            printBoard(board);
            System.out.println("Computer wins!");
            return true;
        }

        for (char[] chars : board) {
            for (char aChar : chars) {
                if (aChar == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("The game ended in a tie!");
        return true;
    }


    private static boolean hasContestantWon(char[][] board, char symbol) {
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
           (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
           (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

           (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
           (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
           (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

           (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
           (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    private static void computerTurn(char[][] board) {
        Random rand = new Random();
        int computerMove;
        // check to see if the computer generated random number is a valid move
        while(true) {
            computerMove = rand.nextInt(9) + 1;
            if (isValidMove(board, Integer.toString(computerMove))) {
                break;
            }
        }
        System.out.println("Computer chose " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }

    private static boolean isValidMove(char[][] board, String position) {
        switch (position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }

    private static void playerMove(char[][] board, Scanner scanner) {
        String userInput;
        while (true) {
            System.out.print("Where would you like to play? (1 - 9): ");
            userInput = scanner.nextLine();
            if (isValidMove(board, userInput)) {
                break;
            } else {
                System.out.println(userInput + " is not a valid move");
            }
        }
        placeMove(board, userInput, 'X');
    }


    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[1][0] = symbol;
            case "5" -> board[1][1] = symbol;
            case "6" -> board[1][2] = symbol;
            case "7" -> board[2][0] = symbol;
            case "8" -> board[2][1] = symbol;
            case "9" -> board[2][2] = symbol;
            default -> System.out.println(" :-( ");
        }
    }

    // method to print the board (created using CTRL + M after the typed code via copy CTRL + M)
    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" +  board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" +  board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" +  board[2][2]);
    }
}
