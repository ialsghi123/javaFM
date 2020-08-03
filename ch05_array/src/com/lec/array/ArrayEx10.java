package com.lec.array;

/*
 * 
1642131688
1421316688
1213146688
1121346688
1112346688

 * 
 */

public class ArrayEx10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];

		int tmp=0;
		
		for (int i=0; i < numArr.length ; i++ ) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		 
		for(int i=0; i<numArr.length-i+1; i++) {
			
			if(numArr[i]>numArr[i+1]) { 
				tmp=numArr[i];
				numArr[i]=numArr[i+1];
				numArr[i+1]=tmp;
			}
		
			
			
		}
		
		System.out.println();
		for(int i=0; i<numArr.length; i++) {
			
			System.out.print(numArr[i]);
		}
		
	
		
	}

}
