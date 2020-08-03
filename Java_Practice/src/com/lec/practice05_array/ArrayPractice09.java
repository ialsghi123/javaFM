package com.lec.practice05_array;

/*
 * 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
 * 
 * [실행결과]
	**
	**
	*****
	*****
	
	****
	****
	**
	**
	**
 */
public class ArrayPractice09 {

	public static void main(String[] args) {
		char[][] star = { 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } };
		
		char[][] result = new char[star[0].length][star.length]; //4행 5열 => 5행 4열로 바꿈
		
		for (int i = 0; i < star.length; i++) {
			
			for (int j = 0; j < star[i].length; j++) {
				
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < star.length; i++) { //4행
			
			for (int j = 0; j < star[i].length; j++) { //5열
				
				char[][] temp = new char[10][10];
				
				temp[i][j]=star[i][j];
				result[i][j]=temp[i][j];
				
				
				
			}
		}
		for (int i = 0; i < result.length; i++) {
			
			for (int j = 0; j < result[i].length; j++) {
				
				System.out.print(result[i][j]);
			}
			
			System.out.println();

		}

	}

}
