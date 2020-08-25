package com.minho.array;

public class ArrayEx07_X {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]=i);
		}
		
		System.out.println();
		
		for(int i=0; i<50; i++) {
			int n = (int)(Math.random()*10);
			int tmp = arr[0];
			arr[0]=arr[n];
			arr[n]=tmp;
			
		}
		
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]);
		}
		
		
	}

}
