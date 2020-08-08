package com.minho.practice06_method;

/*
 * 
 * [6-18] 다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그
		이유를 설명하시오.
 *  인스턴스 변수 iv를 클래스 변수 cv2에 넣을 수 없다 클래스 변수에서 인스턴스 변수에 넣는건 가능
 *  클래스 메소드에 속해있는 라인b에서 인스턴스 변수인 iv를 호출 할 수 없다
 *  라인d의 메소드는 클래스 메소드에서 인스턴스 메소드를 호출 할 수 없다 
 */

public class Method18 {

	public static void main(String[] args) {

	}
}

class MemberCall {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
//	static int cv2 = iv; // 라인 A
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); // 라인 B
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 라인 C
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // 라인 D
	}
	
	void instanceMethod2() {
		staticMethod1(); // 라인 E
		instanceMethod1();
		
	}
	
}