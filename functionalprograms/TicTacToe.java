package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class TicTacToe {
		static final int EMPTY = 0;
		 static final int NONE = 0;
	    static final int USER = 1;
	    static final int COMPUTER = 2;
	    public static void main(String[] args) {
	    	// Data objects
		// 1 = user, 2 = computer
		int turn = USER;

		// We will represent the board as nine cells 
	        // 0 = empty, 1 = user, 2 = computer
		int[][] board = new int[3][3];

		// move: 1-9 representing ul through lr
		int move;

		// winner: 0 = none, 1 = user, 2 = computer, 3 = stalemate
		int winner;

		// Print Instructions
	        System.out.println("This is a tic-tac-toe game");
		System.out.println("You are playing against the computer!");
		System.out.println("Enter 1-9 to indicate your move");

		// Print the board
		print_board(board);

		// While (game not over)
		while(true) {
		    if(turn == USER) {
			System.out.println("Your move");
			move = -1;
			while (move<0 || move>9 || board[move/3][move%3] != EMPTY) {
			    
			   System.out.println("Please enter your move(0-9): ");
			   move=FunctionalLogic.getInt();
			    //move = system.in.readInt();
			   // Console.in.readChar();
			}
		    } else {
			move = FunctionalLogic.computer_move(board);
			System.out.println("Computer move: " + move);
		    }

		    // Update the board
		    board[(int)(move/3)][move%3] = turn;

		    // Print the board
		    print_board(board);

		    // if game is over
		    winner = FunctionalLogic.checkWinner(board);

		    if(winner != NONE)
			break;

		    // switch turn
		    if(turn == USER) {
			turn = COMPUTER;
		    } else {
			turn = USER;
		    }

		}

		// Print out the outcome
		switch(winner) {
		case USER:
		    System.out.println("You won!");
		    break;
		case COMPUTER: 
		    System.out.println("Computer won!");
		    break;
		default:
		    System.out.println("Tie!");
		    break;
		}
	    }// Print the board
	    public static void print_board(int[][] board) {
		System.out.print(FunctionalLogic.printChar(board[0][0]));
		System.out.print("|");
		System.out.print(FunctionalLogic.printChar(board[0][1]));
		System.out.print("|");
		System.out.println(FunctionalLogic.printChar(board[0][2]));
		System.out.println("-----");
		System.out.print(FunctionalLogic.printChar(board[1][0]));
		System.out.print("|");
		System.out.print(FunctionalLogic.printChar(board[1][1]));
		System.out.print("|");
		System.out.println(FunctionalLogic.printChar(board[1][2]));
		System.out.println("-----");
		System.out.print(FunctionalLogic.printChar(board[2][0]));
		System.out.print("|");
		System.out.print(FunctionalLogic.printChar(board[2][1]));
		System.out.print("|");
		System.out.println(FunctionalLogic.printChar(board[2][2]));
	    }

	    // Return an X or O, depending upon whose move it was
	    


	}