package com.minho.practice05_array;


/*
 * 
 * 
 * [5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
 * 
 */


public class Array03_O {

	public static void main(String[] args) {
		{
			int[] arr = {10, 20, 30, 40, 50};
			int sum = 0;
			/*
			(1) 알맞은 코드를 넣어 완성하시오.
			*/
			for(int i=0; i<arr.length; i++) {
				sum+=arr[i];
			}
			
			System.out.println("sum="+sum);
		}
	}

}
