package com.minho.practice02_variable;

public class Variable05_O {
	/*
	 * 
	 * [2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
		류’라고 적으시오.
	
	 * 
	 */
	
	public static void main(String[] args) {
	
		System.out.println("1" + "2"); // 12
		System.out.println(true + ""); // ture
		System.out.println('A'+ 'B'); // 131     ★큰따옴표 작은따옴표 구분해야함 ""=>문자열 ''=>문자 ★
		System.out.println('1' + 2); // 51
		System.out.println('1' + '2'); // 99
		System.out.println('J' + "ava"); //Java
//		System.out.println(true + null); 
//		System.out.println("A"+'B');
	}
}
