package com.minho.method01_02.variable_method;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
		

	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
