package com.minho.array;

/*
 * 
1642131688
1421316688
1213146688
1121346688
1112346688

 * 
 */

public class ArrayEx10_X {

	public static void main(String[] args) {

		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			
			numArr[i]=(int)(Math.random()*10);
			System.out.print(numArr[i]);
			
		}
		
		System.out.println();
		
		for(int i=0; i<numArr.length-1; i++	) {
			
			if(numArr[i]>numArr[i+1]) {
				
				numArr[i+1]=numArr[i];
				
			}
			System.out.print(numArr[i]);
		}
	}
}
