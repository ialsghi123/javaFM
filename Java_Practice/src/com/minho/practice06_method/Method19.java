package com.minho.practice06_method;

/*
 * [6-19] 다음 코드의 실행 결과를 예측하여 적으시오.
 * 
 * 
 */

public class Method19 {

	public static void change(String str) {
		str += "456";
//		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:" + str);
	}
}