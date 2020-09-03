package com.minho.practice08_exception_handling;

/*
 * [8-6] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 * 
 * 2
 * 3
 * 4
 */

public class Exception06 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(5);
		}
	}

	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	} // method1()

	static void method2() {
		throw new NullPointerException();

	}

}
