package com.minho.array;

public class ArrayEx11 {

	public static void main(String[] args) {

		int[] numArr = new int[10];
		int[] count= new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=(int)(Math.random()*10);
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			
			
			count[numArr[i]]++;
			
			
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"의 개수:"+count[i]);
			
		}
	}

}
