package com.lec.array;

public class ArrayEx18 {

	public static void main(String[] args) {
		
		int[][] score = new int[][] {{100,100,100},
									{20,20,20},
									{30,30,30},
									{40,40,40}}; //4За 3ї­
				
		int sum=0;
									
		for(int i=0; i<score.length; i++) {
			
			for(int j=0; j<score.length-1; j++) {
				
				System.out.println("score["+i+"]["+j+"]"+score[i][j]);
				sum+=score[i][j];
			}
		}
		System.out.println("sum:"+sum);
		
		for(int[] tmp:score) {
			for(int i:tmp) {
				sum+=i;
			}
		}
		
		System.out.println("sum:"+sum);
	}

}
