package com.minho.practice05_array;

/*
 * 
 * [5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열
의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
에 알맞은 코드를 넣어서 완성하시오.
 * 
 * 
 * [실행결과]
100 100 100 300
20 20 20 60
30 30 30 90
40 40 40 120
50 50 50 150
240 240 240 720
 */

public class Array11_XXX {

	public static void main(String[] args) {

		int[][] score = {
				{ 100, 100, 100 },
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 },
				{ 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1]; //	result[5+1][3+1]
		for (int i = 0; i < score.length; i++) { //score.length = 5
			for (int j = 0; j < score[i].length; j++) { //score[i].length = 3 
				
				int x=0;
				int y=0;
				
				result[x][y]=score[i][j];
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		// main
	}

}
