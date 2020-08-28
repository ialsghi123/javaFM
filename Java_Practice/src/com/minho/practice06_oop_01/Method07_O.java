package com.minho.practice06_oop_01;

/*
 * 
 * [6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
드로 정의하시오.
 * 
 * [실행결과]
1.4142135623730951
 */

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*
	 * (1) 인스턴스메서드 getDistance를 작성하시오.
	 */
	
	double getDistance(int x1, int y1) {
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		double a=0;
		a=(x1-x)*(x1-x)+(y1-y)*(y1-y);
		
		return (double)Math.sqrt(a);
		
	}
	
	
}

public class Method07_O {

	public static void main(String[] args) {

		MyPoint p = new MyPoint(1, 1);
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}

}
