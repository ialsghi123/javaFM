package com.minho.practice05_array;

/*
 * total=325
average=16.25
 * 
 */
public class ArrayPractice04 {

	public static void main(String[] args) {
		
		int[][] arr = { 
				{ 5, 5, 5, 5, 5 }, 
				{ 10, 10, 10, 10, 10 },
				{ 20, 20, 20, 20, 20 }, 
				{ 30, 30, 30, 30, 30 } };
		int total = 0;
		float average = 0;
		
		for(int i=0; i<arr.length; i++) { //4행 
			for(int j=0; j<arr[0].length; j++) {
//				System.out.print(arr[i][j]+" ");
				total+=arr[i][j];
			}
//			System.out.println();
		}
		average=(float)total/(arr.length*arr[0].length);

		
		System.out.println("total=" + total);
		System.out.println("average=" + average);

	}

}
