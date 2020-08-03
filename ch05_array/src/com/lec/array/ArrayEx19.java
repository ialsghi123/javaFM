package com.lec.array;

public class ArrayEx19 {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int x = 0, y = 0;

		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
		  //  1  2  3  4  5  6  7  8  9
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
			{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
			{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
			{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
			{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
			{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
		};

		for(int i=1; i<SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i+'0');
			
			System.out.println(board[i][0]);
		}
		
	}

}
