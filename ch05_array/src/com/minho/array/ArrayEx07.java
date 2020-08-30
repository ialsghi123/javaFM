package com.minho.array;

/*
 * 
 * 0123456789
 * 5827164930
 * 
 */



public class ArrayEx07 {

	public static void main(String[] args) {
		

		int[] numArr=new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=i;
			System.out.print(numArr[i]);
		}
		
		for(int i=0; i<numArr.length; i++) {
			
			int tmp=0;
			int j=(int)(Math.random()*10);
			
			tmp=numArr[j];
			numArr[j]=numArr[i];
			numArr[i]=tmp;
			
			
		}
		
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}
		
		
		
	}

}
