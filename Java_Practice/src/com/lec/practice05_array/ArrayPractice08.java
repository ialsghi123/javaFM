package com.lec.practice05_array;

/*
 * 
 * [5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
 
 *[실행결과]
	3***
	2**
	2**
	4****
 */
public class ArrayPractice08 {

	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		for (int i = 0; i < answer.length; i++) {
			
				//answer 각 요소의 개수를 체크
				counter[answer[i]-1]++;
			
			 }
		for (int i = 0; i < counter.length; i++) {
			
			System.out.println(counter[i]+"*");
			
			System.out.println();
		}

	}

}