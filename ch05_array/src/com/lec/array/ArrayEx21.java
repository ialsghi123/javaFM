package com.lec.array;

import java.util.Scanner;

public class ArrayEx21 {

	public static void main(String[] args) {
		
		final int SIZE=5;
		int x=0,y=0,num=0;
		
		int bingo[][] = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				bingo[i][j]=i*SIZE+j+1;
			}
		}
		
		for(int i=0; i<100; i++) {
//			for(int j=0;)
		}
	}

}
