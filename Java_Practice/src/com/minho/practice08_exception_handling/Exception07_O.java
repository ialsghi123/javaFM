package com.minho.practice08_exception_handling;

/*
 * [8-7] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 * 
 * 
 * 1
 * 5
 * 1
 * 2
 * 5
 * 6
 * 
 * 
 */

public class Exception07_O {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				System.exit(0);
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		method(false);
	}

}
