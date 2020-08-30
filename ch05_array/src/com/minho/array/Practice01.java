package com.minho.array;

/*
*
번호 	국어 	  영어    수학    총점 	평균 
=============================
 1  100  100  100  300 100.0
 2   20   20   20   60  20.0
 3   30   30   30   90  30.0
 4   40   40   40  120  40.0
 5   50   50   50  150  50.0
=============================
총점:240  240  240

*/

public class Practice01 {

	public static void main(String[] args) {
		
		
		int[][] score = {
			{100,100,100},
			{20,20,20},
			{30,30,30},
			{40,40,40},
			{50,50,50}
			
		};
		
		System.out.println("번호   국어   영어   수학   총점   평균");
		System.out.println("==========================");
		
		int korScore=0;
		int engScore=0;
		int mathScore=0;
		
		int sum=0;
		float avg=0;
		
		
		
		
		
		
		System.out.println("==========================");
		System.out.println("총점:  "+korScore+"   "+engScore+"   "+mathScore);
	}

}
