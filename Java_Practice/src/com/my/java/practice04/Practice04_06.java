package com.my.java.practice04;

public class Practice04_06 {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.println("6이 되는 경우의 수:(" + i + "," + j + ")" );
				}
			}
		}

		
	}

}
