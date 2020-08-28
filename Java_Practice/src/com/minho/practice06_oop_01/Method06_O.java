package com.minho.practice06_oop_01;

/*
 * 
 * [6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오. [Hint] 제곱근 계산은 Math.sqrt(double a)를
 * 사용하면 된다.
 * 
 * 
 * [실행결과] 1.4142135623730951
 */
class Method06_O {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		double a=0;
		a=(x1-x)*(x1-x)+(y1-y)*(y1-y);
		
		return (double)Math.sqrt(a);
		
	}

	public static void main(String args[]) {

		System.out.println(getDistance(1, 1, 2, 2));

	}
}