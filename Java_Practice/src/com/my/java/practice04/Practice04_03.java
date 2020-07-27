package com.my.java.practice04;

/*
 * 
 * 1+(1+2)+(1+2+3)+...(1+2+3+...+10) 의 결과를 계산하시오
 * 
 */

public class Practice04_03 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				
				sum+=j;
				System.out.println(sum);
			}
		}
		System.out.printf("총합:%d",sum);

	}

}
