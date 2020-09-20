package com.minho.practice09_java.lang_package;

/*
 * [9-7] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
메서드명 : contains
기 능 : 첫 번째 문자열(src)에 두 번째 문자열(target)이 포함되어 있는지 확인한다.
포함되어 있으면 true, 그렇지 않으면 false를 반환한다.
반환타입 : boolean
매개변수 : String src
String target
[Hint] String클래스의 indexOf()를 사용할 것
 * 
[실행결과]
true
false
 */

public class Package07 {
	
	/*
	(1) contains메서드를 작성하시오.
	*/
	
	static boolean contains(String src,String target) {
		
		int i = src.indexOf(target,0);
		
		System.out.println(i);
		
		if(0<i && i<9) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));

	}

}
