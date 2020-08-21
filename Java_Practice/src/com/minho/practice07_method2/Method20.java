package com.minho.practice07_method2;

/*
 * 
 * [7-20] 다음의 코드를 실행한 결과를 적으시오.
 * 
 */

public class Method20 {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x); //100
		p.method(); // "Child Method"
		System.out.println("c.x = " + c.x); //200
		c.method(); //"Child Method"
	}
}

class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}

}
