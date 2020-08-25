package com.minho.array;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		int[] score = { 79, 88, 91, 33, 100, 55, 95}; 

		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다. 
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다. 

		
		for(int i=1; i<score.length; i++) {
			
			if(max<score[i]) {
				max=score[i];
			} else if(min>score[i]) {
				min=score[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
