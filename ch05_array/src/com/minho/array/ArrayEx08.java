package com.minho.array;

/*
 * 
 * 로또 번호 생성
 * 
 */

public class ArrayEx08 {

	public static void main(String[] args) {

		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i]=i+1;
		}
		
		for(int i=0; i<6; i++) {
			
			int j=(int)(Math.random()*45);
			
			int tmp=ball[i];
			ball[i]=ball[j];
			ball[j]=tmp;
			
			
		}
		
		for(int i=0; i<6; i++) {
			System.out.println("ball["+i+"]:"+ball[i]);
		}
		
		
		
		
	}

}
