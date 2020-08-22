package com.minho.practice03_operator;

/*
 * 
 * [3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
 * 
 * 
 * [실행결과]
331
 */

public class Operator05_O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 333;
		System.out.println(num/10*10+1);

	}

}
