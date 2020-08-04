package com.minho.practice05_array;

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
		char[][] result = new char[star[0].length][star.length];
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) { //[0][0] -> [0][3] / [0][1] -> [1][3]  / [0][2] -> [2][3]....
													   // [1][0] ->[0][2] / [1][1] -> [1][2] 
				
				int x = j;
				int y = star.length-1-i;
				result[x][y]=star[i][j];
				/*
				 * (1) . 알맞은 코드를 넣어 완성하시오
				 */

				
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
