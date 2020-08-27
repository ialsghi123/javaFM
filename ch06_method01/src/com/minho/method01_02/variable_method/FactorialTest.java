package com.minho.method01_02.variable_method;

public class FactorialTest {

	public static void main(String[] args) {

		int result = factorial(4);

		System.out.println(result); // FactorialTest.factorial(4)
	}

	static int factorial(int n) {
		int result = 0;

		if (n == 1) {

			result = 1;
		} else {

			result = n * factorial(n - 1); // 메서드 자신을 호출한다.
		}

		return result;
	}

}
