package com.minho.exception_handling;

public class ExceptionEx02 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;

		for(int i=0; i < 10; i++) {
		
			try {
					result = number / (int)(Math.random() * 10); // 7번째 라인
					System.out.println(result);
				
				
			} catch(ArithmeticException e) {
				System.out.println("0");
			}
			
		}
	}

}
