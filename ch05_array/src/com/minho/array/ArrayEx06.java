package com.minho.array;


/*
 * 최대값:
 * 최소값:
 * 
 */

public class ArrayEx06 {

	public static void main(String[] args) {
		
	
		int[] score = {99,11,5,51,98,29,45,39,78};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			
			int tmp=0;
			
			if(max<score[i]) {
				
				tmp=score[i];
				score[i]=max;
				max=tmp;
				
			} else if (min>score[i]) {
				
				tmp=score[i];
				score[i]=min;
				min=tmp;
				
			}			
			
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		

		
		
		
	}

}
